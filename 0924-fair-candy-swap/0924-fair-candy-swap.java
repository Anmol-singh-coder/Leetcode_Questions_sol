class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int alicesum=0,bobsum=0;
        for(int i:aliceSizes){
            alicesum+=i;
        }
        for(int i:bobSizes){
            bobsum+=i;
        }
        
        if(aliceSizes.length>bobSizes.length){
            Arrays.sort(bobSizes);
            for(int i:aliceSizes){
                int st=0;
                int end=bobSizes.length-1;
                while(st<=end){
                    int mid=st+(end-st)/2;
                    if(alicesum-i+bobSizes[mid]==bobsum-bobSizes[mid]+i){
                        return new int[]{i,bobSizes[mid]};
                    }else if(alicesum-i+bobSizes[mid]>bobsum-bobSizes[mid]+i){
                        end=mid-1;
                    }else{
                        st=mid+1;
                    }
                }
            }
        }else{
            Arrays.sort(aliceSizes);
            for(int i:bobSizes){
                int st=0;
                int end=aliceSizes.length-1;
                while(st<=end){
                    int mid=st+(end-st)/2;
                    if(bobsum-i+aliceSizes[mid]==alicesum-aliceSizes[mid]+i){
                        return new int[]{aliceSizes[mid],i};
                    }else if(bobsum-i+aliceSizes[mid]>alicesum-aliceSizes[mid]+i){
                        end=mid-1;
                    }else{
                        st=mid+1;
                    }
                }
            }
        }
        return new int[]{-1,-1};
    }
}