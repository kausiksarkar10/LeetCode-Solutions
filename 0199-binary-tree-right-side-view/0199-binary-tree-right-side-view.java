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
    List<Integer> ans=new ArrayList<>();
    
    public List<Integer> rightSideView(TreeNode root) {
        rightView( root , 0);
        return ans;
    }
    public void rightView(TreeNode root , int count){
        if(root==null){
            return;
        }
        if(count==ans.size()){
            ans.add(root.val);
        }

        count++;
        rightView(root.right,count);
        rightView(root.left,count);
        return;
    }
}