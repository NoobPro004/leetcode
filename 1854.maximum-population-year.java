/*
 * @lc app=leetcode id=1854 lang=java
 *
 * [1854] Maximum Population Year
 *
 * https://leetcode.com/problems/maximum-population-year/description/
 *
 * algorithms
 * Easy (60.01%)
 * Likes:    921
 * Dislikes: 152
 * Total Accepted:    46.3K
 * Total Submissions: 77.2K
 * Testcase Example:  '[[1993,1999],[2000,2010]]'
 *
 * You are given a 2D integer array logs where each logs[i] = [birthi, deathi]
 * indicates the birth and death years of the i^th person.
 * 
 * The population of some year x is the number of people alive during that
 * year. The i^th person is counted in year x's population if x is in the
 * inclusive range [birthi, deathi - 1]. Note that the person is not counted in
 * the year that they die.
 * 
 * Return the earliest year with the maximum population.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: logs = [[1993,1999],[2000,2010]]
 * Output: 1993
 * Explanation: The maximum population is 1, and 1993 is the earliest year with
 * this population.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: logs = [[1950,1961],[1960,1971],[1970,1981]]
 * Output: 1960
 * Explanation: 
 * The maximum population is 2, and it had happened in years 1960 and 1970.
 * The earlier year between them is 1960.
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= logs.length <= 100
 * 1950 <= birthi < deathi <= 2050
 * 
 * 
 */

// @lc code=start
class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] count = new int[2052];
        for(int[] i :logs){
            count[i[0]]+=1;
            count[i[1]]-=1;
        }
        
        int max=0;
        int ans=-1;
        for(int i=1950;i<=2050;i++){
            if(i>1950)count[i]+=count[i-1];
            if(count[i]>max){
                max=count[i];
                ans=i;
            }
        }
        
        return ans;
    }
}
// @lc code=end

