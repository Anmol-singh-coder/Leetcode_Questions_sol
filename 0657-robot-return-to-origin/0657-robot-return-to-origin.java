class Solution {
    public boolean judgeCircle(String moves) {
        int y=0;
        int x=0;
        for(char ele:moves.toCharArray()){
            if(ele=='R'){
                x++;
                continue;
            }
            if(ele=='L'){
                x--;
                continue;
            }
            if(ele=='U'){
                y++;
                continue;
            }       
            y--;            
        }
        
        return (x==0 && y==0);
    }
}