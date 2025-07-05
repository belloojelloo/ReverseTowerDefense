package reversetowerdefense.entities;

public abstract class Tower extends Entity{
    
    protected final int range;
    protected TowerType towerType;
    protected TroopType spawnedTroop;
    


    public Tower(String name, int hp, int range, TowerType towerType, TroopType spawnedTroop, int hitSpeed) {
        super(name, hp, hitSpeed, EntityType.TOWER);
        this.range = range;
        this.towerType = towerType;
        this.spawnedTroop = spawnedTroop;
    }

    public abstract void spawnTroop();
    public abstract void edrab();

    public String getName() {
        return name;
    }
    public int gethitSpeed() {
        return hitSpeed;
    }
    public void sethitSpeed(int hitSpeed){
        this.hitSpeed = hitSpeed;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getRange() {
        return range;
    }

    public TowerType getTowerType() {
        return towerType;
    }

    public void setTowerType(TowerType towerType) {
        this.towerType = towerType;
    }

    public TroopType getSpawnedTroop() {
        return spawnedTroop;
    }

    public void setSpawnedTroop(TroopType spawnedTroop) {
        this.spawnedTroop = spawnedTroop;
    }

    public int getHitSpeed() {
        return hitSpeed;
    }

    public void setHitSpeed(int hitSpeed) {
        this.hitSpeed = hitSpeed;
    }
    


}
