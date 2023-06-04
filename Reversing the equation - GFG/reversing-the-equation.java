//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine().trim());
        while(t-- > 0)
        {
            String s;
            s = in.readLine().trim();
            
            Solution ob = new Solution();
            
            out.println(ob.reverseEqn(s));    
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
   
    String reverseEqn(String S)
    {
        // your code here
        
        String [] equation = S.split("(?<=\\d)(?=\\D)|(?<=\\D)(?=\\d)");
        
        int start = 0;
        int end = equation.length-1;
        while(start<end){
           String temp = equation[start];
            equation[start] = equation[end];
            equation[end] = temp;
            start++;
            end--;
        }
        
        //concatinate the reverse arraqy into string
        StringBuilder reversedEquation = new StringBuilder();
        for (String element : equation) {
            reversedEquation.append(element);
        }

        return reversedEquation.toString();
    }
        
    }