/*
 * @lc app=leetcode id=1018 lang=java
 *
 * [1018] Binary Prefix Divisible By 5
 *
 * https://leetcode.com/problems/binary-prefix-divisible-by-5/description/
 *
 * algorithms
 * Easy (47.06%)
 * Likes:    627
 * Dislikes: 164
 * Total Accepted:    45.2K
 * Total Submissions: 96.3K
 * Testcase Example:  '[0,1,1]'
 *
 * You are given a binary array nums (0-indexed).
 * 
 * We define xi as the number whose binary representation is the subarray
 * nums[0..i] (from most-significant-bit to least-significant-bit).
 * 
 * 
 * For example, if nums = [1,0,1], then x0 = 1, x1 = 2, and x2 = 5.
 * 
 * 
 * Return an array of booleans answer where answer[i] is true if xi is
 * divisible by 5.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: nums = [0,1,1]
 * Output: [true,false,false]
 * Explanation: The input numbers in binary are 0, 01, 011; which are 0, 1, and
 * 3 in base-10.
 * Only the first number is divisible by 5, so answer[0] is true.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: nums = [1,1,1]
 * Output: [false,false,false]
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= nums.length <= 10^5
 * nums[i] is either 0 or 1.
 * 
 * 
 */

// @lc code=start
class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> ans=  new ArrayList<>();
        int sum=0;
        for(int i : nums){
            sum=sum*2+i;
            ans.add(sum%5==0);
            sum%=5;
        }
        return ans;
    }
}
// @lc code=end

