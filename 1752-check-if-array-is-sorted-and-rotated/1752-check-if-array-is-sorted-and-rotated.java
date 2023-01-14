class Solution {
    public boolean check(int[] nums) {
        int irregularities = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]>nums[(i+1)%nums.length]){
                irregularities ++;
            }
        }
        return (irregularities<=1);
    }
}