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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> q=new ArrayDeque<>();
        boolean flag=true;
        if(root==null){
            return ans;
        }
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> list=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode current = q.poll();
                if(current.left!=null){
                    q.offer(current.left);
                }
                if(current.right!=null){
                    q.offer(current.right);
                }
                if(!flag){
                    list.add(0,current.val);
                }
                else{
                    list.add(current.val);
                }
            }
            ans.add(list);
            if(!flag){
                flag=true;
            }
            else{
                flag=false;
            }

        }
        return ans;
    }
}