package reversetowerdefense.entities;

public class SubTower extends Tower{




    public SubTower(String name, int hp, int range, TowerType towerType, TroopType spawnedTroop, float hitSpeed, int damage) {
        super("Sub", 500, 1, TowerType.SUB, TroopType.SOLDIER, 1, 50);
        
    }

    @Override
    public void spawnTroop() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'spawnTroop'");
    }

    
    
}
