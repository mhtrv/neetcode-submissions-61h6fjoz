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
    public boolean isBalanced(TreeNode root) {
        TreeNode bool = new TreeNode(1);
        int int1=recCheck(root, bool);

        if(bool.val==1){
            return true;
        }else{
            return false;
        }
    }

    public int recCheck(TreeNode node, TreeNode bool){
        if(node==null){
            return 0;
        }
        int int1=recCheck(node.left,bool);
        int int2=recCheck(node.right,bool);

        if(Math.abs(int1-int2)>1){
            System.out.println("setting boolean false");
            bool.val=0;
        }
        return Math.max(int1,int2)+1;
    }
}
