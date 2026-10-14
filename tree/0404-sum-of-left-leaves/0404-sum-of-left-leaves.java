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
    int sumLeft=0;
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null){
            return 0;
        }
        left(root);
        return sumLeft;

        
    }
    public void left(TreeNode root){
        if(root==null){
            return;
        }
        if(root.left!=null && root.left.left==null && root.left.right==null){
            sumLeft+=root.left.val;
        }
        left(root.left);
        left(root.right);
        return;
    }
}