/*
 * @lc app=leetcode id=709 lang=java
 *
 * [709] To Lower Case
 *
 * https://leetcode.com/problems/to-lower-case/description/
 *
 * algorithms
 * Easy (82.22%)
 * Likes:    1491
 * Dislikes: 2586
 * Total Accepted:    407.9K
 * Total Submissions: 495.7K
 * Testcase Example:  '"Hello"'
 *
 * Given a string s, return the string after replacing every uppercase letter
 * with the same lowercase letter.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: s = "Hello"
 * Output: "hello"
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: s = "here"
 * Output: "here"
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: s = "LOVELY"
 * Output: "lovely"
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= s.length <= 100
 * s consists of printable ASCII characters.
 * 
 * 
 */

// @lc code=start
class Solution {
    public String toLowerCase(String str) {
        StringBuilder s = new StringBuilder("");
        
     for(int i=0;i<str.length();i++){
         int a=(int)str.charAt(i);
         if(a>=65 && a<=90){
             char b = (char)(a+32);
             s.append(b);
         }else{
             s.append(str.charAt(i));
         }
     }
        
        return s.toString(); 
    }
}
// @lc code=end

