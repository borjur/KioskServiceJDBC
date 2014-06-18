package springjdbc.dao.jdbc;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import springjdbc.Loan;
import springjdbc.dao.LoanDAO;
import springjdbc.dao.jdbc.query.LoanInsertQuery;



public class LoanDAOImpl extends JdbcDaoSupport implements LoanDAO {

    public int addLoan(Loan loan) {
        Object[] args = new Object[]{loan.getMemberID(), loan.getDvdCode(), loan.getFromLocation(), 
        	loan.getLoanDate(), loan.getExpectedReturnLocation(), loan.getExpectedReturnDate()
        };
        
        //Create an instance of the pre-built LoanInsertQuery class
        LoanInsertQuery insertQuery = new LoanInsertQuery(getDataSource());

        //Create an instance of GeneratedKeyHolder, this class will contain the key that was generated by the database upon insertion of the record.
        KeyHolder keyHolder = new GeneratedKeyHolder();
        
        //Insert the record into the database, using Object[] provided and the keyHolder you just instantiated
        insertQuery.update(args, keyHolder);
        
        //Obtain the value of the generated key and return this value to the caller.
        return keyHolder.getKey().intValue();
    }
}