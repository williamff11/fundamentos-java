package testes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;

public class InsereDadosNoArquivo {
        public static void main (String[]args){
            File arquivo = new File("C:/Users/william.freire/Documents/dev/FundamentosDesenvolvimentoJava/arquivo.txt");
            Formatter output = null;
            try {
                output = new Formatter(arquivo);
                Cliente c1 = new Cliente(123, "Fulano", "Silva");
                output.format("%d %s %s \n", c1.getCodigo(), c1.getPrimeiroNome(), c1.getUltimoNome());
                Cliente c2 = new Cliente(234, "Beltrano", "Silva");
                output.format("%d %s %s \n", c2.getCodigo(), c2.getPrimeiroNome(), c2.getUltimoNome());
                output.close();
            } catch (FileNotFoundException ex) {
                System.err.println("Erro ao acessar arquivo!");
            }
        }
    }
