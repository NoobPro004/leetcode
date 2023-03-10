/*
 * @lc app=leetcode id=1309 lang=java
 *
 * [1309] Decrypt String from Alphabet to Integer Mapping
 *
 * https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/description/
 *
 * algorithms
 * Easy (79.69%)
 * Likes:    1327
 * Dislikes: 91
 * Total Accepted:    104.2K
 * Total Submissions: 130.7K
 * Testcase Example:  '"10#11#12"'
 *
 * You are given a string s formed by digits and '#'. We want to map s to
 * English lowercase characters as follows:
 * 
 * 
 * Characters ('a' to 'i') are represented by ('1' to '9') respectively.
 * Characters ('j' to 'z') are represented by ('10#' to '26#') respectively.
 * 
 * 
 * Return the string formed after mapping.
 * 
 * The test cases are generated so that a unique mapping will always exist.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: s = "10#11#12"
 * Output: "jkab"
 * Explanation: "j" -> "10#" , "k" -> "11#" , "a" -> "1" , "b" -> "2".
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: s = "1326#"
 * Output: "acz"
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= s.length <= 1000
 * s consists of digits and the '#' letter.
 * s will be a valid string such that mapping is always possible.
 * 
 * 
 */

// @lc code=start
class Solution {
    public String freqAlphabets(String s) {
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='#'){
                if(i>1){
                    char a=(char)(Integer.parseInt(s.substring(i-2,i))-1+'a');
                    ans.setLength(ans.length()-2);
                    ans.append(a+"");
                    
                }
            }else{
                ans.append((char)(Integer.parseInt(s.charAt(i)+"")-1+'a')+"");
            }
        }
        
        return ans.toString();
    }
}
// @lc code=end

