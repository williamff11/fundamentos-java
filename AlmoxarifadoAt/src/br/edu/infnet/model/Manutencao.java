package br.edu.infnet.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Manutencao extends Produto{

    private String utilidade;
    private boolean toxico;

    public Manutencao(String descricao, float valor, float peso, LocalDate dataValidade, String utilidade, boolean toxico) {
        super(descricao, valor, peso, dataValidade);
        this.setUtilidade(utilidade);
        this.setToxico(toxico);
    }

    @Override
    public String toString() {
        return String.format("M;%s;%.2f;%.2f;%s;%s;%s",
                this.getDescricao(),
                this.getValor(),
                this.getPeso(),
                this.getDataValidade().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                this.getUtilidade(),
                this.isToxico() ? "Sim" : "Nao"
        );
    }

    public void imprimir(){
        super.imprimir();
        System.out.println("utilidade: " + this.getUtilidade());
        System.out.print("toxico? ");
        System.out.println(this.isToxico() ? "Sim" : "Não");
        System.out.println("********************");
    }

    public String getUtilidade() {
        return utilidade;
    }

    public void setUtilidade(String utilidade) {
        this.utilidade = utilidade;
    }

    public boolean isToxico() {
        return toxico;
    }

    public void setToxico(boolean toxico) {
        this.toxico = toxico;
    }
}
