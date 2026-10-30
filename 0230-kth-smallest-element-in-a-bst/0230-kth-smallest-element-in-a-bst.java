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
    int K=0;
    int ans=0;
    public int kthSmallest(TreeNode root, int k) {
        if(root==null){
            return 0;
        }
        K=k;
        kthsmallest(root);
        return ans;
    }
    public void kthsmallest(TreeNode root){
        if(root==null || K==0){
            return;
        }
        kthsmallest(root.left);
        K--;
        if(K==0){
            ans=root.val;
            return;
        }
        
        kthsmallest(root.right);
        return;
    }
}