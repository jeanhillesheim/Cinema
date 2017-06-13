package cinema.t3.ine5612.cinema.DB;

import java.util.List;

import cinema.t3.ine5612.cinema.model.entity.Cinema;

public class DB {
    private static final DB dados = new DB();

    private List<Cinema> cinemas;

    public List<Cinema> getCinemas() {
        return cinemas;
    }

    public void setCinemas(List<Cinema> cinemas) {
        this.cinemas = cinemas;
    }

    public static DB getInstance() {
        return dados;
    }

    private DB() {
    }
}
