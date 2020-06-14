package br.edu.infnet.model;

import java.time.LocalDate;

public abstract class Produto {

    private String descricao;
    private float valor;
    private float peso;
    private LocalDate dataValidade;

    public Produto(String descricao, float valor, float peso, LocalDate dataValidade){
        this.setDescricao(descricao);
        this.setValor(valor);
        this.setPeso(peso);
        this.setDataValidade(dataValidade);
    }

    public void imprimir(){
        System.out.println("Descrição: " + this.getDescricao());
        System.out.println("Valor: " + this.getValor());
        System.out.println("Peso: " + this.getPeso());
        System.out.println("DataValidade: " + this.getDataValidade());
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }
}
