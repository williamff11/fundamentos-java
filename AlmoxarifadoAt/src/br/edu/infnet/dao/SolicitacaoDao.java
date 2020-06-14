package br.edu.infnet.dao;

import br.edu.infnet.auxiliar.Constante;
import br.edu.infnet.model.*;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class SolicitacaoDao {

    public static boolean incluir(Solicitacao solicitacao){

        try{
            BufferedWriter out = new BufferedWriter(new FileWriter(Constante.TSOLICITACAO,false));

            out.write(solicitacao + "\r\n");

            for (Produto p : solicitacao.getProdutos()){
                out.write(p + "\r\n");
            }

            out.close();

            return true;
        } catch (IOException e){
            e.printStackTrace();
        }
        return false;
    }

    public static Solicitacao obter(){

        try {
            BufferedReader in = new BufferedReader(new FileReader(Constante.TSOLICITACAO));

            String linha = in.readLine();

            String[] campos = null;
            Solicitacao solicitacao = null;

            List<Produto> produtos = new ArrayList<Produto>();

            while (linha != null){
                campos = linha.split(";");

                DateTimeFormatter form = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
                DateTimeFormatter formValidade = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                if(campos.length == 5){

                    solicitacao = new Solicitacao();
                    solicitacao.setDataCreate(LocalDateTime.parse(campos[0], form));
                    solicitacao.setQuantidade(Integer.parseInt(campos[1]));

                    Funcionario funcionario = new Funcionario(
                            campos[2],
                            campos[3],
                            "S".equals(campos[4])
                    );

                    solicitacao.setFuncionario(funcionario);
                }else{
                    switch (campos[0]){
                        case "I":
                            Informatica informatica = new Informatica(
                                    campos[1],
                                    Float.parseFloat(campos[2].replace(",",".")),
                                    Float.parseFloat(campos[3].replace(",",".")),
                                    LocalDate.parse(campos[4], formValidade),
                                    campos[5],
                                    "S".equals(campos[6])
                                    );
                            produtos.add(informatica);
                            break;

                        case "M":
                            Manutencao manutencao = new Manutencao(
                                    campos[1],
                                    Float.parseFloat(campos[2].replace(",",".")),
                                    Float.parseFloat(campos[3].replace(",",".")),
                                    LocalDate.parse(campos[4], formValidade),
                                    campos[5],
                                    "S".equals(campos[6])
                            );
                            produtos.add(manutencao);
                            break;

                        case "P":
                            Papelaria papelaria = new Papelaria(
                                    campos[1],
                                    Float.parseFloat(campos[2].replace(",",".")),
                                    Float.parseFloat(campos[3].replace(",",".")),
                                    LocalDate.parse(campos[4], formValidade),
                                    campos[5],
                                    "S".equals(campos[6])
                            );
                            produtos.add(papelaria);
                            break;

                        default:
                            break;
                    }
                }

                linha = in.readLine();
            }
            solicitacao.setProdutos(produtos);
            in.close();

            return solicitacao;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
