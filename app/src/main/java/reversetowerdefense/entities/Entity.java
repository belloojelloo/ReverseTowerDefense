package reversetowerdefense.entities;

public abstract class Entity {
    protected final String name;
    protected int hp;
    protected float attackCooldown;
    protected final EntityType entityType;
    protected int xposition;
    protected final float hitSpeed;
    protected boolean isDead = false;


    public Entity(String name, int hp, float hitSpeed, EntityType entityType){
        this.name = name;
        this.hp = hp;
        this.hitSpeed = hitSpeed;
        this.entityType = entityType;
    }

    public EntityType getEntityType() {
        return entityType;
    }

    public int getXposition() {
        return xposition;
    }

    public void setXposition(int xposition) {
        this.xposition = xposition;
    }
   public void takeDamage(int damage) {
        hp -= damage;
    }


}
