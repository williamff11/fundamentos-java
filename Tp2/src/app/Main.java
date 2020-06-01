package app;

import negocio.Aluno;
import negocio.Pessoa;
import negocio.Professor;

import java.util.Scanner;
import java.util.Arrays;
import java.util.InputMismatchException;

public class Main {
    /**
     * Variaveis
     */
    static Scanner in;
    static int next = 0;
    static final int QNTD = 2;
    static Integer[] opcoesEscolha = {1, 2, 3, 4};
    static Integer[] opcoesCadastro = {1, 4};
    static Pessoa[] pessoas = new Pessoa[QNTD];

    public static void main(String[] args) {
        in = new Scanner(System.in);

        int opcao = 0;

        try {
            do {
                System.out.println("");
                System.out.println("___________________________________________________");
                System.out.println("[1] Cadastrar professor");
                System.out.println("[2] Cadastrar aluno");
                System.out.println("[3] Consultar situação de um docente/discente.");
                System.out.println("[4] Sair");

                System.out.println("Escolha a opção: ");
                opcao = in.nextInt();

                System.out.println("");
                if (validarOpcao(opcao, opcoesEscolha)) {
                    switch (opcao) {
                        case 1:
                            callCadastrarProfessor();
                            break;

                        case 2:
                            callCadastrarAluno();
                            break;

                        case 3:
                            callConsultarPessoa();
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

    private static void callCadastrarProfessor() {
        int opcao = 0;

        do {
            System.out.println("");
            System.out.println("_____________________________________________");
            System.out.println("Cadastrar um professor.");
            System.out.println("[1] Incluir");
            System.out.println("[4] Voltar");

            System.out.println("Escolha a opção: ");
            opcao = in.nextInt();

            System.out.println("");
            if (validarOpcao(opcao, opcoesCadastro)) {
                switch (opcao) {
                    case 1:
                        try {
                            registarProfessor();
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

    private static void registarProfessor() throws Exception {
        String name;
        String cpf;
        boolean mestre;

        try {
            System.out.println("Informe o nome do Professor: ");
            name = in.next();

            System.out.println("Informe o CPF do professor: ");
            cpf = in.next();

            System.out.println("O Professor tem mestrado?");
            mestre = in.nextBoolean();

            pessoas[next] = new Professor(name, cpf, mestre);
            System.out.println("O professor foi cadastrado com o código: " + next);
            next++;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("error " + e);
            System.out.println("Cadastro Cheio!");
        } catch (InputMismatchException e) {
            System.err.println("error " + e);
            System.out.print("O valor informado não é um número!");
        }
    }

    private static void callCadastrarAluno() {
        int opcao = 0;

        do {
            System.out.println("");
            System.out.println("_____________________________________________");
            System.out.println("Cadastrar um Aluno.");
            System.out.println("[1] Incluir");
            System.out.println("[4] Voltar");

            System.out.println("Escolha a opção: ");
            opcao = in.nextInt();

            System.out.println("");
            if (validarOpcao(opcao, opcoesCadastro)) {
                switch (opcao) {
                    case 1:
                        try {
                            registarAluno();
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

    private static void registarAluno() throws Exception {
        String name;
        String cpf;
        String turma;

        try {
            System.out.println("Informe o nome do Aluno: ");
            name = in.next();

            System.out.println("Informe o CPF do Aluno: ");
            cpf = in.next();

            System.out.println("Qual a turma do aluno?");
            turma = in.next();

            pessoas[next] = new Aluno(name, cpf, turma);
            System.out.println("O aluno foi cadastrado com o código: " + next);
            next++;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("error " + e);
            System.out.println("Cadastro Cheio!");
        } catch (InputMismatchException e) {
            System.err.println("error " + e);
            System.out.print("O valor informado não é um número!");
        }
    }

    private static void callConsultarPessoa() {
        int opcao = 0;

        do {
            System.out.println("");
            System.out.println("_____________________________________________");
            System.out.println("Consultar Pessoa.");
            System.out.println("[1] Consultar");
            System.out.println("[4] Voltar");

            System.out.println("Escolha a opção: ");
            opcao = in.nextInt();

            System.out.println("");
            if (validarOpcao(opcao, opcoesCadastro)) {
                switch (opcao) {
                    case 1:
                        try {
                            consultarPessoa();
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

    private static void consultarPessoa() {
        int codigo = 0;
        System.out.print("Informe o Código que deseja consultar: ");
        codigo = in.nextInt();

        try {
            exibirPessoa(codigo);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("***************");
            System.err.println("error " + e);
            System.out.println("Código " + codigo + " Não Existe.");
        } finally {
            System.out.println("________________");
            System.out.println("Se deseja consultar novamente, preessione *1*");
        }
    }

    private static void exibirPessoa() {
        if (existePessoa()) {
            for (int i = 0; i < next; i++) {
                exibirPessoa(i);
                System.out.println("");
            }
        } else {
            System.out.println("");
            System.out.println("Não Exite nenhum aluno cadastrado!");
        }
    }

    private static boolean existePessoa() {
        return next > 0;
    }

    private static void exibirPessoa(int codigo) {
        pessoas[codigo].consultarSituacao();
//        System.out.println();
//        System.out.println("Primeiro Nome: " + pessoas[codigo].getFirstName());
//        System.out.println("CPF: " + pessoas[codigo].getCpf());
//        System.out.println("Nota da AV2: " + pessoas[codigo].get);
//        System.out.println("Média final: " + media);
    }

}
