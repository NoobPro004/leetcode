/*
 * @lc app=leetcode id=1624 lang=java
 *
 * [1624] Largest Substring Between Two Equal Characters
 *
 * https://leetcode.com/problems/largest-substring-between-two-equal-characters/description/
 *
 * algorithms
 * Easy (59.02%)
 * Likes:    528
 * Dislikes: 30
 * Total Accepted:    40.7K
 * Total Submissions: 68.9K
 * Testcase Example:  '"aa"'
 *
 * Given a string s, return the length of the longest substring between two
 * equal characters, excluding the two characters. If there is no such
 * substring return -1.
 * 
 * A substring is a contiguous sequence of characters within a string.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: s = "aa"
 * Output: 0
 * Explanation: The optimal substring here is an empty substring between the
 * two 'a's.
 * 
 * Example 2:
 * 
 * 
 * Input: s = "abca"
 * Output: 2
 * Explanation: The optimal substring here is "bc".
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: s = "cbzxy"
 * Output: -1
 * Explanation: There are no characters that appear twice in s.
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= s.length <= 300
 * s contains only lowercase English letters.
 * 
 * 
 */

// @lc code=start
class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int ans=-1;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(map.containsKey(c)){
                ans=Math.max(ans,i-1-map.get(c));
            }else map.put(c,i);
        }
        
        return ans;
    }
}
// @lc code=end

