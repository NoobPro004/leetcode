/*
 * @lc app=leetcode id=2395 lang=java
 *
 * [2395] Find Subarrays With Equal Sum
 *
 * https://leetcode.com/problems/find-subarrays-with-equal-sum/description/
 *
 * algorithms
 * Easy (64.52%)
 * Likes:    355
 * Dislikes: 14
 * Total Accepted:    33.5K
 * Total Submissions: 51.9K
 * Testcase Example:  '[4,2,4]'
 *
 * Given a 0-indexed integer array nums, determine whether there exist two
 * subarrays of length 2 with equal sum. Note that the two subarrays must begin
 * at different indices.
 * 
 * Return true if these subarrays exist, and false otherwise.
 * 
 * A subarray is a contiguous non-empty sequence of elements within an
 * array.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: nums = [4,2,4]
 * Output: true
 * Explanation: The subarrays with elements [4,2] and [2,4] have the same sum
 * of 6.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: nums = [1,2,3,4,5]
 * Output: false
 * Explanation: No two subarrays of size 2 have the same sum.
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: nums = [0,0,0]
 * Output: true
 * Explanation: The subarrays [nums[0],nums[1]] and [nums[1],nums[2]] have the
 * same sum of 0. 
 * Note that even though the subarrays have the same content, the two subarrays
 * are considered different because they are in different positions in the
 * original array.
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 2 <= nums.length <= 1000
 * -10^9 <= nums[i] <= 10^9
 * 
 * 
 */

// @lc code=start
class Solution {
    public boolean findSubarrays(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=1;i<nums.length;i++){
            int sum=nums[i]+nums[i-1];
            if(map.containsKey(sum)){
                if(map.get(sum)<i)return true;
            }else map.put(sum,i-1);
        }
        
        return false;
    }
}
// @lc code=end

