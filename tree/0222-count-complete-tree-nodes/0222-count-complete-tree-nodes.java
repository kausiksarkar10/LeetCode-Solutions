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
    public int countNodes(TreeNode root) {
        if(root==null){
            return 0;
        }
        int left=heightleft(root);
        int right=heightright(root);

        if (left== right) {
            return (1 << left +1) - 1;
        }

        return 1 + countNodes(root.left) + countNodes(root.right);
        
    }
    public int heightleft(TreeNode root){
        if(root==null || root.left==null){
            return 0;
        }
        return 1 + heightleft(root.left);
    }
    public int heightright(TreeNode root){
        if(root==null || root.right==null){
            return 0;
        }
        return 1+heightright(root.right);
    }
}