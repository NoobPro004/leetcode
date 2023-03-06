/*
 * @lc app=leetcode id=859 lang=java
 *
 * [859] Buddy Strings
 *
 * https://leetcode.com/problems/buddy-strings/description/
 *
 * algorithms
 * Easy (29.14%)
 * Likes:    1762
 * Dislikes: 1111
 * Total Accepted:    143.6K
 * Total Submissions: 492.5K
 * Testcase Example:  '"ab"\n"ba"'
 *
 * Given two strings s and goal, return true if you can swap two letters in s
 * so the result is equal to goal, otherwise, return false.
 * 
 * Swapping letters is defined as taking two indices i and j (0-indexed) such
 * that i != j and swapping the characters at s[i] and s[j].
 * 
 * 
 * For example, swapping at indices 0 and 2 in "abcd" results in "cbad".
 * 
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: s = "ab", goal = "ba"
 * Output: true
 * Explanation: You can swap s[0] = 'a' and s[1] = 'b' to get "ba", which is
 * equal to goal.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: s = "ab", goal = "ab"
 * Output: false
 * Explanation: The only letters you can swap are s[0] = 'a' and s[1] = 'b',
 * which results in "ba" != goal.
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: s = "aa", goal = "aa"
 * Output: true
 * Explanation: You can swap s[0] = 'a' and s[1] = 'a' to get "aa", which is
 * equal to goal.
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= s.length, goal.length <= 2 * 10^4
 * s and goal consist of lowercase letters.
 * 
 * 
 */

// @lc code=start
class Solution {
    public boolean buddyStrings(String s, String goal) {
        if(s.length()!=goal.length())return false;
        Map<Character,Integer> map=new HashMap<>();
        
        boolean dup=false;
        
        Character a=null;
        Character b=null;
        boolean first =false;
        boolean sec=false;
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=goal.charAt(i)){
                if(!first){
                    first=true;
                    a=s.charAt(i);
                    b=goal.charAt(i);
                }else if(!sec){
                    sec=true;
                    if(s.charAt(i)!=b || goal.charAt(i)!=a)return false;
                }else return false;
            }else{
                map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
                
                if(map.get(s.charAt(i))==2)dup=true;
            }
        }
        
        if(!first && dup)return true;
        
        if(!sec)return false;
        
        
        return true;
    }
}
// @lc code=end

