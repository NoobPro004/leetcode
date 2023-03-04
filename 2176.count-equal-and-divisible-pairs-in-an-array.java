/*
 * @lc app=leetcode id=2176 lang=java
 *
 * [2176] Count Equal and Divisible Pairs in an Array
 *
 * https://leetcode.com/problems/count-equal-and-divisible-pairs-in-an-array/description/
 *
 * algorithms
 * Easy (80.21%)
 * Likes:    476
 * Dislikes: 17
 * Total Accepted:    48K
 * Total Submissions: 60.1K
 * Testcase Example:  '[3,1,2,2,2,1,3]\n2'
 *
 * Given a 0-indexed integer array nums of length n and an integer k, return
 * the number of pairs (i, j) where 0 <= i < j < n, such that nums[i] ==
 * nums[j] and (i * j) is divisible by k.
 * 
 * Example 1:
 * 
 * 
 * Input: nums = [3,1,2,2,2,1,3], k = 2
 * Output: 4
 * Explanation:
 * There are 4 pairs that meet all the requirements:
 * - nums[0] == nums[6], and 0 * 6 == 0, which is divisible by 2.
 * - nums[2] == nums[3], and 2 * 3 == 6, which is divisible by 2.
 * - nums[2] == nums[4], and 2 * 4 == 8, which is divisible by 2.
 * - nums[3] == nums[4], and 3 * 4 == 12, which is divisible by 2.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: nums = [1,2,3,4], k = 1
 * Output: 0
 * Explanation: Since no value in nums is repeated, there are no pairs (i,j)
 * that meet all the requirements.
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= nums.length <= 100
 * 1 <= nums[i], k <= 100
 * 
 * 
 */

// @lc code=start
class Solution {
    public int countPairs(int[] nums, int k) {
        Map<Integer,List<Integer>> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i]))map.put(nums[i],new ArrayList<>());
            map.get(nums[i]).add(i);
        }
        
        int ans=0;
        for(int i:map.keySet()){
            List<Integer> a= map.get(i);
            for(int q=0;q<a.size();q++){
                for(int w=q+1;w<a.size();w++){
                    if((a.get(q)*a.get(w))%k==0)ans++;
                }
            }
        }
        
        return ans;
    }
}
// @lc code=end

