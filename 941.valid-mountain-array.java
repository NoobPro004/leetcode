/*
 * @lc app=leetcode id=941 lang=java
 *
 * [941] Valid Mountain Array
 *
 * https://leetcode.com/problems/valid-mountain-array/description/
 *
 * algorithms
 * Easy (33.46%)
 * Likes:    2542
 * Dislikes: 156
 * Total Accepted:    351.1K
 * Total Submissions: 1M
 * Testcase Example:  '[2,1]'
 *
 * Given an array of integers arr, return true if and only if it is a valid
 * mountain array.
 * 
 * Recall that arr is a mountain array if and only if:
 * 
 * 
 * arr.length >= 3
 * There exists some i with 0 < i < arr.length - 1 such that:
 * 
 * arr[0] < arr[1] < ... < arr[i - 1] < arr[i] 
 * arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
 * 
 * 
 * 
 * 
 * 
 * Example 1:
 * Input: arr = [2,1]
 * Output: false
 * Example 2:
 * Input: arr = [3,5,5]
 * Output: false
 * Example 3:
 * Input: arr = [0,3,2,1]
 * Output: true
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= arr.length <= 10^4
 * 0 <= arr[i] <= 10^4
 * 
 * 
 */

// @lc code=start
class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<=1)return false;
        if(arr[1]<arr[0])return false;
        int i=1;
        while(i<arr.length && arr[i]>arr[i-1])i++;
        if(i==arr.length)return false;
        while(i<arr.length && arr[i]<arr[i-1])i++;
        
        return i>=arr.length;
    }
}
// @lc code=end

