package br.edu.infnet.dao;

import br.edu.infnet.auxiliar.Constante;
import br.edu.infnet.model.Papelaria;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class PapelariaDao {

    public static boolean incluir(Papelaria papelaria) {

        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(Constante.TPAPELARIA, true));

            out.write(papelaria + "\r\n");

            out.close();

            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static List<Papelaria> obterLista() {

        try {
            BufferedReader in = new BufferedReader(new FileReader(Constante.TPAPELARIA));

            String linha = in.readLine();

            String[] campos = null;

            List<Papelaria> lista = new ArrayList<Papelaria>();

            while (linha != null) {
                campos = linha.split(";");

                DateTimeFormatter form = DateTimeFormatter.ofPattern("dd/MM/yyyy");

                Papelaria p = new Papelaria(
                        campos[1],
                        Float.parseFloat(campos[2].replace(",",".")),
                        Float.parseFloat(campos[3].replace(",",".")),
                        LocalDate.parse(campos[4], form),
                        campos[5],
                        "S".equals(campos[6])
                );

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
}
