/*
 * @lc app=leetcode id=653 lang=java
 *
 * [653] Two Sum IV - Input is a BST
 *
 * https://leetcode.com/problems/two-sum-iv-input-is-a-bst/description/
 *
 * algorithms
 * Easy (61.03%)
 * Likes:    5671
 * Dislikes: 238
 * Total Accepted:    443.2K
 * Total Submissions: 726.1K
 * Testcase Example:  '[5,3,6,2,4,null,7]\n9'
 *
 * Given the root of a binary search tree and an integer k, return true if
 * there exist two elements in the BST such that their sum is equal to k, or
 * false otherwise.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: root = [5,3,6,2,4,null,7], k = 9
 * Output: true
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: root = [5,3,6,2,4,null,7], k = 28
 * Output: false
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * The number of nodes in the tree is in the range [1, 10^4].
 * -10^4 <= Node.val <= 10^4
 * root is guaranteed to be a valid binary search tree.
 * -10^5 <= k <= 10^5
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
    boolean found=false;
    Map<Integer,Integer> map;
    public boolean findTarget(TreeNode root, int k) {
        map=new HashMap<>();
        solve(root,k);
        return found;
    }
    
    public void solve(TreeNode root,int target){
        if(root==null)return ;
        
        solve(root.left,target);
        if(map.containsKey(target-root.val)){
            found=true;
            return ;
        }
        map.put(root.val,1);
        solve(root.right,target);
}
// @lc code=end

