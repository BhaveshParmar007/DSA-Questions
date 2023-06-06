//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.util.HashMap;

class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) 
                a[i] = sc.nextInt();
            Solution g = new Solution();
            
            ArrayList<Integer> ans = g.countDistinct(a, n, k);

            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
            t--;
        }
    }
}
// } Driver Code Ends


class Solution {
    ArrayList<Integer> countDistinct(int A[], int n, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> windowMap = new HashMap<>();

        // Count the frequency of elements in the first window
        for (int i = 0; i < k; i++) {
            windowMap.put(A[i], windowMap.getOrDefault(A[i], 0) + 1);
        }

        // Add the count of distinct elements in the first window to the result
        result.add(windowMap.size());

        // Slide the window and update the frequency map
        for (int i = k; i < n; i++) {
            // Remove the element going out of the window
            if (windowMap.get(A[i - k]) == 1) {
                windowMap.remove(A[i - k]);
            } else {
                windowMap.put(A[i - k], windowMap.get(A[i - k]) - 1);
            }

            // Add the element coming into the window
            windowMap.put(A[i], windowMap.getOrDefault(A[i], 0) + 1);

            // Add the count of distinct elements in the current window to the result
            result.add(windowMap.size());
        }

        return result;
    }
}
