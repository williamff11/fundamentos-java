package negocio;

public class Programador extends Profissional {

    public float gratificacao;

    @Override
    public float obterValor() {
        return 1000;
    }

    @Override
    public void imprimir() {
        System.out.println("Sou Programador!!!");
        System.out.println("Salario " +  this.calcularSalario());

    }
}
