package reversetowerdefense.entities;

public class Soldier extends Troop{

    public Soldier(String name, int hp, int speed, int damage, TroopType troopType, float hitSpeed) {
        super("Soldier", 100, 1 , 5, TroopType.SOLDIER, 1);
        
    }


    @Override
    public void move(float deltaTime) {
        
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
