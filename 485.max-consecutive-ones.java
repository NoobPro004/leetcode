/*
 * @lc app=leetcode id=485 lang=java
 *
 * [485] Max Consecutive Ones
 *
 * https://leetcode.com/problems/max-consecutive-ones/description/
 *
 * algorithms
 * Easy (56.43%)
 * Likes:    4015
 * Dislikes: 420
 * Total Accepted:    823.6K
 * Total Submissions: 1.5M
 * Testcase Example:  '[1,1,0,1,1,1]'
 *
 * Given a binary array nums, return the maximum number of consecutive 1's in
 * the array.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: nums = [1,1,0,1,1,1]
 * Output: 3
 * Explanation: The first two digits or the last three digits are consecutive
 * 1s. The maximum number of consecutive 1s is 3.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: nums = [1,0,1,1,0,1]
 * Output: 2
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
    public int findMaxConsecutiveOnes(int[] nums) {
        //         int ans=0;
//         int curr=0;
//          for(int i:nums){
//              if(i==0){
//                  curr=0;
//              }else curr++;
             
//              ans=Math.max(ans,curr);
//          }
        
//         return ans;
        int l=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                max=Math.max(max,i-l);
                l=i+1;
            }
        }

        max=Math.max(max,nums.length-l);
        return max;
    }
}
// @lc code=end

