package reversetowerdefense.lanes;

import java.util.ArrayList;

import reversetowerdefense.entities.Troop;
import reversetowerdefense.exceptions.*;


public class LaneManager {
    private ArrayList<Lane> lanes;
    private final int numLanes;

    public LaneManager(int numLanes){
        this.numLanes = numLanes;
        lanes =  new ArrayList<Lane>(numLanes);
        
    }
     public ArrayList<Lane> getLanes() {
        return lanes;
    }

    public void setLanes(ArrayList<Lane> lanes) {
        this.lanes = lanes;
    }

    public int getNumLanes() {
        return numLanes;
    }
    public void addTroop(int laneIndex, int column, Troop troop) throws IllegalAddException{
        lanes.get(laneIndex).addTroop(column, troop);
    }
    public void removeTroop(int laneIndex, int column, Troop troop) throws IllegalRemovalException{
        lanes.get(laneIndex).removeTroop(column, troop);
    }
    public void updateAllLanes(float deltaTime){

    }
    public ArrayList<Troop> getTroops(int laneIndex, int column){
        return new ArrayList<>();
    }

    


}