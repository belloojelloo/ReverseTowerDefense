package reversetowerdefense.entities;

public abstract class Troop extends Entity{
    protected final TroopType troopType;
    protected int speed;
    protected int damage;

    public Troop(String name, int hp, int speed, int damage, TroopType troopType, int hitSpeed){
        super(name, hp, hitSpeed, EntityType.TROOP);
        this.damage = damage;
        this.speed = speed;
        this.troopType = troopType;

    }

    public abstract void move();
    public abstract void lockonTarget(); //implement here
    public abstract void edrab();

    public String getName() {
        return name;
    }

    public TroopType getTroopType() {
        return troopType;
    }

    public int getHitSpeed() {
        return hitSpeed;
    }

    public void setHitSpeed(int hitSpeed) {
        this.hitSpeed = hitSpeed;
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


}
