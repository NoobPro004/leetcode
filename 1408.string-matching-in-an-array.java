/*
 * @lc app=leetcode id=1408 lang=java
 *
 * [1408] String Matching in an Array
 *
 * https://leetcode.com/problems/string-matching-in-an-array/description/
 *
 * algorithms
 * Easy (63.86%)
 * Likes:    715
 * Dislikes: 81
 * Total Accepted:    67.6K
 * Total Submissions: 105.9K
 * Testcase Example:  '["mass","as","hero","superhero"]'
 *
 * Given an array of string words, return all strings in words that is a
 * substring of another word. You can return the answer in any order.
 * 
 * A substring is a contiguous sequence of characters within a string
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: words = ["mass","as","hero","superhero"]
 * Output: ["as","hero"]
 * Explanation: "as" is substring of "mass" and "hero" is substring of
 * "superhero".
 * ["hero","as"] is also a valid answer.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: words = ["leetcode","et","code"]
 * Output: ["et","code"]
 * Explanation: "et", "code" are substring of "leetcode".
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: words = ["blue","green","bu"]
 * Output: []
 * Explanation: No string of words is substring of another string.
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= words.length <= 100
 * 1 <= words[i].length <= 30
 * words[i] contains only lowercase English letters.
 * All the strings of words are unique.
 * 
 * 
 */

// @lc code=start
class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> ans = new ArrayList<>();
        Set<String> set = new HashSet<>();
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                if(words[i].contains(words[j]))set.add(words[j]);
                
                if(words[j].contains(words[i]))set.add(words[i]);
            }
        }
        
        for(String s : set)ans.add(s);
        
        return ans;
    }
}
// @lc code=end

