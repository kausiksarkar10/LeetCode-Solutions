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
    List<List<Integer>> ans=new ArrayList<>();
    List<Integer> temp=new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        
        target(root,targetSum);
        return ans;
        
    }
    public void target(TreeNode root,int targetSum){
        if(root==null){
            return;
        }
        temp.add(root.val);
        targetSum-=root.val;
        if(targetSum==0 && root.left==null && root.right==null){
            ans.add(new ArrayList<>(temp));
        }
        target(root.left,targetSum);
        target(root.right,targetSum);
        temp.remove(temp.size()-1);
    }
}