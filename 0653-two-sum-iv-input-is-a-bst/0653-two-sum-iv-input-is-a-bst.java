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
    public boolean findTarget(TreeNode root, int k) {
        if(root==null){
            return false;
        }
        addList(root);
        int left=0;
        int right=ans.size()-1;
        while(left<right){
            int sum=ans.get(left)+ans.get(right);
            if(sum==k){
                return true;
            }
            else if(sum>k){
                right--;
            }
            else{
                left++;
            }
        }
        return false;
    }
    public void addList(TreeNode root){
        if(root==null){
            return;
        }
        addList(root.left);
        ans.add(root.val);
        addList(root.right);
        return;
    }
}