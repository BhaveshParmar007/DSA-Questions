class Solution {
    public int maxSubArray(int[] arr) {
        
        int cursum = 0;
        int maxsum = Integer.MIN_VALUE;
        
        
        for(int i = 0;i<arr.length;i++){
            
            if(cursum >=0){
                cursum = cursum + arr[i]; 
            }
            
            else{
                cursum = arr[i];
            }
            maxsum = Math.max(maxsum,cursum);
        }
        
        return maxsum;
            
        }
    }