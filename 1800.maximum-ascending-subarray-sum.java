/*
 * @lc app=leetcode id=1800 lang=java
 *
 * [1800] Maximum Ascending Subarray Sum
 *
 * https://leetcode.com/problems/maximum-ascending-subarray-sum/description/
 *
 * algorithms
 * Easy (63.40%)
 * Likes:    575
 * Dislikes: 19
 * Total Accepted:    40.7K
 * Total Submissions: 64.3K
 * Testcase Example:  '[10,20,30,5,10,50]'
 *
 * Given an array of positive integers nums, return the maximum possible sum of
 * an ascending subarray in nums.
 * 
 * A subarray is defined as a contiguous sequence of numbers in an array.
 * 
 * A subarray [numsl, numsl+1, ..., numsr-1, numsr] is ascending if for all i
 * where l <= i < r, numsi  < numsi+1. Note that a subarray of size 1 is
 * ascending.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: nums = [10,20,30,5,10,50]
 * Output: 65
 * Explanation: [5,10,50] is the ascending subarray with the maximum sum of
 * 65.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: nums = [10,20,30,40,50]
 * Output: 150
 * Explanation: [10,20,30,40,50] is the ascending subarray with the maximum sum
 * of 150.
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: nums = [12,17,15,13,10,11,12]
 * Output: 33
 * Explanation: [10,11,12] is the ascending subarray with the maximum sum of
 * 33.
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= nums.length <= 100
 * 1 <= nums[i] <= 100
 * 
 * 
 */

// @lc code=start
class Solution {
    public int maxAscendingSum(int[] nums) {
        int max=0;
        int currsum=0;
         for(int i=0;i<nums.length;i++){
             if(i>0 && nums[i]<=nums[i-1]){
                 currsum=nums[i];
                 
             }else currsum+=nums[i];
             max=Math.max(max,currsum);
         }
        
        return max;
    }
}
// @lc code=end

