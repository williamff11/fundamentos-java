package testes;

import negocio.Profissional;

public class App {

    public static void main(String[] args) {

        String nome = "elberth";
        int idade = 41;
        float salario = 1000;
        boolean professor = true;

        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-20s", nome));
        sb.append(String.format("%05d", idade));
        sb.append(String.format("%s", professor ? "S" : "N"));
        sb.append(String.format("%.2f", salario));
        System.out.println(sb);

    }

    private static void exibir(Profissional profissional) {
        String msg = null;
        float valor = 0;
        try {
            msg = profissional.nome;
            valor = 5 / 0;
        } catch (NullPointerException | ArithmeticException e) {
            System.out.println("error " + e);
            msg = "jão";
            valor = 100;
        } finally {
            System.out.println(msg + " - " + valor);
        }
    }
}
