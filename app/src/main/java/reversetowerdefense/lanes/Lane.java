package reversetowerdefense.lanes;
import reversetowerdefense.exceptions.*;

import java.util.ArrayList;

import reversetowerdefense.entities.Entity;
import reversetowerdefense.entities.EntityType;
import reversetowerdefense.entities.Tower;
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
    


    public void updateLane(float deltaTime){
        
    }
    public void addTroop(int column,Troop troop) throws IllegalAddException{
        if(lane.get(column).get(0).getEntityType() == EntityType.TOWER){ //checks first if column is a tower
            throw new IllegalAddException("Cannot add troop to Tower");
        }
        else{
            if(lane.get(column).size() > 3){ //checks if the selected column is full
                if(troop.getTroopType() == TroopType.BIRD){ //birds are allowed if it is full
                    lane.get(column).add(troop);
                    troop.setXposition(column);
        }
        else{
            throw new IllegalAddException("Column is full"); // throws exception that its not allowed
        }
        }
        else{ //if the column is 3 or less and not a tower then add any troop
            lane.get(column).add(troop);
             troop.setXposition(column);
        }
        }
        
        
    }
    public void removeTroop(int column, Troop troop) throws IllegalRemovalException{
        if(lane.get(column).get(0).getEntityType() == EntityType.TOWER){ //checks first if column is a tower
            throw new IllegalRemovalException("Cannot remove tower");
        }
        if(lane.get(column).size() == 0){ //checks if column is empty
            throw new IllegalRemovalException(); //throws exception if column is empty
        }
        else{
            for(int i = 0; i<lane.get(column).size(); i++){
                if(lane.get(column).get(i).equals(troop) && lane.get(column).get(i).getEntityType() == EntityType.TROOP){ 
                    //loops through column entities to see if there is the desired troop
                    lane.get(column).remove(i);
                    return;
                }
            }
            throw new IllegalRemovalException();
        }
    }
    public ArrayList<Entity> getTroopsAt(int column) throws InvalidSelectionException{
        
        if(lane.get(column).size() == 0){
            throw new InvalidSelectionException("No Entities Selected");
        }
        
        if(lane.get(column).get(0).getEntityType() == EntityType.TOWER){
            throw new InvalidSelectionException("Cannot select troops at a tower");
        }
        
        return lane.get(column);
    }
    
    public void addTower(int column, Tower tower) throws IllegalAddException{
        if(lane.get(column).size() == 0){
            lane.get(column).add(0,tower);
            lane.get(column).get(0).setXposition(column);
            
        }
        else{
            throw new IllegalAddException("Entities exist in this column");
        }
    }
    public void removeTower(int column, Tower tower) throws IllegalRemovalException{
        if(!(lane.get(column).get(0).equals(tower))){ //checks if there is a tower and throws exception if there isnt
            throw new IllegalRemovalException("No tower found");
        }
        else{
            lane.get(column).remove(0); //removes tower
        }
    }

    
    public boolean isColumnEmpty(int column){
        return (lane.get(column).size() > 0);
    }
    public boolean isLaneEmpty(){
        
        for(int i = 0; i < lane.size(); i++){
            if(lane.get(i).size() > 0){
                return false;
            }
        }
        return true;
    }
   




}
