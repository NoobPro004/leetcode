/*
 * @lc app=leetcode id=896 lang=java
 *
 * [896] Monotonic Array
 *
 * https://leetcode.com/problems/monotonic-array/description/
 *
 * algorithms
 * Easy (58.32%)
 * Likes:    1934
 * Dislikes: 63
 * Total Accepted:    250.6K
 * Total Submissions: 429.5K
 * Testcase Example:  '[1,2,2,3]'
 *
 * An array is monotonic if it is either monotone increasing or monotone
 * decreasing.
 * 
 * An array nums is monotone increasing if for all i <= j, nums[i] <= nums[j].
 * An array nums is monotone decreasing if for all i <= j, nums[i] >= nums[j].
 * 
 * Given an integer array nums, return true if the given array is monotonic, or
 * false otherwise.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: nums = [1,2,2,3]
 * Output: true
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: nums = [6,5,4,4]
 * Output: true
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: nums = [1,3,2]
 * Output: false
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= nums.length <= 10^5
 * -10^5 <= nums[i] <= 10^5
 * 
 * 
 */

// @lc code=start
class Solution {
    public boolean isMonotonic(int[] nums) {
        if(nums==null || nums.length<=1)return true;
        
        int sign=nums[1]-nums[0];
        int i=1;
        while(i<nums.length && sign==0){
            sign=nums[i]-nums[i-1];
            i++;
        }
        if(i==nums.length || sign==0)return true;
        
        while(i<nums.length){
            if(sign * (nums[i]-nums[i-1]) < 0)return false;
            i++;
        }
        
        return true;
    }
}
// @lc code=end

