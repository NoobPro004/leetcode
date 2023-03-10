/*
 * @lc app=leetcode id=1979 lang=java
 *
 * [1979] Find Greatest Common Divisor of Array
 *
 * https://leetcode.com/problems/find-greatest-common-divisor-of-array/description/
 *
 * algorithms
 * Easy (76.96%)
 * Likes:    793
 * Dislikes: 33
 * Total Accepted:    76.3K
 * Total Submissions: 99.2K
 * Testcase Example:  '[2,5,6,9,10]'
 *
 * Given an integer array nums, return the greatest common divisor of the
 * smallest number and largest number in nums.
 * 
 * The greatest common divisor of two numbers is the largest positive integer
 * that evenly divides both numbers.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: nums = [2,5,6,9,10]
 * Output: 2
 * Explanation:
 * The smallest number in nums is 2.
 * The largest number in nums is 10.
 * The greatest common divisor of 2 and 10 is 2.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: nums = [7,5,6,8,3]
 * Output: 1
 * Explanation:
 * The smallest number in nums is 3.
 * The largest number in nums is 8.
 * The greatest common divisor of 3 and 8 is 1.
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: nums = [3,3]
 * Output: 3
 * Explanation:
 * The smallest number in nums is 3.
 * The largest number in nums is 3.
 * The greatest common divisor of 3 and 3 is 3.
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 2 <= nums.length <= 1000
 * 1 <= nums[i] <= 1000
 * 
 * 
 */

// @lc code=start
class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        return gcd(nums[0],nums[nums.length-1]);
    }
    
    public int gcd(int x,int y){
        if(x==0)return y;
        return gcd(y%x,x);
    }
}
// @lc code=end

