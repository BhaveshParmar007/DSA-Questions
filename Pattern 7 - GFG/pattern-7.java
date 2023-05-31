//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            obj.printTriangle(n);
        }
    }
}
// } Driver Code Ends


class Solution {

    void printTriangle(int n) {
        // code here
        for(int i = 0;i<n;i++){
            
            //print the space
            
            for(int a = 0;a<n-i-1;a++){
                System.out.print(" ");
            }
            
            //print the *
            
            for (int a = 0;a<(2*i)+1;a++){
                System.out.print("*");
            }
            
            //print spaces
            
            for(int a = 0;a<n-i-1;a++){
                System.out.print(" ");
            }
            
            System.out.println();
        }
    }
}