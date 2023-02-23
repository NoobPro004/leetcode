/*
 * @lc app=leetcode id=977 lang=java
 *
 * [977] Squares of a Sorted Array
 *
 * https://leetcode.com/problems/squares-of-a-sorted-array/description/
 *
 * algorithms
 * Easy (71.91%)
 * Likes:    7410
 * Dislikes: 184
 * Total Accepted:    1.3M
 * Total Submissions: 1.9M
 * Testcase Example:  '[-4,-1,0,3,10]'
 *
 * Given an integer array nums sorted in non-decreasing order, return an array
 * of the squares of each number sorted in non-decreasing order.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: nums = [-4,-1,0,3,10]
 * Output: [0,1,9,16,100]
 * Explanation: After squaring, the array becomes [16,1,0,9,100].
 * After sorting, it becomes [0,1,9,16,100].
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: nums = [-7,-3,2,3,11]
 * Output: [4,9,9,49,121]
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= nums.length <= 10^4
 * -10^4 <= nums[i] <= 10^4
 * nums is sorted in non-decreasing order.
 * 
 * 
 * 
 * Follow up: Squaring each element and sorting the new array is very trivial,
 * could you find an O(n) solution using a different approach?
 */

// @lc code=start
class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=0;
         while(i<nums.length && nums[i]<0)i++;
        
        int j=i-1;
        int[] ans=  new int[nums.length];
        int index=0;
        while(i<nums.length && j>=0){
            if(nums[j]*nums[j]<=nums[i]*nums[i]){
                ans[index++]=nums[j]*nums[j--];
            }else{
                ans[index++]=nums[i]*nums[i++];
            }
        }
        
        while(j>=0){
            ans[index++]=nums[j]*nums[j--];
        }
        
        while(i<nums.length){
            ans[index++]=nums[i]*nums[i++];
        }
        
        return ans;
    }
}
// @lc code=end

