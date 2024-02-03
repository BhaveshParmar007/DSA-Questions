class Solution {
    public void rotate(int[][] matrix) {
        
        transpose(matrix);
        
        reverse_row(matrix);
        
    }
    
  void transpose (int [][] mat){
        int n = mat.length;
       for(int i = 0;i<n;i++){
           for(int j = i+1 ; j<n ;j++){
               int temp = mat[i][j];
               mat[i][j] = mat[j][i];
               mat[j][i] = temp;
           }
       }
    }
    
  void  reverse_row(int [][]mat){
        
        int n = mat.length;
        
       for(int i = 0;i<n ;i++){
           
           int left = 0;
           int right = n-1;
           
           while(left < right){
               int temp = mat[i][left];
               mat[i][left] = mat[i][right];
               mat[i][right] = temp;
               left++;
               right--;
           }
           
       }
    }
    
    
    
    
}