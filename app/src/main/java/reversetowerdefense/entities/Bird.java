package reversetowerdefense.entities;

public class Bird extends Troop{

    public Bird(String name, int hp, int speed, int damage, TroopType troopType, float hitSpeed) {
        super("Bird", 100, 1 , 5, TroopType.BIRD, 1);

    }


    @Override
    public void move() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'move'");
    }

    @Override
    public void lockonTarget() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'lockonTarget'");
    }

    @Override
    public void edrab() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'edrab'");
    }
    
    




}
