/*
 * @lc app=leetcode id=1304 lang=java
 *
 * [1304] Find N Unique Integers Sum up to Zero
 *
 * https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/description/
 *
 * algorithms
 * Easy (77.05%)
 * Likes:    1594
 * Dislikes: 542
 * Total Accepted:    178.5K
 * Total Submissions: 231.7K
 * Testcase Example:  '5'
 *
 * Given an integer n, return any array containing n unique integers such that
 * they add up to 0.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: n = 5
 * Output: [-7,-1,1,3,4]
 * Explanation: These arrays also are accepted [-5,-1,1,2,3] ,
 * [-3,-1,2,-2,4].
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: n = 3
 * Output: [-1,0,1]
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: n = 1
 * Output: [0]
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= n <= 1000
 * 
 * 
 */

// @lc code=start
class Solution {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        int index=n%2==1 ? 1 : 0;
        for(int i=1;index<n;i++){
            ans[index++]=i;
            ans[index++]=-i;
        }
        
        return ans;
    }
}
// @lc code=end

