package reversetowerdefense.entities;

public class KingTower extends Tower{

    public KingTower(String name, int hp, int range, TowerType towerType, TroopType spawnedTroop, int hitSpeed) {
        super("KING", 1000, 1, TowerType.KING, TroopType.SOLDIER,1);
        
    }

    @Override
    public void spawnTroop() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'spawnTroop'");
    }

    @Override
    public void edrab() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'edrab'");
    }
    
}
