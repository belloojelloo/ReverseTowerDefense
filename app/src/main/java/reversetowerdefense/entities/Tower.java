package reversetowerdefense.entities;

import java.util.ArrayList;

import reversetowerdefense.exceptions.OutofBoundsException;

public abstract class Tower extends Entity{
    
    protected final int range;
    protected TowerType towerType;
    protected TroopType spawnedTroop;
    protected int damage;
    


    public Tower(String name, int hp, int range, TowerType towerType, TroopType spawnedTroop, float hitSpeed, int damage) {
        super(name, hp, hitSpeed, EntityType.TOWER);
        this.range = range;
        this.towerType = towerType;
        this.spawnedTroop = spawnedTroop;
        this.damage = damage;
    }

    public abstract void spawnTroop();
    

    public String getName() {
        return name;
    }
    public float getHitSpeed() {
        return hitSpeed;
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
    private void reduceAttackCooldown(float deltaTime) {
        attackCooldown -= deltaTime;
    }
    private boolean isInRangeOfTarget(ArrayList<ArrayList<Entity>> lane) {
        try{
            if(lane.get(xposition-range).size() != 0 && !(lane.get(xposition).get(0) instanceof Tower)){
                return true; // if troop is within range and is not a tower return true
            }
            return false;
        }
        catch(IndexOutOfBoundsException s){
            return false;
        }
        
    }
    private void edrab(Entity enemy) {
        if(enemy != null){
            enemy.takeDamage(damage);
        }
    }
    private void resetAttackCooldown() {
        attackCooldown = hitSpeed;
    }
    @Override
    public void update(float deltaTime, ArrayList<ArrayList<Entity>> lane) throws OutofBoundsException {
        if(isDead == true){
            return; //if dead do nothing
        }
        reduceAttackCooldown(deltaTime);
        if(isInRangeOfTarget(lane) && attackCooldown == 0){
            edrab(lane.get(xposition-range).get(lane.get(xposition-range).size()-1));
            resetAttackCooldown();
        }
        if(hp<=0){
            hp = 0;
            isDead = true;
        }
        
    }

    

    

    

    

    

    
    


}
