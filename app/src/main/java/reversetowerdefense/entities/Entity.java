package reversetowerdefense.entities;

public abstract class Entity {
    protected final String name;
    protected int hp;
    protected float hitSpeed;
    protected EntityType entityType;
    protected int xposition;


    public Entity(String name, int hp, float hitSpeed, EntityType entityType){
        this.name = name;
        this.hp = hp;
        this.hitSpeed = hitSpeed;
        this.entityType = entityType;
    }

    public EntityType getEntityType() {
        return entityType;
    }

    public void setEntityType(EntityType entityType) {
        this.entityType = entityType;
    }
   


}
