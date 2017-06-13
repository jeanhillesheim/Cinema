package cinema.t3.ine5612.cinema.model.entity;

import java.util.Collection;

public class Filme {

    private Integer id;

    private String nome;

    private Pessoa diretor;

    private Collection<Pessoa> elenco;

    private String sinopse;

    private Integer duracaoMin;

    private Poster poster;

    private String trailer;

    private Boolean favorito;

    public Filme() {
    }

    public Filme(Integer id, String nome, Pessoa diretor, Collection<Pessoa> elenco, String sinopse, Integer duracaoMin, Poster poster, String trailer, Boolean favorito) {
        this.id = id;
        this.nome = nome;
        this.diretor = diretor;
        this.elenco = elenco;
        this.sinopse = sinopse;
        this.duracaoMin = duracaoMin;
        this.poster = poster;
        this.trailer = trailer;
        this.favorito = favorito;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pessoa getDiretor() {
        return diretor;
    }

    public void setDiretor(Pessoa diretor) {
        this.diretor = diretor;
    }

    public Collection<Pessoa> getElenco() {
        return elenco;
    }

    public void setElenco(Collection<Pessoa> elenco) {
        this.elenco = elenco;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public Integer getDuracaoMin() {
        return duracaoMin;
    }

    public void setDuracaoMin(Integer duracaoMin) {
        this.duracaoMin = duracaoMin;
    }

    public Poster getPoster() {
        return poster;
    }

    public void setPoster(Poster poster) {
        this.poster = poster;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }

    public String getTrailer() {
        return this.trailer;
    }

    public Boolean getFavorito() {
        return favorito;
    }

    public void setFavorito(Boolean favorito) {
        this.favorito = favorito;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", diretor=" + diretor +
                ", elenco=" + elenco +
                ", sinopse='" + sinopse + '\'' +
                ", duracaoMin=" + duracaoMin +
                ", poster=" + poster +
                ", favorito=" + favorito +
                '}';
    }
}
