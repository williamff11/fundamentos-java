package br.edu.infnet.model;

import java.util.List;

public class Setor {

    private String nome;
    private Funcionario gestor;
    private List<Funcionario> funcionarios;

    public Setor(String nome, Funcionario gestor, int numFuncionarios){
        this.setNome(nome);
        this.setGestor(gestor);
    }

    @Override
    public String toString() {
        return String.format("%s;%s;%d",
                this.getNome(),
                this.getGestor(),
                this.getFuncionarios().size()
        );
    }

    public void imprimir(){
        System.out.println("Nome: " + this.getNome());
        this.getGestor().imprimir();
        System.out.println("Funcionarios: ");
        for(Funcionario f : this.getFuncionarios()){
            f.imprimir();
        }
        System.out.println("********************");
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
}
