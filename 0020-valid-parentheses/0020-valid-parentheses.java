class Solution {
    public boolean isValid(String s) {
        
        
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            //char ch = s.charAt(i);
            
            if(ch =='('){
                st.push(')');
                
            }
             else if(ch =='{'){
                st.push('}');
                
            }
             else if(ch =='['){
                st.push(']');
                
            }
            
            else if(st.isEmpty() || st.pop() != ch){
                return false;
            }
            
            
        }
        
        return st.isEmpty();
    }
}