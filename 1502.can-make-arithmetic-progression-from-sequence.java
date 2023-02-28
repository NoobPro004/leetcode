/*
 * @lc app=leetcode id=1502 lang=java
 *
 * [1502] Can Make Arithmetic Progression From Sequence
 *
 * https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/description/
 *
 * algorithms
 * Easy (67.92%)
 * Likes:    1005
 * Dislikes: 62
 * Total Accepted:    123.3K
 * Total Submissions: 181.7K
 * Testcase Example:  '[3,5,1]'
 *
 * A sequence of numbers is called an arithmetic progression if the difference
 * between any two consecutive elements is the same.
 * 
 * Given an array of numbers arr, return true if the array can be rearranged to
 * form an arithmetic progression. Otherwise, return false.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: arr = [3,5,1]
 * Output: true
 * Explanation: We can reorder the elements as [1,3,5] or [5,3,1] with
 * differences 2 and -2 respectively, between each consecutive elements.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: arr = [1,2,4]
 * Output: false
 * Explanation: There is no way to reorder the elements to obtain an arithmetic
 * progression.
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 2 <= arr.length <= 1000
 * -10^6 <= arr[i] <= 10^6
 * 
 * 
 */

// @lc code=start
class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
       Arrays.sort(arr);
        if(arr.length<=2)return true;
        int diff=arr[1]-arr[0];
        for(int i=2;i<arr.length;i++){
            if(diff!=arr[i]-arr[i-1])return false;
        }
        
        return true; 
    }
}
// @lc code=end

