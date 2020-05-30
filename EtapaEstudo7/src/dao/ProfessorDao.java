package dao;

import model.Professor;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProfessorDao {

    private final String TABELA = "C:/Users/william.freire/Documents/dev/FundamentosDesenvolvimentoJava/EtapaEstudo7/tprofessor.txt";

    public List<Professor> obterLista() {
        try {
            BufferedReader in = new BufferedReader(new FileReader(TABELA));
            String linha = in.readLine();

            String[] campos = null;

            List<Professor> lista = new ArrayList<Professor>();

            while (linha != null) {
                campos = linha.split(";");

                Professor p = new Professor();
                p.matricula = Integer.valueOf(campos[0]);
                p.nome = campos[1];
                p.salario = Float.valueOf(campos[2]);
                p.mestre = "S".equals(campos[3]);
                lista.add(p);
                linha = in.readLine();
            }
            in.close();
            return lista;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean incluir(Professor professor) {
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(TABELA, true));

            out.write(professor + "\r\n");

            out.close();

            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}
