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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return hasPath(root, targetSum);
    }
    public boolean hasPath(TreeNode root,int target){
        if(root==null){
            return false;
        }
        target=target-root.val;
        if(root.left==null && root.right==null){
            if(target==0){
                return true;
            }
        }
  
        return hasPath(root.left,target) || hasPath(root.right,target);
    }
}