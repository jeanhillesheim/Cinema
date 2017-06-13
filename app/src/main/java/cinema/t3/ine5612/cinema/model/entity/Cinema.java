package cinema.t3.ine5612.cinema.model.entity;


import java.util.Collection;

public class Cinema {

    private long id;

    private String nome;

    private long longitude;

    private long latitude;

    private Collection<Filme> filmes;

    private Collection<Sala> salas;

    private Collection<Sessao> sessoes;

    public Cinema() {
    }

    public Cinema(long id, String nome, long longitude, long latitude, Collection<Sala> salas) {
        this.id = id;
        this.nome = nome;
        this.longitude = longitude;
        this.latitude = latitude;
        this.salas = salas;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getLongitude() {
        return longitude;
    }

    public void setLongitude(long longitude) {
        this.longitude = longitude;
    }

    public long getLatitude() {
        return latitude;
    }

    public void setLatitude(long latitude) {
        this.latitude = latitude;
    }

    public Collection<Filme> getFilmes() {
        return filmes;
    }

    public void setFilmes(Collection<Filme> filmes) {
        this.filmes = filmes;
    }

    public Collection<Sala> getSalas() {
        return salas;
    }

    public void setSalas(Collection<Sala> salas) {
        this.salas = salas;
    }

    public Collection<Sessao> getSessoes() {
        return sessoes;
    }

    public void setSessoes(Collection<Sessao> sessoes) {
        this.sessoes = sessoes;
    }

    @Override
    public String toString() {
        return getNome();
    }
}
