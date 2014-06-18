package springjdbc;


public class AirportLocation {
    private String locationID;
    private String airportCode;
    private String airportName;
    private String city;
    private String country;
    private String terminal;
    private String locationInformation;

    public AirportLocation() {
    }

    public AirportLocation(String locationID) {
        this.locationID = locationID;
    }

    public AirportLocation(String locationID, String airportCode, String airportName, String city, String country, String terminal, String locationInformation) {
        this.locationID = locationID;
        this.airportCode = airportCode;
        this.airportName = airportName;
        this.city = city;
        this.country = country;
        this.terminal = terminal;
        this.locationInformation = locationInformation;
    }

    public String getLocationID() {
        return locationID;
    }

    public void setLocationID(String locationID) {
        this.locationID = locationID;
    }

    public String getAirportCode() {
        return airportCode;
    }

    public void setAirportCode(String airportCode) {
        this.airportCode = airportCode;
    }

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    public String getLocationInformation() {
        return locationInformation;
    }

    public void setLocationInformation(String locationInformation) {
        this.locationInformation = locationInformation;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AirportLocation{");
        sb.append("locationID=").append(locationID).append("\n");
        sb.append("airportCode=").append(airportCode).append("\n");
        sb.append("airportName=").append(airportName).append("\n");
        sb.append("city=").append(city).append("\n");
        sb.append("country=").append(country).append("\n");
        sb.append("terminal=").append(terminal).append("\n");
        sb.append("locationInformation=").append(locationInformation).append("\n");
        sb.append("\n}");
        return sb.toString();
    }
}
