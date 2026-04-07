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
    public int diameterOfBinaryTree(TreeNode root) {
        TreeNode dummy=new TreeNode(0);
        int height=recTraversal(root,dummy);
        return dummy.val;
    }

    int recTraversal(TreeNode curr, TreeNode dummy){
        if(curr==null){
            return 0;
        }
        int int1=recTraversal(curr.left,dummy);
        int int2=recTraversal(curr.right,dummy);
        if(int1+int2>dummy.val){
            dummy.val=int1+int2;
        }
        return Math.max(int1,int2)+1;
    }
}
