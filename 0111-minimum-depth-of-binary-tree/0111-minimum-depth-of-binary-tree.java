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
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        Queue<TreeNode> q=new LinkedList<>();
        Queue<Integer> qlevel=new LinkedList<>();
        q.add(root);
        qlevel.add(1);
        while(!q.isEmpty()){
            TreeNode curr=q.remove();
            int level=qlevel.remove();
            if(curr.left==null&&curr.right==null){
                return level;
            }
            if(curr.left!=null){
                q.add(curr.left);
                qlevel.add(level+1);
            }
            if(curr.right!=null){
                q.add(curr.right);
                qlevel.add(level+1);
            }
        }
        return -1;
    }
}