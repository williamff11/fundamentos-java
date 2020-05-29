public class Aluno {

    String nome;
    int idade;
    float mensalidade;
    boolean veterano;

    int qtdeMeses;
    float primeiraAvaliacao;
    float segundaAvaliacao;

    private float calcularMedia(){
        return (primeiraAvaliacao + segundaAvaliacao)/2;
    }

    private String obterSituacao(){
        return idade > 16 ? "velho" : "novo";
    }

    private float calcularValorAnual(){
        return mensalidade * qtdeMeses;
    }

    private String obterRelatorio(){
        return nome + " - " +  idade + " - " +  mensalidade + " - " +  veterano
    }

    public void imprimir() {
        System.out.println(calcularMedia());
        System.out.println(obterSituacao());
        System.out.println(calcularValorAnual());
        System.out.println(obterRelatorio());
    }

}