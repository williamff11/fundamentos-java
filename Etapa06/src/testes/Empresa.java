package testes;

import negocio.Profissional;

public class Empresa {

    public static void aplicarAumento(Profissional profissional){
        System.out.println("Novo " + (profissional.obterValor() + 1000));
    }

}
