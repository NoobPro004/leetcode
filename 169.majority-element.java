/*
 * @lc app=leetcode id=169 lang=java
 *
 * [169] Majority Element
 *
 * https://leetcode.com/problems/majority-element/description/
 *
 * algorithms
 * Easy (63.93%)
 * Likes:    13760
 * Dislikes: 430
 * Total Accepted:    1.6M
 * Total Submissions: 2.5M
 * Testcase Example:  '[3,2,3]'
 *
 * Given an array nums of size n, return the majority element.
 * 
 * The majority element is the element that appears more than ⌊n / 2⌋ times.
 * You may assume that the majority element always exists in the array.
 * 
 * 
 * Example 1:
 * Input: nums = [3,2,3]
 * Output: 3
 * Example 2:
 * Input: nums = [2,2,1,1,1,2,2]
 * Output: 2
 * 
 * 
 * Constraints:
 * 
 * 
 * n == nums.length
 * 1 <= n <= 5 * 10^4
 * -10^9 <= nums[i] <= 10^9
 * 
 * 
 * 
 * Follow-up: Could you solve the problem in linear time and in O(1) space?
 */

// @lc code=start
class Solution {
    public int majorityElement(int[] nums) {
        int cand=nums[0];
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==cand){
                count++;
            }else count--;
            
            if(count==0){
                cand=nums[i];
                count=1;
            }
        }
        
        return cand;
    }
}
// @lc code=end

