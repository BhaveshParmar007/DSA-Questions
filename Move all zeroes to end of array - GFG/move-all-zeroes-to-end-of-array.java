//{ Driver Code Starts
//Initial Template for Java



import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().pushZerosToEnd(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    void pushZerosToEnd(int[] arr, int n) {
        // code here
        
        int i = 0;
        int j = i+1;
        while(j<n){
            if(arr[i]==0 & arr[j] != 0){
                swap(arr,i,j);
                
            }
            else if(arr[i]==0 & arr[j]==0 ){
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
            arr[j] = temp ;
            
    
    }
}