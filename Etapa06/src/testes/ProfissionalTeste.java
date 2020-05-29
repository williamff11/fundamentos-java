package testes;

import negocio.Analista;
import negocio.Profissional;
import negocio.Programador;

public class ProfissionalTeste {
    public static void main(String[] args) {
        Programador p2 = new Programador();
        p2.salario = 2000;
        System.out.println(p2.calcularSalario());

        Analista p3 = new Analista();
        p3.salario = 3000;
        p3.desconto = 1000;
        System.out.println(p3.calcularSalario());

        Empresa.aplicarAumento(p2);
    }
}
