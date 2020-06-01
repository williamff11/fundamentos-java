package exceptions;

public class NotaException extends Exception{

    @Override
    public String toString() {
        return "Nota menor que zero";
    }
}
