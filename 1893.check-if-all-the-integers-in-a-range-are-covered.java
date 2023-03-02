/*
 * @lc app=leetcode id=1893 lang=java
 *
 * [1893] Check if All the Integers in a Range Are Covered
 *
 * https://leetcode.com/problems/check-if-all-the-integers-in-a-range-are-covered/description/
 *
 * algorithms
 * Easy (50.60%)
 * Likes:    420
 * Dislikes: 79
 * Total Accepted:    30.1K
 * Total Submissions: 59.6K
 * Testcase Example:  '[[1,2],[3,4],[5,6]]\n2\n5'
 *
 * You are given a 2D integer array ranges and two integers left and right.
 * Each ranges[i] = [starti, endi] represents an inclusive interval between
 * starti and endi.
 * 
 * Return true if each integer in the inclusive range [left, right] is covered
 * by at least one interval in ranges. Return false otherwise.
 * 
 * An integer x is covered by an interval ranges[i] = [starti, endi] if starti
 * <= x <= endi.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: ranges = [[1,2],[3,4],[5,6]], left = 2, right = 5
 * Output: true
 * Explanation: Every integer between 2 and 5 is covered:
 * - 2 is covered by the first range.
 * - 3 and 4 are covered by the second range.
 * - 5 is covered by the third range.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: ranges = [[1,10],[10,20]], left = 21, right = 21
 * Output: false
 * Explanation: 21 is not covered by any range.
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= ranges.length <= 50
 * 1 <= starti <= endi <= 50
 * 1 <= left <= right <= 50
 * 
 * 
 */

// @lc code=start
class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        int[] arr=new int[52];
        for(int[] i:ranges){
            arr[i[0]]+=1;
            arr[i[1]+1]-=1;
        }
        
        int sum=0;
        for(int i=0;i<=right;i++){
            sum+=arr[i];
            if(sum==0 && i>=left)return false;
        }
        
        return true;
    }
}
// @lc code=end

