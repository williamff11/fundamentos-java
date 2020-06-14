package exceptions;

public class NameException extends Exception{

    @Override
    public String toString() {
        return "Um nome deve conter: Nome + Nome do Meio + Ultimo Nome";
    }
}
