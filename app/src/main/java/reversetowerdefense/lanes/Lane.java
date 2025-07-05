package reversetowerdefense.lanes;
import reversetowerdefense.exceptions.*;

import java.util.ArrayList;

import reversetowerdefense.entities.Entity;
import reversetowerdefense.entities.EntityType;
import reversetowerdefense.entities.Troop;
import reversetowerdefense.entities.TroopType;

public class Lane {
    private ArrayList<ArrayList<Entity>> lane;
    private final int laneIndex;
    private final int laneSize;
    
    public Lane(int laneIndex, int laneSize){
        this.laneIndex = laneIndex;
        this.laneSize = laneSize;
        this.lane = new ArrayList<ArrayList<Entity>>(laneSize);
        
    }
    public ArrayList<ArrayList<Entity>> getLane() {
        return lane;
    }

    public void setLane(ArrayList<ArrayList<Entity>> lane) {
        this.lane = lane;
    }

    public int getLaneIndex() {
        return laneIndex;
    }

    public int getLaneSize() {
        return laneSize;
    }

    

    

    public void update(float deltaTime){

    }
    public void addTroop(int column,Troop troop) throws IllegalAddException{
        if(lane.get(column).get(0).getEntityType() == EntityType.TOWER){ //checks first if column is a tower
            throw new IllegalAddException("Cannot add troop to Tower");
        }
        else{
            if(lane.get(column).size() > 3){ //checks if the selected column is full
                if(troop.getTroopType() == TroopType.BIRD){ //birds are allowed if it is full
                    lane.get(column).add(troop);
        }
        else{
            throw new IllegalAddException("Column is full"); // throws exception that its not allowed
        }
        }
        else{ //if the column is 3 or less and not a tower then add any troop
            lane.get(column).add(troop);
        }
        }
        
        
    }
    public void removeTroop(int column, Troop troop) throws IllegalRemovalException{
        if(lane.get(column).size() == 0){ //checks if column is empty
            throw new IllegalRemovalException(); //throws exception if column is empty
        }
        else{
            for(int i = 0; i<lane.get(column).size(); i++){
                if(lane.get(column).get(i) == troop){ //loops through column entities to see if there is the desired troop
                    lane.get(column).remove(i);
                    return;
                }
            }
            throw new IllegalRemovalException();
        }
    }
    public ArrayList<Troop> getTroopsAt(int column){
        return new ArrayList<Troop>();
    }
    public void updateLane(float deltaTime){

    }
    public boolean isColumnEmpty(int column){
        return false;
    }
    public boolean isLaneEmpty(){
        return false;
    }
   




}
