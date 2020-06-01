package negocio;

public class Professor extends Pessoa {

    private boolean mestre;

    public Professor(String firstName, String cpf, boolean mestre) {
        this.firstName = firstName;
//        this.LastName = lastName;
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
        System.out.println("Aluno: ");
        System.out.println("Nome: " + this.getFirstName());
        System.out.println("CPF: " + this.getCpf());
        System.out.println(String.format("Mestrado: %s",
                this.isMestre() ? "sim" : "não"));
    }
}
