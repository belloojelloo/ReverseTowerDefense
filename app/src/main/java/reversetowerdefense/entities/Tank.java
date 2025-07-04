package reversetowerdefense.entities;

public class Tank extends Troop{

    public Tank(String name, int hp, int speed, int damage, TroopType troopType, int hitSpeed) {
        super("Tank", 100, 1 , 5, TroopType.TANK, 1);

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
