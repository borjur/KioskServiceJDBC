package springjdbc;


public class DVDInfo {
    private String id;
    private String director;
    private String encoding;
    private String format;
    private String rated;
    private String studio;
    private String yearMonthRelease;
    private String title;
    private String starring;
    private String locationID;

    public DVDInfo() {
    }

    public DVDInfo(String id) {
        this.id = id;
    }

    public DVDInfo(String id, String director, String encoding, String format, String rated, String studio, String yearMonthRelease, String title, String starring, String locationID) {
        this.id = id;
        this.director = director;
        this.encoding = encoding;
        this.format = format;
        this.rated = rated;
        this.studio = studio;
        this.yearMonthRelease = yearMonthRelease;
        this.title = title;
        this.starring = starring;
        this.locationID = locationID;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getEncoding() {
        return encoding;
    }

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getRated() {
        return rated;
    }

    public void setRated(String rated) {
        this.rated = rated;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public String getYearMonthRelease() {
        return yearMonthRelease;
    }

    public void setYearMonthRelease(String yearMonthRelease) {
        this.yearMonthRelease = yearMonthRelease;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStarring() {
        return starring;
    }

    public void setStarring(String starring) {
        this.starring = starring;
    }

    public String getLocationID() {
        return locationID;
    }

    public void setLocationID(String locationID) {
        this.locationID = locationID;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DVDInfo{");
        sb.append("id=").append(id).append("\n");
        sb.append("director=").append(director).append("\n");
        sb.append("encoding=").append(encoding).append("\n");
        sb.append("format=").append(format).append("\n");
        sb.append("rated=").append(rated).append("\n");
        sb.append("studio=").append(studio).append("\n");
        sb.append("yearMonthRelease=").append(yearMonthRelease).append("\n");
        sb.append("title=").append(title).append("\n");
        sb.append("starring=").append(starring).append("\n");
        sb.append("locationID=").append(locationID).append("\n");
        sb.append("\n}");
        return sb.toString();
    }
}
