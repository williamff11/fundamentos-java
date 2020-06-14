package br.edu.infnet.dao;

import br.edu.infnet.auxiliar.Constante;
import br.edu.infnet.model.Funcionario;
import br.edu.infnet.model.Setor;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class SetorDao {

    public static boolean incluir(Setor setor) {

        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(Constante.TSETOR, true));

            out.write(setor + "\r\n");

            out.close();

            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static List<Setor> obterLista() {

        try {
            BufferedReader in = new BufferedReader(new FileReader(Constante.TSETOR));

            String linha = in.readLine();

            String[] campos = null;

            List<Setor> lista = new ArrayList<Setor>();

            while (linha != null) {
                campos = linha.split(";");

                DateTimeFormatter form = DateTimeFormatter.ofPattern("dd/MM/yyyy");

//                Setor p = new Setor(
//                        campos[0],
//                         campos[1],
//                        Integer.parseInt(campos[2])
//                );

//                lista.add(p);

                linha = in.readLine();
            }
            in.close();

            return lista;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
