/*
 * @lc app=leetcode id=1550 lang=java
 *
 * [1550] Three Consecutive Odds
 *
 * https://leetcode.com/problems/three-consecutive-odds/description/
 *
 * algorithms
 * Easy (63.54%)
 * Likes:    516
 * Dislikes: 51
 * Total Accepted:    63.7K
 * Total Submissions: 100.2K
 * Testcase Example:  '[2,6,4,1]'
 *
 * Given an integer array arr, return true if there are three consecutive odd
 * numbers in the array. Otherwise, return false.
 * 
 * Example 1:
 * 
 * 
 * Input: arr = [2,6,4,1]
 * Output: false
 * Explanation: There are no three consecutive odds.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: arr = [1,2,34,3,4,5,7,23,12]
 * Output: true
 * Explanation: [5,7,23] are three consecutive odds.
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= arr.length <= 1000
 * 1 <= arr[i] <= 1000
 * 
 * 
 */

// @lc code=start
class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
       int odd =-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                odd=-1;
            }else{
                if(odd==-1)odd=i;
                else if(i-odd+1>=3)return true;
            }
        }
        
        return false; 
    }
}
// @lc code=end

