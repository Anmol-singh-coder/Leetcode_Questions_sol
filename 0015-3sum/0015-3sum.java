class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        List<List<Integer>> outer=new ArrayList<>();
        Arrays.sort(arr);
        int i=0;
        while(i<arr.length-2){
            if(i!=0 && arr[i]==arr[i-1]){
                i++;
                continue;
            }
            int low=i+1;int high=arr.length-1;
            while(low<high){
                // if(arr[low]==arr[low-1]){
                //     low++;
                //     continue;
                // }
                // if(high!=arr.length-1 && arr[high]==arr[high+1]){
                //     high--;
                //     continue;
                // }
                ArrayList<Integer> inner = new ArrayList<>();
                int sum=arr[i]+arr[low]+arr[high];
                if(arr[i]+arr[low]+arr[high]==0){
                    inner.add(arr[i]);
                    inner.add(arr[low]);
                    inner.add(arr[high]);
                    outer.add(inner);
                    low++;
                    while(low != high && arr[low]==arr[low-1]){
                        low++;
                    }
                    
                }else{
                    if(arr[i]+arr[low]+arr[high]<0){
                        low++;
                        while(low != high && arr[low]==arr[low-1]){
                            low++;
                        }
                    }else{
                        high--;
                        while(low != high && arr[high]==arr[high+1]){
                            high--;
                        }
                    }
                }
            }
            i++;
        }
        return outer;
    }
}