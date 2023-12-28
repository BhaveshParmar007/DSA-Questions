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
    public int diameterOfBinaryTree(TreeNode root) {
        
        int arr [] = new int [1];
        
        distance(root , arr);
        return arr[0];
    }
    
    int distance(TreeNode root , int [] diameter){
        if(root == null){
            return 0;
        }
        
        int left = distance(root.left , diameter);
        int right = distance(root.right , diameter);
        
        diameter[0] = Math.max(diameter[0] , left+right);
        return 1+Math.max(left, right);
    }
}