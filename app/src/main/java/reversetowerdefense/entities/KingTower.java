package reversetowerdefense.entities;

public class KingTower extends Tower{

    public KingTower(String name, int hp, int range, TowerType towerType, TroopType spawnedTroop, float hitSpeed, int damage, int level) {
        super("KING", 1000, 1, TowerType.KING, TroopType.SOLDIER,1, 100, level);
        
    }

    @Override
    public void spawnTroop() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'spawnTroop'");
    }

    
    
}
