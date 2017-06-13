package cinema.t3.ine5612.cinema.model.entity;

public class Sala {

    private Integer numero;

    private Integer capacidade;

    private Tela tela;

    public Sala() {
    }

    public Sala(Integer numero, Integer capacidade, Tela tela) {
        this.numero = numero;
        this.capacidade = capacidade;
        this.tela = tela;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(Integer capacidade) {
        this.capacidade = capacidade;
    }

    public Tela getTela() {
        return tela;
    }

    public void setTela(Tela tela) {
        this.tela = tela;
    }

    @Override
    public String toString() {
        return "Sala{" +
                "numero=" + numero +
                ", capacidade=" + capacidade +
                ", tela=" + tela +
                '}';
    }
}
