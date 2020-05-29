package testes;

public class Cliente {
    private int codigo;
    private String primeiroNome;
    private String ultimoNome;

    public Cliente() {
    }

    public Cliente(int codigo, String primeiroNome, String ultimoNome) {
        this.codigo = codigo;
        this.primeiroNome = primeiroNome;
        this.ultimoNome = ultimoNome;
    }

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }
}
