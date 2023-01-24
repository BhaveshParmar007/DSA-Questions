//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;
    Node prev;

    Node(int x) {
        data = x;
        next = null;
        prev= null;
    }

} 
class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int []arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                
            }
            
            Solution obj = new Solution();
            Node ans = obj.constructDLL(arr);
            while(ans!=null){
                System.out.print(ans.data+" ");
                ans=ans.next;
            }
            System.out.println();
            
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    Node constructDLL(int arr[]) {
        // Code here
        Node head = null;
		
		//last for traversalin linkedList
		Node last = null;
		
		for (int i = 0; i < arr.length; i++) {
		    // first case when head is null, this can also safe you if arr is blank
			if (head == null) {
				head = new Node(arr[i]);
				
				// for head- next and prev will be null intially
				head.next = null;
				head.prev = null;
				
				// set last as head, we'll use last for traversal now
				last = head;
			}
            // for 1 to n
			else {
			    // initialize next node
				last.next = new Node(arr[i]);
				
				// inital prev of next node
				last.next.prev = last;
				
				//make last as next, so that we can iterate for upcoming
				last = last.next;
			}

		}
		return head;
	}
}