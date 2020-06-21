package testes;

import model.Aluno;

import java.util.*;

public class App {
   private static Map<String, Aluno> salarioFunc;

    private static float calcularTotal(){
        float soma = 0;
        for (Aluno a : salarioFunc.values()){
            soma = soma + a.salario;
        }
        return soma;
    }

    public static void main(String[] args) {

        salarioFunc = new HashMap<String,Aluno>();
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            System.out.println("Nome: ");
            String nome = in.next();
            System.out.println("Salario: ");
            Float salario = in.nextFloat();
            salarioFunc.put(nome, new Aluno(nome, salario));

        }
        System.out.println("Total Salarial: " + calcularTotal());
        in.close();
//        Set<String> alunos = new HashSet<String>();
//        alunos.add("Joao");
//        alunos.add("maria");
//        alunos.add("maria");
//        alunos.add("maria");
//        alunos.add("maria");
//        alunos.add("maria");
//        alunos.add("jose");
//        System.out.println(alunos.size());

//        Set<Aluno> listaALuno = new HashSet<Aluno>();
//        listaALuno.add(new Aluno("Joao"));
//        listaALuno.add(new Aluno("maria"));
//        listaALuno.add(new Aluno("Joao"));
//        listaALuno.add(new Aluno("maria"));
//        listaALuno.add(new Aluno("Joao"));
//        listaALuno.add(new Aluno("maria"));
//        listaALuno.add(new Aluno("Joao"));
//        System.out.println(listaALuno.size());


        //        Scanner in = new Scanner(System.in);
//
//        System.out.println("Qnt de Alunos?");
//        int qtnAluno = in.nextInt();
//
//        for (int i = 0; i < qtnAluno; i++) {
//            System.out.println("Nome: ");
//            AlunoDao.incluir(in.next());
//        }
//        System.out.println("Lista: ");
//        List<String> lista = AlunoDao.obterLista();
//        if (lista != null) {
//            System.out.println(">>" + lista);
//        } else {
//            System.out.println("sem registros");
//        }
//        System.out.println("Exclusão de Aluno: ");
//        AlunoDao.excluir(in.nextInt());
//        List<String> lista2 = AlunoDao.obterLista();
//        if (lista2 != null) {
//            System.out.println(">>" + lista2);
//        } else {
//            System.out.println("sem registros");
//        }
//        AlunoDao.incluir("Freire");


        // map -> key:value

//        Map<String, String> mapaEmailAluno = new HashMap<String, String>();
//
//        mapaEmailAluno.put("joao", "joao@g.com");
//        mapaEmailAluno.put("maria", "maria@g.com");
//        mapaEmailAluno.put("jose", "jose@g.com");
//
//        System.out.println(mapaEmailAluno);
//
//        for (String key : mapaEmailAluno.keySet()){
//            System.out.println("- " + key);
//        }
//        mapaEmailAluno.remove("joao");
//        mapaEmailAluno.put("maria", "maria@g.com");
//
//        for (String value : mapaEmailAluno.values()){
//            System.out.println("- " + value);
//        }
//
//        System.out.println(mapaEmailAluno.containsKey("joao"));
//        System.out.println(mapaEmailAluno.containsValue("maria@g.com"));
//
//        for(String aluno : mapaEmailAluno.keySet()){
//            System.out.println(aluno + " - " + mapaEmailAluno.get(aluno));
//        }
    }

}
