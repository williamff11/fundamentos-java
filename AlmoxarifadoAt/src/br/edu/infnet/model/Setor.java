package br.edu.infnet.model;

import java.util.List;

public class Setor {

    private String nome;
    private String descricao;
    private Funcionario gestor;
    private List<Funcionario> funcionarios;

    public Setor(String nome, String descricao, Funcionario gestor, List<Funcionario> funcionarios){
        this.setNome(nome);
        this.setDescricao(descricao);
        this.setGestor(gestor);
        this.setFuncionarios(funcionarios);
    }

    @Override
    public String toString() {
        return String.format("%s;%s;%s;",
                this.getNome(),
                this.getDescricao(),
                this.getGestor()
        );
    }

    public void imprimir(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Descricao: " + this.getDescricao());
        System.out.println("Gestor: ");
        this.getGestor().imprimir();
        System.out.println("Funcionarios: ");
        for(Funcionario f : this.getFuncionarios()){
            f.imprimir();
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Funcionario getGestor() {
        return gestor;
    }

    public void setGestor(Funcionario gestor) {
        this.gestor = gestor;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}