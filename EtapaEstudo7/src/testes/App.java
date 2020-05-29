package testes;

import java.io.File;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        File file = new File("C:/Users/william.freire/Documents/dev/FundamentosDesenvolvimentoJava/iiiira/test2.txt");

        file.createNewFile();
        if(file.exists()){
            System.out.println("O arquivo existe");
        }else {
            System.out.println("O arquivo não existe");
        }

        for (String arq : file.list()) {
            System.out.println(arq);
        }
    }
}
