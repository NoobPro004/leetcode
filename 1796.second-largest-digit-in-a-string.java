/*
 * @lc app=leetcode id=1796 lang=java
 *
 * [1796] Second Largest Digit in a String
 *
 * https://leetcode.com/problems/second-largest-digit-in-a-string/description/
 *
 * algorithms
 * Easy (49.19%)
 * Likes:    396
 * Dislikes: 102
 * Total Accepted:    37.7K
 * Total Submissions: 76.4K
 * Testcase Example:  '"dfa12321afd"'
 *
 * Given an alphanumeric string s, return the second largest numerical digit
 * that appears in s, or -1 if it does not exist.
 * 
 * An alphanumeric string is a string consisting of lowercase English letters
 * and digits.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: s = "dfa12321afd"
 * Output: 2
 * Explanation: The digits that appear in s are [1, 2, 3]. The second largest
 * digit is 2.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: s = "abc1111"
 * Output: -1
 * Explanation: The digits that appear in s are [1]. There is no second largest
 * digit. 
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= s.length <= 500
 * s consists of only lowercase English letters and/or digits.
 * 
 * 
 */

// @lc code=start
class Solution {
    public int secondHighest(String s) {
        int[] arr=new int[10];
        for(char c:s.toCharArray()){
            if(Character.isDigit(c))arr[c-'0']++;
        }
        
        boolean largest=false;
        for(int i=9;i>=0;i--){
            if(arr[i]>0){
                if(!largest)largest=true;
                else return i;
            }
        }
        
        return -1;
    }
}
// @lc code=end

