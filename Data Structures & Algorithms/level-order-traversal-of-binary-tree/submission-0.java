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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> output = new ArrayList<>();
        Queue<ExtendedTreeNode> queue1=new ArrayDeque<>();
        if(root!=null){
            queue1.add(new ExtendedTreeNode(root,0));
        }

        while(!queue1.isEmpty()){
            ExtendedTreeNode currExtendedTreeNode = queue1.poll();
            TreeNode currNode=currExtendedTreeNode.node;
            int height=currExtendedTreeNode.height;
            List currList;
            if(output.size()>height){
                currList=output.get(height);
                currList.add(currNode.val);
                output.set(height,currList);
            }else{
                currList=new ArrayList<>();
                currList.add(currNode.val);
                output.add(currList);
            }
            if(currNode.left!=null){
                queue1.add(new ExtendedTreeNode(currNode.left,height+1));
            }
            if(currNode.right!=null){
                queue1.add(new ExtendedTreeNode(currNode.right,height+1));
            }
        }
        return output;
    }
}

public class ExtendedTreeNode extends TreeNode{
    TreeNode node;
    int height;
    ExtendedTreeNode(TreeNode node,int height){
        this.node=node;
        this.height=height;
    }
}
