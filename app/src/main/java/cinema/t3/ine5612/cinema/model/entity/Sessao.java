package cinema.t3.ine5612.cinema.model.entity;

import java.util.Date;

public class Sessao {

    private Cinema cinema;

    private Filme filme;

    private Sala sala;

    private Date dataHorario;

    private Boolean dublado;

    public Sessao() {
    }

    public Sessao(Cinema cinema, Filme filme, Sala sala, Date dataHorario, Boolean dublado) {
        this.cinema = cinema;
        this.filme = filme;
        this.sala = sala;
        this.dataHorario = dataHorario;
        this.dublado = dublado;
    }

    public Cinema getCinema() {
        return cinema;
    }

    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Date getDataHorario() {
        return dataHorario;
    }

    public void setDataHorario(Date dataHorario) {
        this.dataHorario = dataHorario;
    }

    public Boolean getDublado() {
        return dublado;
    }

    public void setDublado(Boolean dublado) {
        this.dublado = dublado;
    }

    @Override
    public String toString() {
        return "Sessao{" +
                "cinema=" + cinema +
                ", filme=" + filme +
                ", sala=" + sala +
                ", dataHorario=" + dataHorario +
                ", dublado=" + dublado +
                '}';
    }
}

