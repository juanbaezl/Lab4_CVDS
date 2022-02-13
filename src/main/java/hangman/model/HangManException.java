package hangman.model;

public class HangManException extends Exception{
    public static final String NEGATIVE_NUMBER = "Numbers can't be negative";
    public HangManException(String mensaje){
        super(mensaje);
    }
}