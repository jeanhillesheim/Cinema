package cinema.t3.ine5612.cinema.model.entity;

import java.io.Serializable;

public class Tela implements Serializable {

    private Integer tamanhoPolegadas;

    private String tipo;

    public Tela() {
    }

    public Tela(Integer tamanhoPolegadas, String tipo) {
        this.tamanhoPolegadas = tamanhoPolegadas;
        this.tipo = tipo;
    }

    public Integer getTamanhoPolegadas() {
        return tamanhoPolegadas;
    }

    public void setTamanhoPolegadas(Integer tamanhoPolegadas) {
        this.tamanhoPolegadas = tamanhoPolegadas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Tela{" +
                "tamanhoPolegadas=" + tamanhoPolegadas +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
