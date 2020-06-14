package negocio;

public class Professor extends Pessoa {

    private boolean mestre;

    public Professor(String nameComplete, String cpf, boolean mestre) {

        String sl = nameComplete;
        int space = sl.indexOf(' ');
        String name = sl.substring(0, space);
        System.out.println(name);
        this.firstName = name;
        int space2 = sl.lastIndexOf(' ');
        String name2 = sl.substring(space + 1, space2);
        this.middleName = name2;

        int space3 = sl.lastIndexOf(' ');
        String name3 = sl.substring(space3 + 1);
        this.lastName = name3;
        this.cpf = cpf;
        this.mestre = mestre;
    }

    public boolean isMestre() {
        return mestre;
    }

    public void setMestre(boolean mestre) {
        this.mestre = mestre;
    }

    @Override
    public void consultarSituacao() {
        StringBuilder sb = new StringBuilder();

        sb.append("Nome Completo: ").append(this.getFirstName() + " ").append(this.getMiddleName() + " ")
                .append(this.getLastName() + "\n");
        sb.append(String.format("Primeiro Nome: " + this.getFirstName() + "\n"));
        sb.append(String.format("Nome do meio: " + this.getMiddleName() + "\n"));
        sb.append(String.format("Ultimo nome: " + this.getLastName() + "\n"));
        sb.append(String.format("CPF: " + this.getCpf() + "\n"));
        sb.append(String.format("Mestrado? " + " "));
        sb.append(String.format(this.isMestre() ? "sim" : "não"));

        System.out.println(sb);

    }
}
