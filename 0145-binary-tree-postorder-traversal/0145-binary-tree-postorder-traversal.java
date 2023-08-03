/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        
        List<Integer> list = new LinkedList<>();
      return answer(list,root);
    }
    
    static List<Integer> answer(List<Integer> list , TreeNode root){
        
        if(root != null){
            
            answer(list,root.left);
            
            answer(list,root.right);
            
            list.add(root.val);
        }
        
        return list;
  
        
        
    }
}