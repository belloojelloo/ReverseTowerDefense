package reversetowerdefense.entities;

public class Bomber extends Troop {

    public Bomber(String name, int hp, int speed, int damage, TroopType troopType, int hitSpeed) {
        super("Bomber", 50, 1, 4, TroopType.BOMBER, 5);
        //TODO Auto-generated constructor stub
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