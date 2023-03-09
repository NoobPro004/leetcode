/*
 * @lc app=leetcode id=257 lang=java
 *
 * [257] Binary Tree Paths
 *
 * https://leetcode.com/problems/binary-tree-paths/description/
 *
 * algorithms
 * Easy (61.13%)
 * Likes:    5504
 * Dislikes: 236
 * Total Accepted:    601.8K
 * Total Submissions: 982.4K
 * Testcase Example:  '[1,2,3,null,5]'
 *
 * Given the root of a binary tree, return all root-to-leaf paths in any
 * order.
 * 
 * A leaf is a node with no children.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: root = [1,2,3,null,5]
 * Output: ["1->2->5","1->3"]
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: root = [1]
 * Output: ["1"]
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * The number of nodes in the tree is in the range [1, 100].
 * -100 <= Node.val <= 100
 * 
 * 
 */

// @lc code=start
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
    List<String> ans;
    public List<String> binaryTreePaths(TreeNode root) {
        ans=new ArrayList<>();
        solve(root,"");
        return ans;
    }
    
    public void solve(TreeNode root,String curr){
        if(root==null)return ;
        
        if(root.left==null && root.right==null){
            String a=curr.length()==0 ? root.val+"" : curr+"->"+root.val;
            ans.add(a);
            return ;
        }
        
        String a=curr.length()==0 ? root.val+"" : curr+"->"+root.val;
        solve(root.left,a);
        solve(root.right,a);
}
// @lc code=end

