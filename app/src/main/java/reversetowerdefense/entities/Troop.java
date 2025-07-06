package reversetowerdefense.entities;

import reversetowerdefense.exceptions.OutofBoundsException;
import reversetowerdefense.lanes.Lane;

public abstract class Troop extends Entity{
    protected final TroopType troopType;
    protected int speed;
    protected int damage;

    public Troop(String name, int hp, int speed, int damage, TroopType troopType, float hitSpeed){
        super(name, hp, attackCooldown, EntityType.TROOP);
        this.damage = damage;
        this.speed = speed;
        this.troopType = troopType;

    }

    //public abstract void move(float deltaTime);
    public abstract void lockonTarget(); //implement here
    public abstract void edrab();

    public String getName() {
        return name;
    }

    public TroopType getTroopType() {
        return troopType;
    }

    public float getHitSpeed() {
        return attackCooldown;
    }

    public void setHitSpeed(float attackCooldown) {
        this.attackCooldown = attackCooldown;
    }
    public boolean isDead(){
        return (hp <= 0);
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
    public void update(float deltaTime){

    }
    public boolean isInRangeOfTarget(Lane lane) throws OutofBoundsException{
        try{
            if((lane.getLane().get(this.getXposition()+1).get(0)) instanceof Tower){
                return true; //if the troop is in range of the tower return true
            }
            return false;
        }
        catch(IndexOutOfBoundsException exception){
            throw new OutofBoundsException();
        }
        
    }
    public void move(float deltaTime){
        xposition += speed * deltaTime;


    }

}
