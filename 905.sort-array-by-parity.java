/*
 * @lc app=leetcode id=905 lang=java
 *
 * [905] Sort Array By Parity
 *
 * https://leetcode.com/problems/sort-array-by-parity/description/
 *
 * algorithms
 * Easy (75.62%)
 * Likes:    4202
 * Dislikes: 134
 * Total Accepted:    583.8K
 * Total Submissions: 772.2K
 * Testcase Example:  '[3,1,2,4]'
 *
 * Given an integer array nums, move all the even integers at the beginning of
 * the array followed by all the odd integers.
 * 
 * Return any array that satisfies this condition.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: nums = [3,1,2,4]
 * Output: [2,4,3,1]
 * Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be
 * accepted.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: nums = [0]
 * Output: [0]
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= nums.length <= 5000
 * 0 <= nums[i] <= 5000
 * 
 * 
 */

// @lc code=start
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int l=0;
        int h=nums.length-1;
        while(l<h){
            if(nums[l]%2==1){
                int temp=nums[l];
                nums[l]=nums[h];
                nums[h]=temp;
                h--;
            }else if(nums[h]%2==0){
                int temp=nums[h];
                nums[h]=nums[l];
                nums[l]=temp;
                l++;
            }else{
                l++;
                h--;
            }
        }
        
        return nums;
    }
}
// @lc code=end

