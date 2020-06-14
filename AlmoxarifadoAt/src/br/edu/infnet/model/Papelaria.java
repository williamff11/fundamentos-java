package br.edu.infnet.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Papelaria extends Produto {

    private String cor;
    private boolean reutilizavel;

    public Papelaria(String descricao, float valor, float peso, LocalDate dataValidade, String cor, boolean reutilizavel) {
        super(descricao, valor, peso, dataValidade);
        this.setCor(cor);
        this.setReutilizavel(reutilizavel);
    }

    @Override
    public String toString() {
        return String.format("P;%s;%.2f;%.2f;%s;%s;%s",
                this.getDescricao(),
                this.getValor(),
                this.getPeso(),
                this.getDataValidade().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                this.getCor(),
                this.isReutilizavel() ? "Sim" : "Nao"
        );
    }

    public void imprimir(){
        super.imprimir();
        System.out.println("cor: " + this.getCor());
        System.out.print("reutilizavel? ");
        System.out.println(this.isReutilizavel() ? "Sim" : "Não");
        System.out.println("********************");
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isReutilizavel() {
        return reutilizavel;
    }

    public void setReutilizavel(boolean reutilizavel) {
        this.reutilizavel = reutilizavel;
    }
}
