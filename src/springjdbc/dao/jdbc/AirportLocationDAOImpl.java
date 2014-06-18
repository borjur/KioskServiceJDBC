package springjdbc.dao.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import springjdbc.AirportLocation;
import springjdbc.dao.AirportLocationDAO;
import springjdbc.dao.DAOException;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class AirportLocationDAOImpl extends JdbcDaoSupport implements AirportLocationDAO {

    public List<AirportLocation> getLocations() {
        String sql = "SELECT * FROM AIRPORT_LOCATIONS";
        final List<AirportLocation> result = new ArrayList<AirportLocation>();
        //Obtain the JdbcTemplate
        JdbcTemplate template = getJdbcTemplate();
        
        //Execute the sql statement, using a RowCallbackHandler to obtain the results.
        template.query(sql,
        	new RowCallbackHandler() {
        		public void processRow(ResultSet rs) throws SQLException {
        			AirportLocation loc = populate(rs);
        			result.add(loc);
        		}
        	}
        );



        return Collections.unmodifiableList(result);
    }

    public AirportLocation getLocationByID(String id) {
        String sql = "SELECT * FROM AIRPORT_LOCATIONS WHERE LOCATION_ID=?";
        Object[] args = new Object[]{id};
        List<AirportLocation> locations = null;
        //Obtain the JdbcTemplate
        JdbcTemplate template = getJdbcTemplate();
        
        //Execute the sql statement, using a RowMapper to obtain the results.
        locations = template.query(sql, args, 
        	new RowMapper() {
        		public Object mapRow(ResultSet rs, int i) throws SQLException {
        			return populate(rs);
        		}
        	}
        );



        if (locations.size() > 1) {
            throw new DAOException("Multiple Locations found for LocationID " + id);

        }
        if (locations.size() == 0) {
            throw new DAOException("No Locations found for LocationID " + id);

        }
        return locations.get(0);
    }

    private AirportLocation populate(ResultSet rs) throws SQLException {
        AirportLocation location = new AirportLocation();
        location.setAirportCode(rs.getString("AIRPORT_CODE"));
        location.setAirportName(rs.getString("AIRPORT_NAME"));
        location.setCity(rs.getString("CITY"));
        location.setCountry(rs.getString("COUNTRY"));
        location.setLocationID(rs.getString("LOCATION_ID"));
        location.setLocationInformation(rs.getString("LOCATION_INFORMATION"));
        location.setTerminal(rs.getString("TERMINAL"));

        return location;
    }
}
