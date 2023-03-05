/*
 * @lc app=leetcode id=2357 lang=java
 *
 * [2357] Make Array Zero by Subtracting Equal Amounts
 *
 * https://leetcode.com/problems/make-array-zero-by-subtracting-equal-amounts/description/
 *
 * algorithms
 * Easy (72.78%)
 * Likes:    757
 * Dislikes: 26
 * Total Accepted:    61.1K
 * Total Submissions: 83.9K
 * Testcase Example:  '[1,5,0,3,5]'
 *
 * You are given a non-negative integer array nums. In one operation, you
 * must:
 * 
 * 
 * Choose a positive integer x such that x is less than or equal to the
 * smallest non-zero element in nums.
 * Subtract x from every positive element in nums.
 * 
 * 
 * Return the minimum number of operations to make every element in nums equal
 * to 0.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: nums = [1,5,0,3,5]
 * Output: 3
 * Explanation:
 * In the first operation, choose x = 1. Now, nums = [0,4,0,2,4].
 * In the second operation, choose x = 2. Now, nums = [0,2,0,0,2].
 * In the third operation, choose x = 2. Now, nums = [0,0,0,0,0].
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: nums = [0]
 * Output: 0
 * Explanation: Each element in nums is already 0 so no operations are
 * needed.
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= nums.length <= 100
 * 0 <= nums[i] <= 100
 * 
 * 
 */

// @lc code=start
class Solution {
    public int minimumOperations(int[] nums) {
 //         Arrays.sort(nums);
//             int op=0;
//         int minus=0;
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]>minus){
//                 op++;
//                 minus+=nums[i]-minus;
//             }
//         }
        
//         return op;
Set<Integer> set = new HashSet<>();
for(int i:nums)if(i>0)set.add(i);

return set.size();
    }
}
// @lc code=end

