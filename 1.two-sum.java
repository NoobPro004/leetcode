/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */
import java.util.*;
// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
         for(int i=0;i<nums.length;i++){
             if(map.containsKey(target-nums[i])){
                 return new int[]{map.get(target-nums[i]),i};
             }
             
             map.put(nums[i],i);
         }
        
        
        return new int[]{-1,-1};
    }
}
// @lc code=end

