package br.edu.infnet.model;

public class Funcionario {

    private String nome;
    private String email;
    private boolean gestor;

    public Funcionario(String nome, String email, boolean gestor) {
        this.setNome(nome);
        this.setEmail(email);
        this.setGestor(gestor);
    }

    @Override
    public String toString() {
        return String.format("%s;%s;%s",
                this.getNome(),
                this.getEmail(),
                this.isGestor() ? "Sim" : "Nao"
        );
    }

    public void imprimir(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Email: " + this.getEmail());
        System.out.print("Gestor? ");
        System.out.println(this.isGestor() ? "Sim" : "Não");
        System.out.println("_________________________________");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isGestor() {
        return gestor;
    }

    public void setGestor(boolean gestor) {
        this.gestor = gestor;
    }
}
