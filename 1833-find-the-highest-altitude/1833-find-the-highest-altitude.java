class Solution {
    public int largestAltitude(int[] gain) {
        int highestAltitude=0;
        int altitudeTracker=0;
        for(int i=0;i<gain.length;i++){
            altitudeTracker+=gain[i];
            if(highestAltitude<altitudeTracker){
                highestAltitude=altitudeTracker;
            }
        }
        return highestAltitude;
    }
}