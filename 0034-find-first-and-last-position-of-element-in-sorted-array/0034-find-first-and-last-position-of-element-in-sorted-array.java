class Solution {
    public int[] searchRange(int[] arr, int target) {
        
        int [] arr2 = new int [2];
        
        int start = 0;
        int end = arr.length-1;
        int ans1 = -1;
        int ans2 = -1;
        while(start<=end){
            
            int mid = start +(end-start)/2;
            if(arr[mid]==target){
                ans1 =mid;
                end = mid-1;
            }
            else if(arr[mid]>target){
                end = mid-1;
            }
            else if(arr[mid]<target){
                start = mid+1;
            }
        }
        
        arr2[0] = ans1;
        
        start = 0;
        end = arr.length-1;
        
         while(start<=end){
            
            int mid = start +(end-start)/2;
            if(arr[mid]==target){
                ans2 =mid;
                start = mid+1;
            }
            else if(arr[mid]>target){
                end = mid-1;
            }
            else if(arr[mid]<target){
                start = mid+1;
            }
        }
        arr2[1] = ans2;
        
        return arr2;
    }
}