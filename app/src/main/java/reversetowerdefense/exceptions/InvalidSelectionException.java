package reversetowerdefense.exceptions;

public class InvalidSelectionException extends GameException {
    public InvalidSelectionException(){
        super();
    }
    public InvalidSelectionException(String message){
        super(message);
    }
}
