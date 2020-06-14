package br.edu.infnet.dao;

import br.edu.infnet.auxiliar.Constante;
import br.edu.infnet.model.Informatica;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Float.parseFloat;

public class InformaticaDao {

    public static boolean incluir(Informatica informatica) {

        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(Constante.TINFORMATICA, true));

            out.write(informatica + "\r\n");

            out.close();

            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static List<Informatica> obterLista() {

        try {
            BufferedReader in = new BufferedReader(new FileReader(Constante.TINFORMATICA));

            String linha = in.readLine();

            String[] campos = null;

            List<Informatica> lista = new ArrayList<Informatica>();

            while (linha != null) {
                campos = linha.split(";");
                DateTimeFormatter form = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                Informatica informatica = new Informatica(
                        campos[1],
                        Float.parseFloat(campos[2].replace(",",".")),
                        Float.parseFloat(campos[3].replace(",",".")),
                        LocalDate.parse(campos[4], form),
                        campos[5],
                        "S".equals(campos[6])
                        );

                lista.add(informatica);

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
