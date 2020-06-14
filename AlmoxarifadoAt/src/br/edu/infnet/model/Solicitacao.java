package br.edu.infnet.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Solicitacao {

    private LocalDateTime dataCreate;
    private int quantidade;
    private Funcionario funcionario;
    private List<Produto> produtos;

    @Override
    public String toString() {
        return String.format("%s;%d;%s;",
                this.getDataCreate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")),
                this.getQuantidade(),
                this.getFuncionario()
        );
    }

    public void imprimir() {
        System.out.println("data do Pedido: " + this.getDataCreate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
        System.out.println("quantidade: " + this.getQuantidade());
        System.out.println("funcionario: ");
        this.getFuncionario().imprimir();
        System.out.println("produto: ");
        for(Produto p : this.getProdutos()) {
            p.imprimir();
        }
    }

    public LocalDateTime getDataCreate() {
        return dataCreate;
    }

    public void setDataCreate(LocalDateTime dataCreate) {
        this.dataCreate = dataCreate;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
}
