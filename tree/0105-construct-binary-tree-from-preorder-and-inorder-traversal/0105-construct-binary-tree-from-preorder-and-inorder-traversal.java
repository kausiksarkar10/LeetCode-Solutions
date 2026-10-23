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

    HashMap<Integer, Integer> map = new HashMap<>();
    int preIndex = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        // Store inorder value -> index
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        return build(preorder, inorder, 0, inorder.length - 1);
    }

    private TreeNode build(int[] preorder, int[] inorder, int left, int right) {

        // No elements
        if (left > right) {
            return null;
        }

        // First unused preorder element is the root
        int rootValue = preorder[preIndex++];

        TreeNode root = new TreeNode(rootValue);

        // Find root in inorder
        int rootIndex = map.get(rootValue);

        // Build left subtree first
        root.left = build(preorder, inorder, left, rootIndex - 1);

        // Then build right subtree
        root.right = build(preorder, inorder, rootIndex + 1, right);

        return root;
    }
}