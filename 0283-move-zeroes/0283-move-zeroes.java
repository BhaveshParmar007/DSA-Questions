class Solution {
    public void moveZeroes(int[] arr) {
        int n = arr.length;
      int i = 0;
        int j = i+1;
        while(j<n){
            if(arr[i]==0 & arr[j] != 0){
                swap(arr,i,j);
            }
            else if(arr[i]==0 & arr[j]==0){
                j++;
            }
            
           else{
                 j++;
            i++;
           } 
        }

        

    }
    
    public static void swap(int [] arr,int i ,int j){
        
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}