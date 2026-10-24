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
    HashMap<Integer,Integer> mp=new HashMap<>();
    int postIndex;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        for(int i=0;i<inorder.length;i++){
            mp.put(inorder[i],i);
        }
        postIndex=inorder.length-1;
        return build(inorder,postorder,0,inorder.length-1);
    }
    public TreeNode build(int[] inorder,int[] postorder,int left,int right){
        if(left>right){
            return null;
        }

        int rootvalue = postorder[postIndex--];

        TreeNode root = new TreeNode(rootvalue);

        int rootIndex = mp.get(rootvalue);

        root.right = build(inorder,postorder,rootIndex + 1, right);

        root.left = build(inorder, postorder, left, rootIndex - 1);

        return root;
    }
}