package reversetowerdefense.entities;

public class Medic extends Troop {

    public Medic(String name, int hp, int speed, int damage, TroopType troopType, float hitSpeed) {
        super(" Medic", 200, 3, -5, TroopType.MEDIC, 1);
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