package br.edu.infnet.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Informatica extends Produto {

    private String marca;
    private boolean hardware;

    public Informatica(String descricao, float valor, float peso, LocalDate dataValidade, String marca, boolean hardware) {
        super(descricao, valor, peso, dataValidade);
        this.setMarca(marca);
        this.setHardware(hardware);
    }

    public void imprimir(){
        super.imprimir();
        System.out.println("marca: " + this.getMarca());
        System.out.print("hardware? ");
        System.out.println(this.isHardware() ? "Sim" : "Não");
        System.out.println("********************");
    }

    @Override
    public String toString() {
        return String.format("I;%s;%.2f;%.2f;%s;%s;%s",
                this.getDescricao(),
                this.getValor(),
                this.getPeso(),
                this.getDataValidade().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                this.getMarca(),
                this.isHardware() ? "Sim" : "Nao"
        );
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isHardware() {
        return hardware;
    }

    public void setHardware(boolean hardware) {
        this.hardware = hardware;
    }
}
