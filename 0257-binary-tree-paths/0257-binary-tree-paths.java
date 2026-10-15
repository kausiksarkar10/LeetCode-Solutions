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
    List<String> ans=new ArrayList<>();
    String s="";
    public List<String> binaryTreePaths(TreeNode root) {
        
        if(root==null){
            return ans;
        }
        path(root,"");
        return ans;
 
    }
    public void path(TreeNode root,String s){
        if(root==null){
            return;
        }
        if (s.equals("")) {
            s = Integer.toString(root.val);
        } else {
            s = s + "->" + root.val;
        }
        if(root.left==null && root.right==null){
            ans.add(s);
            return;
        }
        path(root.left,s);
        path(root.right,s);
        return;
    }
}