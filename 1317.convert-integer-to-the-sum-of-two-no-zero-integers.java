/*
 * @lc app=leetcode id=1317 lang=java
 *
 * [1317] Convert Integer to the Sum of Two No-Zero Integers
 *
 * https://leetcode.com/problems/convert-integer-to-the-sum-of-two-no-zero-integers/description/
 *
 * algorithms
 * Easy (55.72%)
 * Likes:    336
 * Dislikes: 265
 * Total Accepted:    36.5K
 * Total Submissions: 65.8K
 * Testcase Example:  '2'
 *
 * No-Zero integer is a positive integer that does not contain any 0 in its
 * decimal representation.
 * 
 * Given an integer n, return a list of two integers [a, b] where:
 * 
 * 
 * a and b are No-Zero integers.
 * a + b = n
 * 
 * 
 * The test cases are generated so that there is at least one valid solution.
 * If there are many valid solutions, you can return any of them.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: n = 2
 * Output: [1,1]
 * Explanation: Let a = 1 and b = 1.
 * Both a and b are no-zero integers, and a + b = 2 = n.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: n = 11
 * Output: [2,9]
 * Explanation: Let a = 2 and b = 9.
 * Both a and b are no-zero integers, and a + b = 9 = n.
 * Note that there are other valid answers as [8, 3] that can be accepted.
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 2 <= n <= 10^4
 * 
 * 
 */

// @lc code=start
class Solution {
    public int[] getNoZeroIntegers(int n) {
        for(int i=1;i<=n/2;i++){
            if(isNo(i) && isNo(n-i))return new int[]{i,n-i};
        }
        
        return new int[2];
    }
    
    public boolean isNo(int x){
        if(x==0)return false;
        while(x>0){
            if(x%10==0)return false;
            x/=10;
        }
        
        return true;
    }
}
// @lc code=end

