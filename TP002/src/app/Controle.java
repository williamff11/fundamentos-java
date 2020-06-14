package app;

import app.NumeroNegativoException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Controle {
    static int opcao;
    static final int QTDE = 100;
    static int confirmacao;
    static Scanner in;
    static int cont;
    static String[]  nomes = new String [QTDE];
    static Float[]  notas = new Float [QTDE];
    static Float[]  notas1 = new Float [QTDE];
    static Float[] notasTotal = new Float[QTDE];
    static String[] ceps = new String [QTDE];
    static String [] emails = new String [QTDE];
    static boolean cepFormatado;


    public static void main (String[] args){

        in = new Scanner (System.in);

        do {
            try {
                opcao=0;
                System.out.println("[1] Registrar as notas de um novo aluno");
                System.out.println("[2] Consultar boletim de um aluno");
                System.out.println("[3] Consultar notas da turma");
                System.out.println("[4] Sair");
                System.out.print("Escolha a op��o: ");
                opcao = in.nextInt();

                if(opcao == 1 || opcao == 2 || opcao == 3 || opcao == 4 ) {

                    switch(opcao) {

                        case 1:
                            registros();
                            break;

                        case 2:
                            consultarRegistro();
                            break;

                        case 3:
                            consultarTurma();
                            break;

                        default:
                            break;

                    }

                }else {
                    System.out.println("\n Op��o inv�lida!!!\n");
                }
            }catch(InputMismatchException e){
                System.out.println("\n   A T E N C A O\n\nDigite somente numeros!\n");

            }finally {
                in.nextLine();
            }

        }while (opcao != 4);

        System.out.println("Sistema finalizado com sucesso!!");

    }
    private static void registros() {
        int opcao = 0;

        do {
            try {
                System.out.println("");
                System.out.println("Registrar notas do aluno");
                System.out.println("[1] Continuar.");
                System.out.println("[2] Sair.");

                System.out.println("Digite a op��o selecionada: ");
                opcao = in.nextInt();

                if(opcao ==1 || opcao ==2) {
                    switch (opcao) {
                        case 1:
                            registrarAlunos();
                            break;

                        default:
                            break;
                    }


                }
                else {
                    System.out.println("Op��o inv�lida!!!");
                }
            }catch(InputMismatchException e){
                System.out.println("\n   A T E N C A O\n\nDigite somente numeros!\n");
                in.next();
            }
        }
        while(opcao != 2);
        System.out.println("Saiu !!");

    }
    private static void registrarAlunos() {
        try {
            if(existeVaga()) {
                System.out.print("Nome: ");
                nomes[cont] = in.next();

                emails[cont]=nomes[cont].substring(0,3);
                System.out.print(emails[cont]+"@aluno.com \n");

                do {
                    System.out.print("CEP: 'XX.XXX-XXX' ");
                    ceps[cont]= in.next();

                    if(ceps[cont].indexOf(".") == 2 && ceps[cont].indexOf("-") == 6 ) {
                        cepFormatado = true;

                        if(cepFormatado == false) {
                            System.out.print("CEP inv�lido\n");
                        }
                    }

                }while(cepFormatado != true);
                System.out.print("CEP v�lido\n");


                System.out.print("Nota da primeira avalia��o: ");
                notas[cont] = in.nextFloat();

                System.out.print("Nota da segunda avalia��o: ");
                notas1[cont] = in.nextFloat();

                System.out.println("C�digo do aluno: " +cont);

                notasTotal[cont]=(notas[cont]+notas1[cont]);
                if(notasTotal[cont]<0) {
                    throw new NumeroNegativoException("A soma das notas n�o podem ser menor do que Zero");
                }

                cont++;

            }else {
                System.out.println("Cadastro lotado!");
            }
        }catch(StringIndexOutOfBoundsException e) {
            System.out.println("\n  O nome tem que ter mais de 3 caracteres \n");
            in.next();
        }
    }

    private static boolean existeVaga() {
        return cont<QTDE;
    }
    private static void consultarRegistro() {
        int opcao = 0;

        do {
            try {
                System.out.println("");
                System.out.println("Consultar notas do aluno");
                System.out.println("[1] Continuar.");
                System.out.println("[2] Sair.");

                System.out.println("Digite a op��o selecionada: ");
                opcao = in.nextInt();

                if(opcao ==1 || opcao ==2) {
                    switch (opcao) {
                        case 1:
                            int  codigoAluno = 0;
                            System.out.print("Digite o c�digo do aluno: ");
                            codigoAluno = in.nextInt();


                            if(validarCodigo(codigoAluno)) {
                                exibirAluno(codigoAluno);
                            }
                            else {
                                System.out.println("");
                                System.out.println("C�digo inexistente");
                            }
                            break;

                        default:
                            break;
                    }

                }
                else {
                    System.out.println("Op��o inv�lida!!!");
                }
            }catch(InputMismatchException e){
                System.out.println("\n   A T E N C A O\n\nDigite somente numeros!\n");
                in.next();
            }
        }
        while(opcao != 2);
    }
    private static boolean validarCodigo(int codigoAluno) {
        return codigoAluno >= 0 && codigoAluno < cont;
    }
    private static void exibirAluno(int codigoAluno) {
        float media = notasTotal[codigoAluno]/2;

        StringBuilder sb = new StringBuilder();
        sb.append("Nome do aluno: "+nomes[codigoAluno]);
        sb.append( System.getProperty("line.separator") );
        sb.append("Email do aluno: "+emails[codigoAluno]+"@aluno.com");
        sb.append( System.getProperty("line.separator") );
        sb.append("CeEPo aluno: "+ceps[codigoAluno]);
        sb.append( System.getProperty("line.separator") );
        sb.append("Nota da primeira avalia��o: "+notas[codigoAluno]);
        sb.append( System.getProperty("line.separator") );
        sb.append("Nota da segunda avalia��o: "+notas1[codigoAluno]);
        sb.append( System.getProperty("line.separator") );
        sb.append("M�dia final: "+ media);
        System.out.println(sb);

        if(media<4) {
            System.out.println("Situa��o: Reprovado");
        }
        if(media>=7) {
            System.out.println("Situa��o: Aprovado");
        }
        if (media>=4 && media<7) {
            System.out.println("Situa��o: Prova final");
        }
    }
    private static void consultarTurma() {
        int opcao = 0;

        do {
            try {
                System.out.println("");
                System.out.println("Consultar notas da turma");
                System.out.println("[1] Continuar.");
                System.out.println("[2] Sair.");

                System.out.println("Digite a op��o selecionada: ");
                opcao = in.nextInt();

                if(opcao ==1 || opcao ==2) {
                    switch (opcao) {
                        case 1:
                            if(existeAluno()) {
                                for(int codigoAluno = 0; codigoAluno<cont; codigoAluno++) {
                                    exibirAluno(codigoAluno);
                                    System.out.println("");
                                }
                            }
                            else {
                                System.out.println("");
                                System.out.println("N�o existe cadastro");
                            }
                            break;

                        default:
                            break;
                    }

                }
                else {
                    System.out.println("Op��o inv�lida!!!");
                }
            }catch(InputMismatchException e){
                System.out.println("\n   A T E N C A O\n\nDigite somente numeros!\n");
                in.next();
            }finally {
                in.next();
            }
        }
        while(opcao != 2);
    }
    private static boolean existeAluno() {
        return cont>0;
    }


}
