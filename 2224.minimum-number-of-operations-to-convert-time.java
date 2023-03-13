/*
 * @lc app=leetcode id=2224 lang=java
 *
 * [2224] Minimum Number of Operations to Convert Time
 *
 * https://leetcode.com/problems/minimum-number-of-operations-to-convert-time/description/
 *
 * algorithms
 * Easy (65.51%)
 * Likes:    344
 * Dislikes: 30
 * Total Accepted:    31.3K
 * Total Submissions: 47.9K
 * Testcase Example:  '"02:30"\n"04:35"'
 *
 * You are given two strings current and correct representing two 24-hour
 * times.
 * 
 * 24-hour times are formatted as "HH:MM", where HH is between 00 and 23, and
 * MM is between 00 and 59. The earliest 24-hour time is 00:00, and the latest
 * is 23:59.
 * 
 * In one operation you can increase the time current by 1, 5, 15, or 60
 * minutes. You can perform this operation any number of times.
 * 
 * Return the minimum number of operations needed to convert current to
 * correct.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: current = "02:30", correct = "04:35"
 * Output: 3
 * Explanation:
 * We can convert current to correct in 3 operations as follows:
 * - Add 60 minutes to current. current becomes "03:30".
 * - Add 60 minutes to current. current becomes "04:30".
 * - Add 5 minutes to current. current becomes "04:35".
 * It can be proven that it is not possible to convert current to correct in
 * fewer than 3 operations.
 * 
 * Example 2:
 * 
 * 
 * Input: current = "11:00", correct = "11:01"
 * Output: 1
 * Explanation: We only have to add one minute to current, so the minimum
 * number of operations needed is 1.
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * current and correct are in the format "HH:MM"
 * current <= correct
 * 
 * 
 */

// @lc code=start
class Solution {
    public int convertTime(String current, String correct) {
        int a=Integer.parseInt(current.substring(0,2))*60+Integer.parseInt(current.substring(3));
        int b=Integer.parseInt(correct.substring(0,2))*60+Integer.parseInt(correct.substring(3));
        
        int diff=Math.abs(a-b);
        int ops=0;
        ops+=diff/60;
        diff%=60;
        ops+=diff/15;
        diff%=15;
        ops+=diff/5;
        diff%=5;
        ops+=diff;
        
        return ops;
    }
}
// @lc code=end

