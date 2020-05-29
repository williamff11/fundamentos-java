import java.util.Arrays;
import java.util.Scanner;

// package testes;
public class App {

    private static int opcao;
    // final nao deixa mudar o valor da variavel
    private static final int QTDE = 3;
    private static String[] nomes;
    private static Float[] mensalidades;
    private static int[] idades;
    private static int[] meses;

    private static Integer[] numeros = { 1, 2, 3, 4 };

    public static void main(String[] args) {
        nomes = new String[QTDE];
        mensalidades = new Float[QTDE];
        idades = new int[QTDE];
        meses = new int[QTDE];

        // int num = 4;

        // System.out.println(numeros.length);
        // System.out.println(Arrays.asList(numeros).contains(num));
        Scanner in = new Scanner(System.in);

        do {
            System.out.println("[1] Cadastrar");
            System.out.println("[2] Exibir");
            System.out.println("[9] Sair");
            System.out.print("Escolha a opção: ");
            opcao = in.nextInt();

            if (opcao == 1 || opcao == 2 || opcao == 9) {

                switch (opcao) {
                    case 1:
                        System.out.print("Nome: ");
                        nomes[0] = in.next();
                        System.out.print("Mensalidade: ");
                        mensalidades[0] = in.nextFloat();
                        System.out.print("Idade: ");
                        idades[0] = in.nextInt();
                        System.out.print("Mês de Nascimento: ");
                        meses[0] = in.nextInt();

                        // opcao = 0;
                        break;
                    case 2:
                        exibir();
                        break;

                    default:
                        break;
                }

            } else {
                System.out.println("Opção Inválida!!");
            }

        } while (opcao != 9);

        System.out.println("Sistema finalizado com sucesso!");

        // System.out.print("Nome: ");
        // nomes[0] = in.next();
        // System.out.print("Mensalidade: ");
        // mensalidades[0] = in.nextFloat();
        // System.out.print("Idade: ");
        // idades[0] = in.nextInt();
        // System.out.print("Mês de Nascimento: ");
        // meses[0] = in.nextInt();

        // opcao = 0;
        // exibir();
    }

    private static void exibir() {
        for (int i = 0; i < QTDE; i++) {
            System.out.println(nomes[i] + " - " + mensalidades[i] + " - " + idades[i] + " - " + meses[i] + " - "
                    + obterFaixaEtaria(idades[i]) + " - " + obterSituacaoMensalidade(mensalidades[i]) + " - "
                    + obterTrimestre(meses[i]));
        }

        // int i = 0;
        // while (i < QTDE) {
        // System.out.println(nomes[i] + " - " + mensalidades[i] + " - " + idades[i]);
        // }
        // i++;
        // }

        // int i = 0;
        // do {
        // System.out.println(nomes[i] + " - " + mensalidades[i] + " - " + idades[i]);
        // } while (i < QTDE);
    }

    private static String obterFaixaEtaria(int idade) {
        if (idade < 4) {
            return "baby";
        } else if (idade > 99) {
            return "velho";
        } else {
            return "novo";
        }
    }

    private static String obterSituacaoMensalidade(float mensalidade) {
        return mensalidade > 100 ? "muito carro" : "pouco caro";
    }

    private static String obterTrimestre(int mes) {

        switch (mes) {
            case 1:
            case 2:
            case 3:
                return "1o Trimeste";

            case 4:
            case 5:
            case 6:
                return "2o Trimeste";

            case 7:
            case 8:
            case 9:
                return "3o Trimeste";

            case 10:
            case 11:
            case 12:
                return "4o Trimeste";

            default:
                return "Mês Inválido";
        }
    }
}