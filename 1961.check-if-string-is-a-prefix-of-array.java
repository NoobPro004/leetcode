/*
 * @lc app=leetcode id=1961 lang=java
 *
 * [1961] Check If String Is a Prefix of Array
 *
 * https://leetcode.com/problems/check-if-string-is-a-prefix-of-array/description/
 *
 * algorithms
 * Easy (53.62%)
 * Likes:    366
 * Dislikes: 67
 * Total Accepted:    36.4K
 * Total Submissions: 67.9K
 * Testcase Example:  '"iloveleetcode"\n["i","love","leetcode","apples"]'
 *
 * Given a string s and an array of strings words, determine whether s is a
 * prefix string of words.
 * 
 * A string s is a prefix string of words if s can be made by concatenating the
 * first k strings in words for some positive k no larger than words.length.
 * 
 * Return true if s is a prefix string of words, or false otherwise.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: s = "iloveleetcode", words = ["i","love","leetcode","apples"]
 * Output: true
 * Explanation:
 * s can be made by concatenating "i", "love", and "leetcode" together.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: s = "iloveleetcode", words = ["apples","i","love","leetcode"]
 * Output: false
 * Explanation:
 * It is impossible to make s using a prefix of arr.
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= words.length <= 100
 * 1 <= words[i].length <= 20
 * 1 <= s.length <= 1000
 * words[i] and s consist of only lowercase English letters.
 * 
 * 
 */

// @lc code=start
class Solution {
    public boolean isPrefixString(String s, String[] words) {
        //         for(String st:words){
//             if(s.indexOf(st)!=0)return false;
            
//             s=s.substring(st.length());
//             if(s.length()==0)return true;
//         }
        
//         return s.length()==0;
int index=0;
for(String st:words){
    for(char c:st.toCharArray()){
        if(index==s.length() || s.charAt(index++)!=c)return false;
    }
    
    if(index==s.length())return true;
}

return index==s.length();
    }
}
// @lc code=end

