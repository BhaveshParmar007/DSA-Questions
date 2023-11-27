class Solution {
    public int maxSubArray(int[] arr) {
        
         int currsum = 0;
        int max = Integer.MIN_VALUE;
        
        int n = arr.length;
        
        for(int i = 0; i<n ;i++){
            
            if(currsum >=0){
                currsum += arr[i];
            }
            
            else {
                currsum = arr[i];
            }
            
            max = Math.max(currsum , max);
        }
        
        return max;  
    }
}