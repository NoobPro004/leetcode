/*
 * @lc app=leetcode id=1822 lang=java
 *
 * [1822] Sign of the Product of an Array
 *
 * https://leetcode.com/problems/sign-of-the-product-of-an-array/description/
 *
 * algorithms
 * Easy (65.53%)
 * Likes:    922
 * Dislikes: 125
 * Total Accepted:    159.3K
 * Total Submissions: 243.7K
 * Testcase Example:  '[-1,-2,-3,-4,3,2,1]'
 *
 * There is a function signFunc(x) that returns:
 * 
 * 
 * 1 if x is positive.
 * -1 if x is negative.
 * 0 if x is equal to 0.
 * 
 * 
 * You are given an integer array nums. Let product be the product of all
 * values in the array nums.
 * 
 * Return signFunc(product).
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: nums = [-1,-2,-3,-4,3,2,1]
 * Output: 1
 * Explanation: The product of all values in the array is 144, and
 * signFunc(144) = 1
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: nums = [1,5,0,2,-3]
 * Output: 0
 * Explanation: The product of all values in the array is 0, and signFunc(0) =
 * 0
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: nums = [-1,1,-1,1,-1]
 * Output: -1
 * Explanation: The product of all values in the array is -1, and signFunc(-1)
 * = -1
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= nums.length <= 1000
 * -100 <= nums[i] <= 100
 * 
 * 
 */

// @lc code=start
class Solution {
    public int arraySign(int[] nums) {
        int product=1;
        for(int i:nums)product*=(i==0 ? 0 : i<0 ? -1 : 1);
        
        return product;
    }
}
// @lc code=end

