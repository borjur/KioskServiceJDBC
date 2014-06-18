package springjdbc;


public class Member {
    private String memberID;
    private String userName;
    private String password;
    private String street;
    private String city;
    private String zipCode;
    private String country;
    private String ffNumber;
    private String airlineCode;
    private String email;
    private char status;
    private String fullName;

    public Member() {
    }

    public Member(String memberID) {
        this.memberID = memberID;
    }

    public Member(String memberID, String userName, String password, String street, String city, String zipCode, String country, String ffNumber, String airlineCode, String email, char status, String fullName) {
        this.memberID = memberID;
        this.userName = userName;
        this.password = password;
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
        this.country = country;
        this.ffNumber = ffNumber;
        this.airlineCode = airlineCode;
        this.email = email;
        this.status = status;
        this.fullName = fullName;
    }

    public String getMemberID() {
        return memberID;
    }

    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFfNumber() {
        return ffNumber;
    }

    public void setFfNumber(String ffNumber) {
        this.ffNumber = ffNumber;
    }

    public String getAirlineCode() {
        return airlineCode;
    }

    public void setAirlineCode(String airlineCode) {
        this.airlineCode = airlineCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Member{");
        sb.append("memberID=").append(memberID).append("\n");
        sb.append("userName=").append(userName).append("\n");
        sb.append("password=").append(password).append("\n");
        sb.append("street=").append(street).append("\n");
        sb.append("city=").append(city).append("\n");
        sb.append("zipCode=").append(zipCode).append("\n");
        sb.append("country=").append(country).append("\n");
        sb.append("ffNumber=").append(ffNumber).append("\n");
        sb.append("airlineCode=").append(airlineCode).append("\n");
        sb.append("email=").append(email).append("\n");
        sb.append("status=").append(status).append("\n");
        sb.append("fullName=").append(fullName).append("\n");
        sb.append("\n}");
        return sb.toString();
    }
}
