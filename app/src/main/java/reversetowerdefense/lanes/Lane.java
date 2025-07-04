package reversetowerdefense.lanes;
import reversetowerdefense.exceptions.*;

import java.util.ArrayList;

import reversetowerdefense.entities.Troop;

public class Lane {
    private ArrayList<ArrayList<Troop>> lane;
    private final int laneIndex;
    private int laneSize;
    

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

    public void setLaneSize(int laneSize) {
        this.laneSize = laneSize;
    }

    public Lane(int laneIndex){
        this.laneIndex = laneIndex;
        this.lane = new ArrayList<ArrayList<Troop>>();
    }

    public void update(float deltaTime){

    }
    public void addTroop(int column,Troop troop) throws IllegalAddException{

    }
    public void removeTroop(int column, Troop troop) throws IllegalRemovalException{
        
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
