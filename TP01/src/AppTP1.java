import exceptions.NotaException;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AppTP1 {
    /**
     * Variaveis
     */
    static Scanner in;
    static int next = 0;
    static final int QNTD = 2;
    static Integer[] opcoesEscolha = {1, 2, 3, 4};
    static Integer[] opcoesCadastro = {1, 4};
    static String[] names = new String[QNTD];
    static Float[] avs1 = new Float[QNTD];
    static Float[] avs2 = new Float[QNTD];

    public static void main(String[] args) throws InputMismatchException {
        in = new Scanner(System.in);

        int opcao = 0;

        try {
            do {
                System.out.println("");
                System.out.println("___________________________________________________");
                System.out.println("[1] Registar as notas de um novo aluno");
                System.out.println("[2] Consultar boletim de um aluno");
                System.out.println("[3] Consultar notas da turma");
                System.out.println("[4] Sair");

                System.out.println("Escolha a opção: ");
                opcao = in.nextInt();

                System.out.println("");
                if (validarOpcao(opcao, opcoesEscolha)) {
                    switch (opcao) {
                        case 1:
                            callRegistarNotas();
                            break;

                        case 2:
                            callConsultarBoletim();
                            break;

                        case 3:
                            callConsultarNotas();
                            break;

                        default:
                            break;
                    }
                } else {
                    System.out.println("");
                    System.out.println("Opção inválida! ");
                }
            } while (opcao != 4);
            System.out.println("Sistema Encerrado com Sucesso!");
        } catch (InputMismatchException e) {
            System.err.println("error " + e);
            System.out.println("Introduza apenas números inteiros!");
        } finally {
            opcao = 4;
        }
    }

    private static boolean validarOpcao(Integer opcao, Integer[] opcoesDeEscolha) {
        return Arrays.asList(opcoesDeEscolha).contains(opcao);
    }

    private static void callRegistarNotas() {
        int opcao = 0;

        do {
            System.out.println("");
            System.out.println("_____________________________________________");
            System.out.println("Registar as notas de um novo aluno.");
            System.out.println("[1] Incluir");
            System.out.println("[4] Voltar");

            System.out.println("Escolha a opção: ");
            opcao = in.nextInt();

            System.out.println("");
            if (validarOpcao(opcao, opcoesCadastro)) {
                switch (opcao) {
                    case 1:
                        try {
                            registarNotas();
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                            e.printStackTrace();
                        }
                        break;

                    default:
                        break;
                }
            } else {
                System.out.println("");
                System.out.println("Opção inválida! ");
            }
        } while (opcao != 4);
    }

    private static void registarNotas() throws Exception {

        try {
            System.out.println("Informe o nome do aluno: ");
            names[next] = in.next();

            System.out.println("Informe a nota da Primeira avaliação: ");
            avs1[next] = in.nextFloat();
            if (avs1[next] < 0){
                throw new NotaException();
            }

            System.out.println("Informe a nota da Segunda avaliação: ");
            avs2[next] = in.nextFloat();
            if (avs2[next] < 0){
                throw new NotaException();
            }
            next++;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("error " + e);
            System.out.println("Cadastro Cheio!");
        } catch (InputMismatchException e){
            System.err.println("error " + e);
            System.out.print("O valor informado não é um número!");
        }
    }

    private static boolean existeVaga() {
        return next < QNTD;
    }

    private static void callConsultarBoletim() {
        int opcao = 0;

        do {
            System.out.println("");
            System.out.println("_____________________________________________");
            System.out.println("Consultar boletim de um aluno.");
            System.out.println("[1] Consultar");
            System.out.println("[4] Voltar");

            System.out.println("Escolha a opção: ");
            opcao = in.nextInt();

            System.out.println("");
            if (validarOpcao(opcao, opcoesCadastro)) {
                switch (opcao) {
                    case 1:
                        consultarBoletim();
                        break;

                    default:
                        break;
                }
            } else {
                System.out.println("");
                System.out.println("Opção inválida! ");
            }
        } while (opcao != 4);
    }

    private static void consultarBoletim() {
        int codigo = 0;
        System.out.print("Informe o Código do Aluno: ");
        codigo = in.nextInt();

        try {
            exibirAluno(codigo);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("***************");
            System.err.println("error " + e);
            System.out.println("Código " + codigo + " Não Existe.");
        } finally {
            System.out.println("________________");
            System.out.println("Se deseja consultar novamente, preessione *1*");
        }
    }

    private static boolean validadeCodigo(int codigo) {
        return codigo >= 0 && codigo < next;
    }

    private static void exibirAluno() {
        if (existeAluno()) {
            for (int i = 0; i < next; i++) {
                exibirAluno(i);
                System.out.println("");
            }
        } else {
            System.out.println("");
            System.out.println("Não Exite nenhum aluno cadastrado!");
        }
    }

    private static boolean existeAluno() {
        return next > 0;
    }

    private static void exibirAluno(int codigo) {
        float media = calcularMedia(codigo);
        System.out.println("Nome do aluno: " + names[codigo]);
        System.out.println("Nota da AV1: " + avs1[codigo]);
        System.out.println("Nota da AV2: " + avs2[codigo]);
        System.out.println("Média final: " + media);
        System.out.println("Situação: " + obterSituacao(media));
    }

    private static float calcularMedia(int codigo) {
        return (avs1[codigo] + avs2[codigo]) / 2;
    }

    private static String obterSituacao(float media) {
        if (media < 4) {
            return "Reprovado";
        } else if (media >= 4 && media <= 7) {
            return "Prova Final";
        } else {
            return "Aprovado";
        }
    }

    private static void callConsultarNotas() {
        int opcao = 0;

        do {
            System.out.println("");
            System.out.println("_____________________________________________");
            System.out.println("Consultar notas da turma.");
            System.out.println("[1] Consultar");
            System.out.println("[4] Voltar");

            System.out.println("Escolha a opção: ");
            opcao = in.nextInt();

            System.out.println("");
            if (validarOpcao(opcao, opcoesCadastro)) {
                switch (opcao) {
                    case 1:
                        consultarNotas();
                        break;

                    default:
                        break;
                }
            } else {
                System.out.println("");
                System.out.println("Opção inválida! ");
            }
        } while (opcao != 4);
    }

    private static void consultarNotas() {
        exibirAluno();
    }
}