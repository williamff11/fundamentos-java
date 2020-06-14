package br.edu.infnet.dao;

import br.edu.infnet.auxiliar.Constante;
import br.edu.infnet.model.Funcionario;

import java.io.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioDao {

    public static boolean incluir(Funcionario funcionario){

        try{
            BufferedWriter out = new BufferedWriter(new FileWriter(Constante.TFUNCIONARIO,true));

            out.write(funcionario + "\r\n");

            out.close();

            return true;
        } catch (IOException e){
            e.printStackTrace();
        }
        return false;
    }

    public static List<Funcionario> obterLista(){

        try {
            BufferedReader in = new BufferedReader(new FileReader(Constante.TFUNCIONARIO));

            String linha = in.readLine();

            String[] campos = null;

            List<Funcionario> lista = new ArrayList<Funcionario>();

            while (linha != null){
                campos = linha.split(";");

                Funcionario f = new Funcionario(
                        campos[0],
                        campos[1],
                        "S".equals(campos[2])
                );

                lista.add(f);

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
