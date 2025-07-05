package reversetowerdefense.lanes;

import java.util.ArrayList;

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

    


}