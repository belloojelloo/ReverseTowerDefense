package reversetowerdefense.exceptions;

public class IllegalRemovalException extends GameException{
    public IllegalRemovalException(){
        super();
    }

    public IllegalRemovalException(String message){
        super(message);
    }
}