package cinema.t3.ine5612.cinema.model.entity;

import java.io.Serializable;

public class Poster implements Serializable {

    private String url;

    public Poster(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return getUrl();
    }
}
