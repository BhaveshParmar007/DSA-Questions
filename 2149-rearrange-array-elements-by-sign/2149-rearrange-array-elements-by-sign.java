class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        // +ve -> 0 2 4 6
        // -ve -> 1 3 5 7
        
        int [] arr = new int [nums.length];
        
        int positive_place = 0;
        int negative_place = 1;
        
        for(int i = 0 ;i<nums.length ;i++){
            
            
            if(nums[i] <0){
                arr[negative_place] = nums[i];
                negative_place = negative_place + 2;
            }
            else{
                arr[positive_place] = nums[i];
                positive_place = positive_place + 2;
            }
            
            
        }
        return arr;
    }
}