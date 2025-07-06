package reversetowerdefense.entities;

public class Ranger extends Troop{

    public Ranger(String name, int hp, int speed, int damage, TroopType troopType, float hitSpeed) {
        super("Ranger", 100, 1 , 5, TroopType.RANGER, 1);

    }


    @Override
    public void move(float deltaTime) {
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
