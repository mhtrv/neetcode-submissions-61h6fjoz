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
    public int maxDepth(TreeNode root) {
        int maxDepth=0;
        Queue<TreeNode> queue1=new ArrayDeque<>();
        if(root!=null){
            queue1.add(root);
        }
        while(!queue1.isEmpty()){
            maxDepth++;
            int size=queue1.size();
            for(int i=0;i<size;i++){
                TreeNode currNode=queue1.poll();
                if(currNode.left!=null){
                    queue1.add(currNode.left);
                }
                if(currNode.right!=null){
                    queue1.add(currNode.right);
                }
            }
        }

        return maxDepth;
    }
}
