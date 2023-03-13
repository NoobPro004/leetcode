/*
 * @lc app=leetcode id=2379 lang=java
 *
 * [2379] Minimum Recolors to Get K Consecutive Black Blocks
 *
 * https://leetcode.com/problems/minimum-recolors-to-get-k-consecutive-black-blocks/description/
 *
 * algorithms
 * Easy (57.50%)
 * Likes:    476
 * Dislikes: 13
 * Total Accepted:    31.2K
 * Total Submissions: 54.1K
 * Testcase Example:  '"WBBWWBBWBW"\n7'
 *
 * You are given a 0-indexed string blocks of length n, where blocks[i] is
 * either 'W' or 'B', representing the color of the i^th block. The characters
 * 'W' and 'B' denote the colors white and black, respectively.
 * 
 * You are also given an integer k, which is the desired number of consecutive
 * black blocks.
 * 
 * In one operation, you can recolor a white block such that it becomes a black
 * block.
 * 
 * Return the minimum number of operations needed such that there is at least
 * one occurrence of k consecutive black blocks.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: blocks = "WBBWWBBWBW", k = 7
 * Output: 3
 * Explanation:
 * One way to achieve 7 consecutive black blocks is to recolor the 0th, 3rd,
 * and 4th blocks
 * so that blocks = "BBBBBBBWBW". 
 * It can be shown that there is no way to achieve 7 consecutive black blocks
 * in less than 3 operations.
 * Therefore, we return 3.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: blocks = "WBWBBBW", k = 2
 * Output: 0
 * Explanation:
 * No changes need to be made, since 2 consecutive black blocks already exist.
 * Therefore, we return 0.
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * n == blocks.length
 * 1 <= n <= 100
 * blocks[i] is either 'W' or 'B'.
 * 1 <= k <= n
 * 
 * 
 */

// @lc code=start
class Solution {
    public int minimumRecolors(String blocks, int k) {
        int curr=0;
        int ans=Integer.MAX_VALUE;
        int start=0;
         for(int i=0;i<blocks.length();i++){
             curr += (blocks.charAt(i)=='B' ? 1 : 0);
             if(i-start+1==k){
                 ans=Math.min(ans,k-curr);
                 curr-= blocks.charAt(start)=='B' ? 1 : 0;
                 start++;
             }
         }
        
        return ans;
    }
}
// @lc code=end

