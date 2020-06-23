package by.nikita.entities;

/**
 * Entity of car
 *
 * @author nikit
 */

public class CarInfo {

    private int id;
    private String imgUrl;
    private String text;
    private String header;
    private String details;

    public CarInfo() {
    }

    public CarInfo(int id, String imgUrl, String text, String header) {
        this.id = id;
        this.imgUrl = imgUrl;
        this.text = text;
        this.header = header;
    }

    public CarInfo(int id, String imgUrl, String text, String header, String details) {
        this.id = id;
        this.imgUrl = imgUrl;
        this.text = text;
        this.header = header;
        this.details = details;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "CarInfo{" +
                "id=" + id +
                ", imgUrl='" + imgUrl + '\'' +
                ", text='" + text + '\'' +
                ", header='" + header + '\'' +
                ", details='" + details + '\'' +
                '}';
    }
}
