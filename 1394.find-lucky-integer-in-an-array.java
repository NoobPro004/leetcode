/*
 * @lc app=leetcode id=1394 lang=java
 *
 * [1394] Find Lucky Integer in an Array
 *
 * https://leetcode.com/problems/find-lucky-integer-in-an-array/description/
 *
 * algorithms
 * Easy (64.08%)
 * Likes:    890
 * Dislikes: 26
 * Total Accepted:    88.8K
 * Total Submissions: 138.2K
 * Testcase Example:  '[2,2,3,4]'
 *
 * Given an array of integers arr, a lucky integer is an integer that has a
 * frequency in the array equal to its value.
 * 
 * Return the largest lucky integer in the array. If there is no lucky integer
 * return -1.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: arr = [2,2,3,4]
 * Output: 2
 * Explanation: The only lucky number in the array is 2 because frequency[2] ==
 * 2.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: arr = [1,2,2,3,3,3]
 * Output: 3
 * Explanation: 1, 2 and 3 are all lucky numbers, return the largest of them.
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: arr = [2,2,2,3,3]
 * Output: -1
 * Explanation: There are no lucky numbers in the array.
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= arr.length <= 500
 * 1 <= arr[i] <= 500
 * 
 * 
 */

// @lc code=start
class Solution {
    public int findLucky(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:arr)map.put(i,map.getOrDefault(i,0)+1);
        
        int ans=-1;
        for(int i:map.keySet())if(map.get(i)==i)ans=Math.max(ans,i);
        
        return ans;
    }
}
// @lc code=end

