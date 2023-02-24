/*
 * @lc app=leetcode id=1160 lang=java
 *
 * [1160] Find Words That Can Be Formed by Characters
 *
 * https://leetcode.com/problems/find-words-that-can-be-formed-by-characters/description/
 *
 * algorithms
 * Easy (67.64%)
 * Likes:    1271
 * Dislikes: 140
 * Total Accepted:    141K
 * Total Submissions: 208.6K
 * Testcase Example:  '["cat","bt","hat","tree"]\n"atach"'
 *
 * You are given an array of strings words and a string chars.
 * 
 * A string is good if it can be formed by characters from chars (each
 * character can only be used once).
 * 
 * Return the sum of lengths of all good strings in words.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: words = ["cat","bt","hat","tree"], chars = "atach"
 * Output: 6
 * Explanation: The strings that can be formed are "cat" and "hat" so the
 * answer is 3 + 3 = 6.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: words = ["hello","world","leetcode"], chars = "welldonehoneyr"
 * Output: 10
 * Explanation: The strings that can be formed are "hello" and "world" so the
 * answer is 5 + 5 = 10.
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= words.length <= 1000
 * 1 <= words[i].length, chars.length <= 100
 * words[i] and chars consist of lowercase English letters.
 * 
 * 
 */

// @lc code=start
class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] count=new int[26];
         for(char c:chars.toCharArray()){
             count[c-'a']++;
         }
        int ans=0;
        for(String s:words){
            int[] temp = new int[26];
             for(char c:s.toCharArray())temp[c-'a']++;
            
            if(canAdd(count,temp))ans+=s.length();
        }
        
        return ans;
    }
    
    public boolean canAdd(int[] f,int[] s){
        for(int i=0;i<26;i++){
            if(f[i]<s[i])return false;
              
        }
        return true;
    }
}
// @lc code=end

