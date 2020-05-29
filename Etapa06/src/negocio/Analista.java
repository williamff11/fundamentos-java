package negocio;

public class Analista extends Profissional {

    public float desconto;

    @Override
    public float calcularSalario() {
        return super.calcularSalario() - desconto;
    }

    @Override
    public float obterValor() {
        return 500;
    }

    @Override
    public void imprimir() {
        System.out.println("Sou Analista" + this.calcularSalario());
    }
}
