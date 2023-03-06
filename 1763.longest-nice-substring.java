/*
 * @lc app=leetcode id=1763 lang=java
 *
 * [1763] Longest Nice Substring
 *
 * https://leetcode.com/problems/longest-nice-substring/description/
 *
 * algorithms
 * Easy (61.59%)
 * Likes:    969
 * Dislikes: 681
 * Total Accepted:    36.3K
 * Total Submissions: 58.9K
 * Testcase Example:  '"YazaAay"'
 *
 * A string s is nice if, for every letter of the alphabet that s contains, it
 * appears both in uppercase and lowercase. For example, "abABB" is nice
 * because 'A' and 'a' appear, and 'B' and 'b' appear. However, "abA" is not
 * because 'b' appears, but 'B' does not.
 * 
 * Given a string s, return the longest substring of s that is nice. If there
 * are multiple, return the substring of the earliest occurrence. If there are
 * none, return an empty string.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: s = "YazaAay"
 * Output: "aAa"
 * Explanation: "aAa" is a nice string because 'A/a' is the only letter of the
 * alphabet in s, and both 'A' and 'a' appear.
 * "aAa" is the longest nice substring.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: s = "Bb"
 * Output: "Bb"
 * Explanation: "Bb" is a nice string because both 'B' and 'b' appear. The
 * whole string is a substring.
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: s = "c"
 * Output: ""
 * Explanation: There are no nice substrings.
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= s.length <= 100
 * s consists of uppercase and lowercase English letters.
 * 
 * 
 */

// @lc code=start
class Solution {
    public String longestNiceSubstring(String s) {
        if(s.length()<=1)return "";
        Set<Character> set = new HashSet<>();
        for(char c : s.toCharArray())set.add(c);
        
        for(int i=0;i<s.length();i++){
            if(set.contains(Character.toUpperCase(s.charAt(i))) && set.contains(Character.toLowerCase(s.charAt(i)))){
                continue;
            }
            String a=longestNiceSubstring(s.substring(0,i));
            String b=longestNiceSubstring(s.substring(i+1));
            return a.length()>=b.length() ? a : b;
        }
        
        return s;
    }
}
// @lc code=end

