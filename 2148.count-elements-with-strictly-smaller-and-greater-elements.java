/*
 * @lc app=leetcode id=2148 lang=java
 *
 * [2148] Count Elements With Strictly Smaller and Greater Elements 
 *
 * https://leetcode.com/problems/count-elements-with-strictly-smaller-and-greater-elements/description/
 *
 * algorithms
 * Easy (59.86%)
 * Likes:    465
 * Dislikes: 20
 * Total Accepted:    39.5K
 * Total Submissions: 66.2K
 * Testcase Example:  '[11,7,2,15]'
 *
 * Given an integer array nums, return the number of elements that have both a
 * strictly smaller and a strictly greater element appear in nums.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: nums = [11,7,2,15]
 * Output: 2
 * Explanation: The element 7 has the element 2 strictly smaller than it and
 * the element 11 strictly greater than it.
 * Element 11 has element 7 strictly smaller than it and element 15 strictly
 * greater than it.
 * In total there are 2 elements having both a strictly smaller and a strictly
 * greater element appear in nums.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: nums = [-3,3,3,90]
 * Output: 2
 * Explanation: The element 3 has the element -3 strictly smaller than it and
 * the element 90 strictly greater than it.
 * Since there are two elements with the value 3, in total there are 2 elements
 * having both a strictly smaller and a strictly greater element appear in
 * nums.
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= nums.length <= 100
 * -10^5 <= nums[i] <= 10^5
 * 
 * 
 */

// @lc code=start
class Solution {
    public int countElements(int[] nums) {
        Arrays.sort(nums);
        int[] arr=new int[nums.length];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[0])arr[i]++;
        }
        int ans=0;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[nums.length-1])arr[i]++;
            
            if(arr[i]==2)ans++;
        }
        
        return ans;
    }
}
// @lc code=end

