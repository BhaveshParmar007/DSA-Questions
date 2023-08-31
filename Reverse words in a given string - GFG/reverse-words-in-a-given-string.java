//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}

// } Driver Code Ends



class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String s)
    {
        // code here
        char str [] = s.toCharArray();
        int start = 0;
        int end = 0;
        
        for( ; end<s.length() ; end++){
            if(str[end] == '.'){
                reverse(str , start , end-1);
                
                start = end+1;
            }
            
        }
        reverse(str, start , s.length()-1);
        reverse(str ,0, s.length()-1);
        
        return new String(str);
        
    }
    
    void reverse (char str [] , int i , int j){
        
        while(i<=j){
           char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
        i++;
        j--;
        }
        
    }
}