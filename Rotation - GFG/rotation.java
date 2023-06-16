//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int ans = new Solution().findKRotation(a, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int findKRotation(int arr[], int n) {
        // code here
        
        int start = 0;
        int end = arr.length-1;
        
        while(start<=end){
            
             if (arr[start] <= arr[end]) {
                return start;
            }
           int mid = start+(end-start)/2;
            
            int next = (mid+1)%n;
            int prev = (mid-1+n)%n;  // notice this detail
            
            if(arr[mid]<arr[next] && arr[mid]<arr[prev]){
                return mid;
            }
            
            else if(arr[mid]<=arr[end]){
                end = mid-1;                  // 
            }
            
            else if(arr[mid]>=arr[start]){
                start = mid+1;
            }
        }
        return -1;
    }
}