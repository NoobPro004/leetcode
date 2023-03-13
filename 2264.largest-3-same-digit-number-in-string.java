/*
 * @lc app=leetcode id=2264 lang=java
 *
 * [2264] Largest 3-Same-Digit Number in String
 *
 * https://leetcode.com/problems/largest-3-same-digit-number-in-string/description/
 *
 * algorithms
 * Easy (59.44%)
 * Likes:    289
 * Dislikes: 19
 * Total Accepted:    30.7K
 * Total Submissions: 51.5K
 * Testcase Example:  '"6777133339"'
 *
 * You are given a string num representing a large integer. An integer is good
 * if it meets the following conditions:
 * 
 * 
 * It is a substring of num with length 3.
 * It consists of only one unique digit.
 * 
 * 
 * Return the maximum good integer as a string or an empty string "" if no such
 * integer exists.
 * 
 * Note:
 * 
 * 
 * A substring is a contiguous sequence of characters within a string.
 * There may be leading zeroes in num or a good integer.
 * 
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: num = "6777133339"
 * Output: "777"
 * Explanation: There are two distinct good integers: "777" and "333".
 * "777" is the largest, so we return "777".
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: num = "2300019"
 * Output: "000"
 * Explanation: "000" is the only good integer.
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: num = "42352338"
 * Output: ""
 * Explanation: No substring of length 3 consists of only one unique digit.
 * Therefore, there are no good integers.
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 3 <= num.length <= 1000
 * num only consists of digits.
 * 
 * 
 */

// @lc code=start
class Solution {
    public String largestGoodInteger(String num) {
        String ans="";
        int i=0;
         while(i<num.length()){
             if(isUnique(num,i)){
                 if(ans.length()==0 || ans.charAt(0)<num.charAt(i))ans=num.substring(i,i+3);
                 
                 i+=3;
             }else i++;
             
         }
        
        return ans;
    }
    
    public boolean isUnique(String s,int i){
        if(s.length()-i<3)return false;
        
        return s.charAt(i)==s.charAt(i+1) && s.charAt(i+1)==s.charAt(i+2);
    }
}
// @lc code=end

