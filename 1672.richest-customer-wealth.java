/*
 * @lc app=leetcode id=1672 lang=java
 *
 * [1672] Richest Customer Wealth
 *
 * https://leetcode.com/problems/richest-customer-wealth/description/
 *
 * algorithms
 * Easy (87.94%)
 * Likes:    3203
 * Dislikes: 316
 * Total Accepted:    547.9K
 * Total Submissions: 623.3K
 * Testcase Example:  '[[1,2,3],[3,2,1]]'
 *
 * You are given an m x n integer grid accounts where accounts[i][j] is the
 * amount of money the i​​​​​^​​​​​​th​​​​ customer has in the
 * j​​​​​^​​​​​​th​​​​ bank. Return the wealth that the richest customer has.
 * 
 * A customer's wealth is the amount of money they have in all their bank
 * accounts. The richest customer is the customer that has the maximum
 * wealth.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: accounts = [[1,2,3],[3,2,1]]
 * Output: 6
 * Explanation:
 * 1st customer has wealth = 1 + 2 + 3 = 6
 * 2nd customer has wealth = 3 + 2 + 1 = 6
 * Both customers are considered the richest with a wealth of 6 each, so return
 * 6.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: accounts = [[1,5],[7,3],[3,5]]
 * Output: 10
 * Explanation: 
 * 1st customer has wealth = 6
 * 2nd customer has wealth = 10 
 * 3rd customer has wealth = 8
 * The 2nd customer is the richest with a wealth of 10.
 * 
 * Example 3:
 * 
 * 
 * Input: accounts = [[2,8,7],[7,1,3],[1,9,5]]
 * Output: 17
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * m == accounts.length
 * n == accounts[i].length
 * 1 <= m, n <= 50
 * 1 <= accounts[i][j] <= 100
 * 
 * 
 */

// @lc code=start
class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;
         for(int i=0;i<accounts.length;i++){
             for(int j=1;j<accounts[0].length;j++){
                 accounts[i][j]+=accounts[i][j-1];
             }
             
             max=Math.max(accounts[i][accounts[0].length-1],max);
         }
        
        return max;
    }
}
// @lc code=end

