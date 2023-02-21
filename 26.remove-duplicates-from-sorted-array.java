/*
 * @lc app=leetcode id=26 lang=java
 *
 * [26] Remove Duplicates from Sorted Array
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        int start=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[start]){
                nums[start+1]=nums[i];
                 start++;
            }
        }
        
        return start+1;
    }
}
// @lc code=end

