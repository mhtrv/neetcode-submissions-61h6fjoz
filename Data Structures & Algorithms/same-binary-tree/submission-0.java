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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<Integer> list1=obtainTraversal(p);
        List<Integer> list2=obtainTraversal(q);
        if(!(list1.size()==list2.size())){
            return false;
        }
        for(int i=0;i<list1.size();i++){
            if(!((list1.get(i)==null && list2.get(i)==null) || list1.get(i)==list2.get(i))){
                return false;
            }
        }
        return true;
    }

    public List<Integer> obtainTraversal(TreeNode p){
        List<Integer> list1= new ArrayList<>();
        Queue<TreeNode> queue1=new ArrayDeque<>();
        if(p!=null){
            queue1.add(p);
            list1.add(p.val);
        }else{
            list1.add(null);
        }

        while(!queue1.isEmpty()){
            TreeNode currNode=queue1.poll();
            if(currNode.left!=null){
                queue1.add(currNode.left);
                list1.add(currNode.left.val);
            }else{
                list1.add(null);
            }
            if(currNode.right!=null){
                queue1.add(currNode.right);
                list1.add(currNode.right.val);
            }else{
                list1.add(null);
            }
        }

        return list1;
    }
}
