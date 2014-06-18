package springjdbc.bo;

import springjdbc.DVDInfo;

import java.util.Date;
import java.util.List;


public interface KioskService {
    public List<DVDInfo> searchByTitle(String title);

    public int loanDVD(String dvdTitleID, String userName, String password, Date returnDate, String returnLocationID);

}
