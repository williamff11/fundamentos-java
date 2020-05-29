package testes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeDadosDoArquivo {
    public static void main(String[] args) {
        File arquivo = new File("C:/Users/william.freire/Documents/dev/FundamentosDesenvolvimentoJava/arquivo.txt");
        Scanner input = null;
        try {
            input = new Scanner(arquivo);
        } catch (FileNotFoundException ex) {
            System.err.println("Erro ao acessar arquivo!");
        }
        while (input.hasNext()) {
            Cliente c = new Cliente();
            c.setCodigo(input.nextInt());
            c.setPrimeiroNome(input.next());
            c.setUltimoNome(input.next());
            System.out.println(c.getCodigo() + " " + c.getPrimeiroNome() + " " + c.getUltimoNome());
        }
    }
}