//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

class GFG{
	public static void main(String [] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while(test-- > 0) {
			int N = sc.nextInt();
			Solution obj = new Solution();
			obj.toBinary(N);
			System.out.println();
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution{
	void toBinary(int n) {
		//Write your code here
		System.out.print(ans(n));
		
	}
	
	int ans (int n ){
	    if(n == 0){
		    return 0;
		}
		
		return ((n % 2 ) + 10 * ans(n/2)  );
	}
}