/*
 * @lc app=leetcode id=561 lang=java
 *
 * [561] Array Partition
 *
 * https://leetcode.com/problems/array-partition/description/
 *
 * algorithms
 * Easy (77.02%)
 * Likes:    1486
 * Dislikes: 199
 * Total Accepted:    385.3K
 * Total Submissions: 499.9K
 * Testcase Example:  '[1,4,3,2]'
 *
 * Given an integer array nums of 2n integers, group these integers into n
 * pairs (a1, b1), (a2, b2), ..., (an, bn) such that the sum of min(ai, bi) for
 * all i is maximized. Return the maximized sum.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: nums = [1,4,3,2]
 * Output: 4
 * Explanation: All possible pairings (ignoring the ordering of elements) are:
 * 1. (1, 4), (2, 3) -> min(1, 4) + min(2, 3) = 1 + 2 = 3
 * 2. (1, 3), (2, 4) -> min(1, 3) + min(2, 4) = 1 + 2 = 3
 * 3. (1, 2), (3, 4) -> min(1, 2) + min(3, 4) = 1 + 3 = 4
 * So the maximum possible sum is 4.
 * 
 * Example 2:
 * 
 * 
 * Input: nums = [6,2,6,5,1,2]
 * Output: 9
 * Explanation: The optimal pairing is (2, 1), (2, 5), (6, 6). min(2, 1) +
 * min(2, 5) + min(6, 6) = 1 + 2 + 6 = 9.
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= n <= 10^4
 * nums.length == 2 * n
 * -10^4 <= nums[i] <= 10^4
 * 
 * 
 */

// @lc code=start
class Solution {
    public int arrayPairSum(int[] nums) {
        //         Arrays.sort(nums);
//          int sum= 0;
//          for(int i=0;i<nums.length;i+=2)sum+=nums[i];
        
//         return sum;
        int[] arr = new int[20002];
        int ans=0;
        for(int i:nums)arr[i+10000]++;
        int tag=1;
        for(int i=-10000;i<=10000;i++){
            ans+= ((arr[i+10000]+tag)/2)*i;
            tag=(arr[i+10000]+tag) & 1;
        }

        return ans;
    }
}
// @lc code=end

