package springjdbc.dao.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import springjdbc.DVDInfo;
import springjdbc.dao.DAOException;
import springjdbc.dao.DVDInfoDAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class DVDInfoDAOImpl extends JdbcDaoSupport implements DVDInfoDAO {
    private List<DVDInfo> execute(String sql, Object[] args) {
        final List<DVDInfo> result = new ArrayList<DVDInfo>();

        //obtain the Template
        JdbcTemplate template = getJdbcTemplate();
        
        //Execute the sql statement, using a RowCallbackHandler to obtain the results
        template.query( sql, args,
        	new RowCallbackHandler() {
        		public void processRow(ResultSet rs) throws SQLException {
        			result.add( populate(rs) );
        		}
        	}
        );

        return Collections.unmodifiableList(result);
    }

    public DVDInfo getDVDByID(String id) {
        String sql = "SELECT * FROM DVD AS d, DVDTITLE AS t WHERE DVD_TITLE_ID=? AND d.DVD_TITLE_ID = t.DVD_TITLE_ID";
        Object[] args = new Object[]{id};
        List<DVDInfo> result = execute(sql, args);
        if (result.size() == 1) {
            return result.get(0);
        }
        throw new DAOException(result.size() + " entries found when searching for DVD_Title_ID " + id);
    }

    public List<DVDInfo> getDVDsByLocationID(String locationID) {
        String sql = "SELECT * FROM DVD AS d, DVDTITLE AS t WHERE LOCATION_ID=? AND d.DVD_TITLE_ID = t.DVD_TITLE_ID";
        Object[] args = new Object[]{locationID};
        return execute(sql, args);
    }


    public List<DVDInfo> searchDVDs(String title, String locationID) {
        String sql = "SELECT * FROM DVD AS d, DVDTITLE AS t WHERE t.TITLE LIKE '%" + title + "%' AND d.DVD_TITLE_ID = t.DVD_TITLE_ID AND d.LOCATION_ID=?";
        Object[] args = new Object[]{locationID};
        return execute(sql, args);
    }


    private DVDInfo populate(ResultSet rs) throws SQLException {
        DVDInfo info = new DVDInfo();
        info.setDirector(rs.getString("DIRECTOR"));
        info.setEncoding(rs.getString("ENCODING"));
        info.setFormat(rs.getString("FORMAT"));
        info.setId(rs.getString("DVD_TITLE_ID"));
        info.setLocationID(rs.getString("LOCATION_ID"));
        info.setRated(rs.getString("RATED"));
        info.setStarring(rs.getString("STARRING"));
        info.setStudio(rs.getString("STUDIO"));
        info.setTitle(rs.getString("TITLE"));
        info.setYearMonthRelease(rs.getString("YEARMONTH_RELEASE"));
        return info;
    }
}
