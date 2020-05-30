package testes;

import java.io.*;
import java.util.Arrays;

public class FileTeste {
    public static void escrever(String arquivo) {
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(arquivo, true));


/*            out.write("William\r\n");
            out.write("Felicio\n");
            out.write("Freire\n");*/

            out.write("4;William;Freire\r\n");
            out.write("5;João;Santos\r\n");
            out.write("55;Maria;Maria\r\n");

            out.close();

            System.out.println("Feito");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void ler(String arquivo) {

        try {
            BufferedReader in = new BufferedReader(new FileReader(arquivo));
            String linha = in.readLine();

            String[] campos = null;

            while (linha != null) {
                System.out.println("CADASTRO: " + linha);
                campos = linha.split(";");
                System.out.println("VETOR: " + Arrays.asList(campos));
                System.out.println("CODIGO: " + campos[0]);
                System.out.println("NOME: " + campos[1]);
                System.out.println("SOBRENOME: " + campos[2]);

                linha = in.readLine();
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String arq = "C:/Users/william.freire/Documents/dev/FundamentosDesenvolvimentoJava/EtapaEstudo7/test.txt";

        escrever(arq);
        ler(arq);

    }
}
