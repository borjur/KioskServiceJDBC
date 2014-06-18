package springjdbc.dao.jdbc.query;

import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.SqlUpdate;

import javax.sql.DataSource;
import java.sql.Types;



public class LoanInsertQuery extends SqlUpdate {

    public LoanInsertQuery(DataSource ds) {
        setDataSource(ds);
        String sql = "INSERT INTO LOAN(MEMBER_ID,DVDCODE,FROM_LOCATION,LOAN_DATE,EXPECTED_RETURN_LOCATION,EXPECTED_RETURN_DATE) VALUES(?,?,?,?,?,?)";
        setSql(sql);
        declareParameter(new SqlParameter(Types.VARCHAR));
        declareParameter(new SqlParameter(Types.VARCHAR));
        declareParameter(new SqlParameter(Types.VARCHAR));
        declareParameter(new SqlParameter(Types.DATE));
        declareParameter(new SqlParameter(Types.VARCHAR));
        declareParameter(new SqlParameter(Types.DATE));
        setReturnGeneratedKeys(true);
        compile();
    }
}
