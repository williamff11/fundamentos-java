package br.edu.infnet.exceptions;

public class DataTimeException extends Exception {

    public String toString(){
        return "A data deve ser inserida dessa maneira: dd/MM/yyyy HH:mm";
    }
}
