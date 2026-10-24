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
    int ans = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        fun(root);
        return ans;
    }
    public int fun(TreeNode temp){
        if(temp == null)return 0;
        int left = fun(temp.left);
        int right = fun(temp.right);
        ans = Math.max(ans,left + right);
        return Math.max(left,right) + 1;
    }
}