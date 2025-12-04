class Solution {
    public boolean judgeCircle(String moves) {
        int y=0;
        int x=0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='R'){
                x++;
                continue;
            }
            if(moves.charAt(i)=='L'){
                x--;
                continue;
            }
            if(moves.charAt(i)=='U'){
                y++;
                continue;
            }       
            y--;            
        }
        if(x==0 && y==0){
            return true;
        }
        return false;
    }
}