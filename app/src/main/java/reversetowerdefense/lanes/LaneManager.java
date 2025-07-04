package reversetowerdefense.lanes;

import java.util.ArrayList;

public class LaneManager {
    private ArrayList<Lane> lanes;
    private final int numLanes;
   
    private int numColumns;

    public LaneManager(int numLanes, int numColumns){
        this.numLanes = numLanes;
        this.numColumns = numColumns;
        lanes =  new ArrayList<Lane>();
        for(int i = 0; i<numLanes; i++){
            lanes.get(i).setLaneSize(numColumns);
        }
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

    public int getNumColumns() {
        return numColumns;
    }

    public void setNumColumns(int numColumns) {
        this.numColumns = numColumns;
    }

}