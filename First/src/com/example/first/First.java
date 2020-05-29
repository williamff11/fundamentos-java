package com.example.first;

public class First {
    public static void main(String[] args){
//        String nome = args[0];
//        int idade = Integer.valueOf(args[1]);
        Aluno aluno = new Aluno();

         aluno.nome = args[0];
         aluno.idade = Integer.valueOf(args[1]);
         aluno.mensalidade = Float.valueOf(args[2]);
         aluno.veterano = Boolean.valueOf(args[3]);

        int qtddeMeses = Integer.valueOf(args[4]);
        float primeiraAvaliacao = Float.valueOf(args[5]);
        float segundaAvaliacao = Float.valueOf(args[6]);

        aluno.imprimir();
    }
}
