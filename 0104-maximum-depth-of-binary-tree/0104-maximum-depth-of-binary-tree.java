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
// class Solution {
//     public int maxDepth(TreeNode root) {
//         if(root == null)return 0;
//         int count = 0;
//         Queue<TreeNode> q = new LinkedList<>();
//         q.offer(root);
//         while(!q.isEmpty()){
//             int size = q.size();
//             while(size > 0){
//                 TreeNode temp = q.poll();
//                 if(temp.left != null) q.offer(temp.left);
//                 if(temp.right != null) q.offer(temp.right);
//                 size--;
//             }
//             count++;
//         }
//         return count; 
//     }
// }


class Solution {
    public int maxDepth(TreeNode root) {
       return fun(root);
    }
    public int fun(TreeNode temp){
        if(temp == null) return 0;
        int left = fun(temp.left);
        int right = fun(temp.right);
        return Math.max(left,right) + 1;
    }
}