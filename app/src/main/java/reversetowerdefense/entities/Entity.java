package reversetowerdefense.entities;

import java.util.ArrayList;

import reversetowerdefense.exceptions.OutofBoundsException;
import reversetowerdefense.lanes.Lane;

public abstract class Entity {
    protected final String name;
    protected int hp;
    protected float attackCooldown;
    protected final EntityType entityType;
    protected int xposition;
    protected final float hitSpeed;
    protected boolean isDead = false;
    protected int level;


    public Entity(String name, int hp, float hitSpeed, EntityType entityType, int level){
        this.name = name;
        this.hp = hp;
        this.hitSpeed = hitSpeed;
        this.entityType = entityType;
        this.level = level;
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
    public abstract void update(float deltaTime, ArrayList<ArrayList<Entity>> lane) throws OutofBoundsException;

    public boolean isDead() {
        return isDead;
    }


}
