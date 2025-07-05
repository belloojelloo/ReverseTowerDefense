package reversetowerdefense.lanes;
import reversetowerdefense.exceptions.*;

import java.util.ArrayList;

import reversetowerdefense.entities.Troop;
import reversetowerdefense.entities.TroopType;

public class Lane {
    private ArrayList<ArrayList<Troop>> lane;
    private final int laneIndex;
    private final int laneSize;
    
    public Lane(int laneIndex, int laneSize){
        this.laneIndex = laneIndex;
        this.laneSize = laneSize;
        this.lane = new ArrayList<ArrayList<Troop>>(laneSize);
        
    }
    public ArrayList<ArrayList<Troop>> getLane() {
        return lane;
    }

    public void setLane(ArrayList<ArrayList<Troop>> lane) {
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
        if(lane.get(column).size() > 3){ //checks if the selected column is full
            if(troop.getTroopType() == TroopType.BIRD){ //birds are allowed if it is full
                lane.get(column).add(troop);
        }
        else{
            throw new IllegalAddException(); // throws excetion that its not allowed
        }
        }
        else{ //if the column is 3 or less then add any troop
            lane.get(column).add(troop);
        }
        
    }
    public void removeTroop(int column, Troop troop) throws IllegalRemovalException{
        if(lane.get(column).size() == 0){
            throw new IllegalRemovalException();
        }
        else{
            //missing
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
