/*
 * @lc app=leetcode id=2409 lang=java
 *
 * [2409] Count Days Spent Together
 *
 * https://leetcode.com/problems/count-days-spent-together/description/
 *
 * algorithms
 * Easy (43.37%)
 * Likes:    189
 * Dislikes: 534
 * Total Accepted:    16.6K
 * Total Submissions: 38.1K
 * Testcase Example:  '"08-15"\n"08-18"\n"08-16"\n"08-19"'
 *
 * Alice and Bob are traveling to Rome for separate business meetings.
 * 
 * You are given 4 strings arriveAlice, leaveAlice, arriveBob, and leaveBob.
 * Alice will be in the city from the dates arriveAlice to leaveAlice
 * (inclusive), while Bob will be in the city from the dates arriveBob to
 * leaveBob (inclusive). Each will be a 5-character string in the format
 * "MM-DD", corresponding to the month and day of the date.
 * 
 * Return the total number of days that Alice and Bob are in Rome together.
 * 
 * You can assume that all dates occur in the same calendar year, which is not
 * a leap year. Note that the number of days per month can be represented as:
 * [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31].
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: arriveAlice = "08-15", leaveAlice = "08-18", arriveBob = "08-16",
 * leaveBob = "08-19"
 * Output: 3
 * Explanation: Alice will be in Rome from August 15 to August 18. Bob will be
 * in Rome from August 16 to August 19. They are both in Rome together on
 * August 16th, 17th, and 18th, so the answer is 3.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: arriveAlice = "10-01", leaveAlice = "10-31", arriveBob = "11-01",
 * leaveBob = "12-31"
 * Output: 0
 * Explanation: There is no day when Alice and Bob are in Rome together, so we
 * return 0.
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * All dates are provided in the format "MM-DD".
 * Alice and Bob's arrival dates are earlier than or equal to their leaving
 * dates.
 * The given dates are valid dates of a non-leap year.
 * 
 * 
 */

// @lc code=start
class Solution {
    int[] monthsum=new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        for(int i=1;i<13;i++)monthsum[i]+=monthsum[i-1];
        
        int startA=fun(arriveAlice);
        int startB=fun(arriveBob);
        int endA=fun(leaveAlice);
        int endB=fun(leaveBob);
        if(startA>endB || endA<startB)return 0;
        
        return Math.min(endA,endB) - Math.max(startA,startB) +1;
    }
    
    public int fun(String s){
        int month = Integer.parseInt(s.substring(0,2));
        int day = Integer.parseInt(s.substring(3));
        
        return monthsum[month-1]+day;
        
    }
}
// @lc code=end

