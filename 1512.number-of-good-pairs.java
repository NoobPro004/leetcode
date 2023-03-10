/*
 * @lc app=leetcode id=1512 lang=java
 *
 * [1512] Number of Good Pairs
 *
 * https://leetcode.com/problems/number-of-good-pairs/description/
 *
 * algorithms
 * Easy (88.24%)
 * Likes:    3640
 * Dislikes: 185
 * Total Accepted:    414.4K
 * Total Submissions: 469.6K
 * Testcase Example:  '[1,2,3,1,1,3]'
 *
 * Given an array of integers nums, return the number of good pairs.
 * 
 * A pair (i, j) is called good if nums[i] == nums[j] and i < j.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: nums = [1,2,3,1,1,3]
 * Output: 4
 * Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: nums = [1,1,1,1]
 * Output: 6
 * Explanation: Each pair in the array are good.
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: nums = [1,2,3]
 * Output: 0
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= nums.length <= 100
 * 1 <= nums[i] <= 100
 * 
 * 
 */

// @lc code=start
class Solution {
    public int numIdenticalPairs(int[] nums) {
       Map<Integer,Integer> map = new HashMap<>();
         int ans=0;
        for(int i:nums){
            if(map.containsKey(i)){
                ans+=map.get(i);
                map.put(i,map.get(i)+1);
            }else{
                map.put(i,1);
            }
        }
        return ans; 
    }
}
// @lc code=end

