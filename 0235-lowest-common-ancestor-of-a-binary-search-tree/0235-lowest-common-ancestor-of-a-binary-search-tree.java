/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

// class Solution {   // for general tree.
//     TreeNode ans = null;
//     public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//         fun(root, p ,q);
//         return ans;
//     }
//     public int fun(TreeNode temp, TreeNode p, TreeNode q){
//         if(temp == null) return 0;
//         int l = fun(temp.left, p, q);
//         int r = fun(temp.right, p ,q);
//         int s = 0;
//         if(temp == p || temp == q)s = 1;
//         if(l + r + s == 2 && ans == null) ans = temp;
//         return l + r + s;
//     }
// }

class Solution {   // for BST
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while(root != null){
            if(root == p)return p;
            if(root == q)return q;
            if(root.val < p.val && root.val < q.val)root = root.right;
            else if(root.val > p.val && root.val > q.val)root = root.left;
            else break; 
        }
        return root;
    }
    
}