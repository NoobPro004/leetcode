/*
 * @lc app=leetcode id=1287 lang=java
 *
 * [1287] Element Appearing More Than 25% In Sorted Array
 *
 * https://leetcode.com/problems/element-appearing-more-than-25-in-sorted-array/description/
 *
 * algorithms
 * Easy (59.46%)
 * Likes:    802
 * Dislikes: 41
 * Total Accepted:    75K
 * Total Submissions: 126.2K
 * Testcase Example:  '[1,2,2,6,6,6,6,7,10]'
 *
 * Given an integer array sorted in non-decreasing order, there is exactly one
 * integer in the array that occurs more than 25% of the time, return that
 * integer.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: arr = [1,2,2,6,6,6,6,7,10]
 * Output: 6
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: arr = [1,1]
 * Output: 1
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= arr.length <= 10^4
 * 0 <= arr[i] <= 10^5
 * 
 * 
 */

// @lc code=start
class Solution {
    public int findSpecialInteger(int[] arr) {
        int n=arr.length/4;
        for(int i=0;i<arr.length;i++){
            if(i+n<arr.length && arr[i]==arr[i+n])return arr[i];
        }
        
        return -1;
    }
    }
}
// @lc code=end

