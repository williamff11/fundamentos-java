package br.edu.infnet.dao;

import br.edu.infnet.auxiliar.Constante;
import br.edu.infnet.model.Funcionario;
import br.edu.infnet.model.Setor;

import java.io.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class SetorDao {

    public static boolean incluir(Setor setor) {

        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(Constante.TSETOR, false));

            out.write(setor + "\r\n");

            for (Funcionario func : setor.getFuncionarios()){
                out.write(func + "\r\n");
            }
            out.close();

            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static Setor obter() {
        Funcionario gestor = null;
        Funcionario funcionario;
        Setor setor = null;
        try {
            BufferedReader in = new BufferedReader(new FileReader(Constante.TSETOR));

            String linha = in.readLine();

            String[] campos = null;

            List<Funcionario> funcionarios = new ArrayList<Funcionario>();

            while (linha != null) {
                campos = linha.split(";");

                String nameSetor = campos[0];
                String describeSetor = campos[1];
                if(campos.length == 5) {
                    System.out.println("foi5");
                    gestor = new Funcionario(
                            campos[2],
                            campos[3],
                            "S".equals(campos[4])
                    );

                } else {
                    funcionario = new Funcionario(
                            campos[0],
                            campos[1],
                            "S".equals(campos[2])
                    );
                    funcionarios.add(funcionario);
                }

                setor = new Setor(nameSetor, describeSetor, gestor, funcionarios);

                linha = in.readLine();
            }
            in.close();

            return setor;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
