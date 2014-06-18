package springjdbc;

import java.util.Date;


public class Loan {
    private int id = -1;
    private String memberID;
    private String dvdCode;
    private String fromLocation;
    private Date loanDate;
    private String expectedReturnLocation;
    private Date expectedReturnDate;

    public Loan() {
    }

    public Loan(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMemberID() {
        return memberID;
    }

    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }

    public String getDvdCode() {
        return dvdCode;
    }

    public void setDvdCode(String dvdCode) {
        this.dvdCode = dvdCode;
    }

    public String getFromLocation() {
        return fromLocation;
    }

    public void setFromLocation(String fromLocation) {
        this.fromLocation = fromLocation;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(Date loanDate) {
        this.loanDate = loanDate;
    }

    public String getExpectedReturnLocation() {
        return expectedReturnLocation;
    }

    public void setExpectedReturnLocation(String expectedReturnLocation) {
        this.expectedReturnLocation = expectedReturnLocation;
    }

    public Date getExpectedReturnDate() {
        return expectedReturnDate;
    }

    public void setExpectedReturnDate(Date expectedReturnDate) {
        this.expectedReturnDate = expectedReturnDate;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Loan{");
        sb.append("id=").append(id).append("\n");
        sb.append("memberID=").append(memberID).append("\n");
        sb.append("dvdCode=").append(dvdCode).append("\n");
        sb.append("fromLocation=").append(fromLocation).append("\n");
        sb.append("loanDate=").append(loanDate).append("\n");
        sb.append("expectedReturnLocation=").append(expectedReturnLocation).append("\n");
        sb.append("expectedReturnDate=").append(expectedReturnDate).append("\n");
        sb.append("\n}");
        return sb.toString();
    }
}
