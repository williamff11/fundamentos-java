package negocio;

public class Aluno extends Pessoa {

    private String turma;

    public Aluno(String firstName, String cpf, String turma){
        this.firstName = firstName;
//        this.LastName = lastName;
        this.cpf = cpf;
        this.turma = turma;
    }
    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    @Override
    public void consultarSituacao() {
        System.out.println("Aluno: ");
        System.out.println("Nome: " +  this.getFirstName());
        System.out.println("CPF: " +  this.getCpf());
        System.out.println("turma: " +  this.getTurma());
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "turma='" + turma + '\'' +
                ", firstName='" + firstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
