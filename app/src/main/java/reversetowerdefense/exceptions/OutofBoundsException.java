package reversetowerdefense.exceptions;

public class OutofBoundsException extends GameException{
    public OutofBoundsException(){
        super();
    }
    public OutofBoundsException(String message){
        super(message);
    }

}
