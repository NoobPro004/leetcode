/*
 * @lc app=leetcode id=1005 lang=java
 *
 * [1005] Maximize Sum Of Array After K Negations
 *
 * https://leetcode.com/problems/maximize-sum-of-array-after-k-negations/description/
 *
 * algorithms
 * Easy (50.90%)
 * Likes:    1265
 * Dislikes: 96
 * Total Accepted:    68.6K
 * Total Submissions: 134.7K
 * Testcase Example:  '[4,2,3]\n1'
 *
 * Given an integer array nums and an integer k, modify the array in the
 * following way:
 * 
 * 
 * choose an index i and replace nums[i] with -nums[i].
 * 
 * 
 * You should apply this process exactly k times. You may choose the same index
 * i multiple times.
 * 
 * Return the largest possible sum of the array after modifying it in this
 * way.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: nums = [4,2,3], k = 1
 * Output: 5
 * Explanation: Choose index 1 and nums becomes [4,-2,3].
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: nums = [3,-1,0,2], k = 3
 * Output: 6
 * Explanation: Choose indices (1, 2, 2) and nums becomes [3,1,0,2].
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: nums = [2,-3,-1,5,-4], k = 2
 * Output: 13
 * Explanation: Choose indices (1, 4) and nums becomes [2,3,-1,5,4].
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= nums.length <= 10^4
 * -100 <= nums[i] <= 100
 * 1 <= k <= 10^4
 * 
 * 
 */

// @lc code=start
class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0;
        while(k>0 && i<nums.length && nums[i]<0){
            nums[i]=-nums[i];
            k--;
            i++;
        }
        int min=Integer.MAX_VALUE;
        int sum=0;
         for(int j:nums){
             min=Math.min(min,j);
             sum+=j;
         }
        if(k>0 && k%2!=0){
            sum-=2*min;
        }
        
        return sum;
    }
}
// @lc code=end

