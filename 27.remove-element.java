/*
 * @lc app=leetcode id=27 lang=java
 *
 * [27] Remove Element
 */
import java.util.*;   
// @lc code=start
class Solution {
    public int removeElement(int[] nums, int val) {
        //         int start=0;
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]!=val){
//                 nums[start++]=nums[i];
//             }
//         }
        
//         return start;
        
        int l=0;
        int h=nums.length-1;
        while(l<=h){
        if(nums[l]!=val){
            l++;
        }else if(nums[h]!=val){
            int temp=nums[l];
            nums[l]=nums[h];
            nums[h]=temp;
            l++;
        }else{
            h--;
        }
        }

        return l;
    }
}
// @lc code=end

