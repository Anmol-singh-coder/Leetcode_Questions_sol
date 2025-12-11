class Solution {
    public int smallestNumber(int n) {
        // int r=0,num=n;
        
        // while(num!=1){
        //     int mod=num%2;
           
        //     r=r*10+mod;
        //     num=num/2;
        // }
        // r=r*10+1;
       
        // int rev=0;
        // while(r!=0){
        //     int mod=r%10;
        //     if(mod==0){
        //         mod=1;
        //     }
        //     rev=rev*10+mod;
        //     r=r/10;
        // }
        // int an=0;
        // int value=0;
        // while(rev!=0){
        //     an++;
        //     rev=rev/10;
        // }
        
        // for(int i=0;i<an;i++){
        //     int mul=1;
        //     for(int j=0;j<=i;j++){
        //         mul*=2;
        //     }
        //     mul=mul/2;
        //     value=value+mul;
        // }
        // return value;

        return (1<<(int)((Math.log(n)/Math.log(2))+1))-1;
    }
}