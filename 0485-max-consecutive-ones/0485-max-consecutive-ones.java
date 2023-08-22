class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        int sum = 0;
        int max = 0;
        for (int i = 0;i<arr.length;i++){
            if(arr[i]==1){
                sum = sum +1;
                max = Math.max(max,sum);
            }
             
            else{
                sum = 0;
            }
        }
        return max;
    }
}