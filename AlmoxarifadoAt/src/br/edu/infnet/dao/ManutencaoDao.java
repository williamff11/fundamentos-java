package br.edu.infnet.dao;

import br.edu.infnet.auxiliar.Constante;
import br.edu.infnet.model.Manutencao;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class ManutencaoDao {

    public static boolean incluir(Manutencao manutencao) {

        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(Constante.TMANUTENCAO, true));

            out.write(manutencao + "\r\n");

            out.close();

            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static List<Manutencao> obterLista() {

        try {
            BufferedReader in = new BufferedReader(new FileReader(Constante.TMANUTENCAO));

            String linha = in.readLine();

            String[] campos = null;

            List<Manutencao> lista = new ArrayList<Manutencao>();

            while (linha != null) {
                campos = linha.split(";");

                DateTimeFormatter form = DateTimeFormatter.ofPattern("dd/MM/yyyy");

                Manutencao m = new Manutencao(
                        campos[1],
                        Float.parseFloat(campos[2].replace(",",".")),
                        Float.parseFloat(campos[3].replace(",",".")),
                        LocalDate.parse(campos[4], form),
                        campos[5],
                        "S".equals(campos[6])
                );

                lista.add(m);

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
