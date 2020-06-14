package negocio;

public class Aluno extends Pessoa {

    private String turma;

    public Aluno(String nameComplete, String cpf, String turma){
        String[] names = nameComplete.split(" ");

        this.setFirstName(names[0]);
        this.setMiddleName(names[1]);
        this.setLastName(names[2]);
        this.setCpf(cpf);
        this.setTurma(turma);
    }
    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
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
        sb.append(String.format("Turma: " + this.getTurma()));

        System.out.println(sb);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "turma='" + turma + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
