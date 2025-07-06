package reversetowerdefense.entities;

import reversetowerdefense.exceptions.OutofBoundsException;
import reversetowerdefense.lanes.Lane;

public abstract class Troop extends Entity{
    protected final TroopType troopType;
    protected int speed;
    protected int damage;

    public Troop(String name, int hp, int speed, int damage, TroopType troopType, float hitSpeed){
        super(name, hp, hitSpeed, EntityType.TROOP);
        this.damage = damage;
        this.speed = speed;
        this.troopType = troopType;

    }

    
    public void edrab(Entity enemy){
        if(enemy != null){
            enemy.takeDamage(damage);
        }
    }

    public String getName() {
        return name;
    }

    public TroopType getTroopType() {
        return troopType;
    }

    public float getHitSpeed() {
        return hitSpeed;
    }

    public boolean isDead(){
        return isDead;
    }
    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
    public void resetAttackCooldown(){
        attackCooldown = hitSpeed;
    }
    public boolean isInRangeOfTarget(Lane lane){
        try{
            if((lane.getLane().get(this.getXposition()+1).get(0)) instanceof Tower){
                return true; //if the troop is in range of the tower return true
            }
            return false;
        }
        catch(IndexOutOfBoundsException exception){
            return false; // if at world border return false (still wont be able to move)
        }
        
    }
    public void reduceAttackCooldown(float deltaTime){
        if(attackCooldown > 0){
            attackCooldown -= deltaTime;
            if(attackCooldown < 0){
                attackCooldown = 0;
            }
        }
    }
    public void move(float deltaTime, Lane lane) throws OutofBoundsException{
        if(!isInRangeOfTarget(lane)){ //if not in range of target check for other conditions to move
           try{
                if(lane.getLane().get(xposition+1).size() < 3){ //if the next column has less than three you are free to move
                    xposition += speed * deltaTime;
                }
                else if(troopType == TroopType.BIRD){ //if it is a bird it can move regardless
                    xposition += speed * deltaTime;
                }
                
           }
           catch(IndexOutOfBoundsException s){ //do nothing if at the world border

           }
           
        }
    }
    public void update(float deltaTime, Lane lane) throws OutofBoundsException{
        if(isDead == true){
            return; //if dead do nothing
        }
        reduceAttackCooldown(deltaTime); //else reduce cooldown
        if(!isInRangeOfTarget(lane)){
            move(deltaTime, lane); // move if no building in front of you
        }
        else if(isInRangeOfTarget(lane) && attackCooldown == 0){ //if there is a tower in front of you and you can attack then attack
            edrab(lane.getLane().get(xposition+1).get(0));
            resetAttackCooldown();

        }
        if(hp<=0){
            hp = 0; //if dead then die
            isDead = true;

        }

    }

}
