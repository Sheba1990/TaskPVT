package by.nikita.entities;

/**
 * Entity of car
 *
 * @author nikit
 */

public class CarInfo {

    private String imgUrl;
    private String text;
    private String header;

    public CarInfo() {
    }

    public CarInfo(String imgUrl, String text, String header) {
        this.imgUrl = imgUrl;
        this.text = text;
        this.header = header;
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
}
