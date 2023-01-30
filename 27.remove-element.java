/*
 * @lc app=leetcode id=27 lang=java
 *
 * [27] Remove Element
 */
import java.util.*;
// @lc code=start
class Solution {
    public int removeElement(int[] nums, int val) {
        int l=0;
        int h=nums.length-1;
         while(l<=h){
            if(nums[l]==val){
                int temp = nums[h];
                nums[h]=nums[l];
                nums[l]=temp;
                h--;
            }else l++;
         }

         return l;
    }
}
// @lc code=end

