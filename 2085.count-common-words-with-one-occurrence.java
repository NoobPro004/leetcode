/*
 * @lc app=leetcode id=2085 lang=java
 *
 * [2085] Count Common Words With One Occurrence
 *
 * https://leetcode.com/problems/count-common-words-with-one-occurrence/description/
 *
 * algorithms
 * Easy (69.96%)
 * Likes:    592
 * Dislikes: 14
 * Total Accepted:    42.5K
 * Total Submissions: 60.8K
 * Testcase Example:  '["leetcode","is","amazing","as","is"]\n["amazing","leetcode","is"]'
 *
 * Given two string arrays words1 and words2, return the number of strings that
 * appear exactly once in each of the two arrays.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: words1 = ["leetcode","is","amazing","as","is"], words2 =
 * ["amazing","leetcode","is"]
 * Output: 2
 * Explanation:
 * - "leetcode" appears exactly once in each of the two arrays. We count this
 * string.
 * - "amazing" appears exactly once in each of the two arrays. We count this
 * string.
 * - "is" appears in each of the two arrays, but there are 2 occurrences of it
 * in words1. We do not count this string.
 * - "as" appears once in words1, but does not appear in words2. We do not
 * count this string.
 * Thus, there are 2 strings that appear exactly once in each of the two
 * arrays.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: words1 = ["b","bb","bbb"], words2 = ["a","aa","aaa"]
 * Output: 0
 * Explanation: There are no strings that appear in each of the two arrays.
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: words1 = ["a","ab"], words2 = ["a","a","a","ab"]
 * Output: 1
 * Explanation: The only string that appears exactly once in each of the two
 * arrays is "ab".
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= words1.length, words2.length <= 1000
 * 1 <= words1[i].length, words2[j].length <= 30
 * words1[i] and words2[j] consists only of lowercase English letters.
 * 
 * 
 */

// @lc code=start
class Solution {
    public int countWords(String[] words1, String[] words2) {
        Map<String,Integer> map = new HashMap<>();
        for(String s:words1){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        
        for(String s:words2){
            if(map.getOrDefault(s,0)<2)map.put(s,map.getOrDefault(s,0)-1);
        }
        
        int ans=0;
        for(String s:map.keySet()){
            if(map.get(s)==0)ans++;
        }
        
        return ans;
    }
}
// @lc code=end

