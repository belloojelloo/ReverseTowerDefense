package reversetowerdefense.entities;

public class Entity {
    protected final String name;
    protected int hp;
    protected int hitSpeed;
    protected EntityType entityType;

    public Entity(String name, int hp, int hitSpeed, EntityType entityType){
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
