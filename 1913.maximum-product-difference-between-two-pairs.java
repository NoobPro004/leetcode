/*
 * @lc app=leetcode id=1913 lang=java
 *
 * [1913] Maximum Product Difference Between Two Pairs
 *
 * https://leetcode.com/problems/maximum-product-difference-between-two-pairs/description/
 *
 * algorithms
 * Easy (81.29%)
 * Likes:    689
 * Dislikes: 35
 * Total Accepted:    79.2K
 * Total Submissions: 97.5K
 * Testcase Example:  '[5,6,2,7,4]'
 *
 * The product difference between two pairs (a, b) and (c, d) is defined as (a
 * * b) - (c * d).
 * 
 * 
 * For example, the product difference between (5, 6) and (2, 7) is (5 * 6) -
 * (2 * 7) = 16.
 * 
 * 
 * Given an integer array nums, choose four distinct indices w, x, y, and z
 * such that the product difference between pairs (nums[w], nums[x]) and
 * (nums[y], nums[z]) is maximized.
 * 
 * Return the maximum such product difference.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: nums = [5,6,2,7,4]
 * Output: 34
 * Explanation: We can choose indices 1 and 3 for the first pair (6, 7) and
 * indices 2 and 4 for the second pair (2, 4).
 * The product difference is (6 * 7) - (2 * 4) = 34.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: nums = [4,2,5,9,7,4,8]
 * Output: 64
 * Explanation: We can choose indices 3 and 6 for the first pair (9, 8) and
 * indices 1 and 5 for the second pair (2, 4).
 * The product difference is (9 * 8) - (2 * 4) = 64.
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 4 <= nums.length <= 10^4
 * 1 <= nums[i] <= 10^4
 * 
 */

// @lc code=start
class Solution {
    public int maxProductDifference(int[] nums) {
        // Arrays.sort(nums);
        // int n=nums.length;
        // return nums[n-1]*nums[n-2] - nums[0]*nums[1];

        int n = nums.length;
        
        for(int i=0; i<n; i++){
            // this is done to keep both old and new value together. 
            // going by the example of [5,0,1,2,3,4]
            // after this nums[0] will be 5 + 6*(4%6) = 5 + 24 = 29;
            // now for next index calulation we might need the original value of num[0] which can be obtain by num[0]%6 = 29%6 = 5;
            // if we want to get just he new value of num[0], we can get it by num[0]/6 = 29/6 = 4
            nums[i] = nums[i] + n*(nums[nums[i]] % n);
        }
        
        for(int i=0; i<n; i++){
            nums[i] = nums[i]/n;
        }
        
        return nums;
    }
}
// @lc code=end

