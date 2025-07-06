package reversetowerdefense.entities;

public abstract class Entity {
    protected final String name;
    protected int hp;
    protected float attackCooldown;
    protected final EntityType entityType;
    protected int xposition;
    protected final float hitSpeed;


    public Entity(String name, int hp, float attackCooldown, EntityType entityType){
        this.name = name;
        this.hp = hp;
        this.attackCooldown = attackCooldown;
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
   


}
