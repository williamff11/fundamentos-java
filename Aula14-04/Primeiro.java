public class Primeiro {
    public static void main(String[] args) {
        // Entrada de Dados
        String nome = args[0];
        int idade = Integer.valueOf(args[1]);
        float mensalidade = Float.valueOf(args[2]);
        boolean veterano = Boolean.valueOf(args[3]);
        int qntdeMeses = Integer.valueOf(args[4]);
        float primeiraAvaliacao = Float.valueOf(args[5]);
        float segundaAvaliacao = Float.valueOf(args[6]);

        // Processamento
        if (idade > 18) {
            System.out.println("Situação: velho pakas");
        } else {
            System.out.println("Situação: novo");
        }

        // Saída de dados
        System.out.println(nome + " - " + idade + " - " + mensalidade + " - " + veterano);
        System.out.println("Valor anual: " + (mensalidade * qntdeMeses));
        /**
         * ? => SE 
         * : => SENÃO
         */
        System.out.println("Situação: " + (idade > 16 ? "velho" : "novo"));

        System.out.println("Média: " + ((primeiraAvaliacao + segundaAvaliacao) / 2));
    }
}