/*
 * @lc app=leetcode id=976 lang=java
 *
 * [976] Largest Perimeter Triangle
 *
 * https://leetcode.com/problems/largest-perimeter-triangle/description/
 *
 * algorithms
 * Easy (54.57%)
 * Likes:    2599
 * Dislikes: 370
 * Total Accepted:    194.8K
 * Total Submissions: 356.8K
 * Testcase Example:  '[2,1,2]'
 *
 * Given an integer array nums, return the largest perimeter of a triangle with
 * a non-zero area, formed from three of these lengths. If it is impossible to
 * form any triangle of a non-zero area, return 0.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: nums = [2,1,2]
 * Output: 5
 * Explanation: You can form a triangle with three side lengths: 1, 2, and 2.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: nums = [1,2,1,10]
 * Output: 0
 * Explanation: 
 * You cannot use the side lengths 1, 1, and 2 to form a triangle.
 * You cannot use the side lengths 1, 1, and 10 to form a triangle.
 * You cannot use the side lengths 1, 2, and 10 to form a triangle.
 * As we cannot use any three side lengths to form a triangle of non-zero area,
 * we return 0.
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 3 <= nums.length <= 10^4
 * 1 <= nums[i] <= 10^6
 * 
 * 
 */

// @lc code=start
class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int ans=0;
        for(int i=2;i<nums.length;i++){
            if(nums[i]<nums[i-1]+nums[i-2]){
                ans=Math.max(ans,nums[i]+nums[i-1]+nums[i-2]);
            }
        }
        
        return ans;
    }
    }
}
// @lc code=end

