package springjdbc.dao.jdbc;

import org.springframework.dao.DataAccessException;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import springjdbc.dao.DAOException;
import springjdbc.dao.DVDLocationDAO;



public class DVDLocationDAOImpl extends JdbcDaoSupport implements DVDLocationDAO {

    public String getDVDId(String dvdTitleID, String locationID) {
        String sql = "SELECT DVDCODE FROM DVD WHERE DVD_TITLE_ID=? AND LOCATION_ID=?";
        //Obtain the template
        JdbcTemplate template = getJdbcTemplate();
        
        Object[] args = new Object[] {dvdTitleID, locationID};
        
        //Execute the sql statement. Notice that this sql statement returns a single Object of type String.
        //Catch the exception that might be thrown by this method invocation to check if only one (and just one) row was returned
        //Rethrow exception as a DAOException
        String dvdID = null;
        
        try {
			dvdID = (String)template.queryForObject(sql, args, String.class);
		} catch (IncorrectResultSizeDataAccessException e) {
			// TODO Auto-generated catch block
			if( e.getActualSize() == 0 ) {
				throw new DAOException("No records found when trying to obtain DVDID");
			}
			
			throw new DAOException("Multiple records found when trying to obtain DVDID");
		}

        return dvdID;
    }


}
