package negocio;

public abstract class Pessoa {

    protected String firstName;
    protected String LastName;
    protected String cpf;

    public abstract void consultarSituacao();

    @Override
    public String toString() {
        return "Pessoa{" +
                "firstName='" + firstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
