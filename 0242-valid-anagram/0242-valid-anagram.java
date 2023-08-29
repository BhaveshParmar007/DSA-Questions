class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length()){
            return false;
}
        
        char [] test = new char[256];
        
        for(int i = 0;i<s.length();i++){
            test[s.charAt(i)]++;
        }
        
        for(int i = 0;i<s.length();i++){
            test[t.charAt(i)]--;
        }
        
        for(int i : test){
            if(i != 0){
                return false;
            }
        }
        return true;
    }
}