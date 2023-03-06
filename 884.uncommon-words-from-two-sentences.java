/*
 * @lc app=leetcode id=884 lang=java
 *
 * [884] Uncommon Words from Two Sentences
 *
 * https://leetcode.com/problems/uncommon-words-from-two-sentences/description/
 *
 * algorithms
 * Easy (66.24%)
 * Likes:    1138
 * Dislikes: 153
 * Total Accepted:    115.1K
 * Total Submissions: 173.6K
 * Testcase Example:  '"this apple is sweet"\n"this apple is sour"'
 *
 * A sentence is a string of single-space separated words where each word
 * consists only of lowercase letters.
 * 
 * A word is uncommon if it appears exactly once in one of the sentences, and
 * does not appear in the other sentence.
 * 
 * Given two sentences s1 and s2, return a list of all the uncommon words. You
 * may return the answer in any order.
 * 
 * 
 * Example 1:
 * Input: s1 = "this apple is sweet", s2 = "this apple is sour"
 * Output: ["sweet","sour"]
 * Example 2:
 * Input: s1 = "apple apple", s2 = "banana"
 * Output: ["banana"]
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= s1.length, s2.length <= 200
 * s1 and s2 consist of lowercase English letters and spaces.
 * s1 and s2 do not have leading or trailing spaces.
 * All the words in s1 and s2 are separated by a single space.
 * 
 * 
 */

// @lc code=start
class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String,Integer> map = new HashMap<>();
        String[] arr=s1.trim().split(" ");
        for(String s:arr)map.put(s,map.getOrDefault(s,0)+1);
        
        List<String> a=new ArrayList<>();
        for(String s:s2.trim().split(" ")){
            if(!map.containsKey(s)){
                map.put(s,-1);
            }else{
                map.put(s,Integer.MAX_VALUE);
            }
        }
        for(String s:map.keySet()){
            if(map.get(s)==-1 || map.get(s)==1){
                a.add(s);
            }
        }
        String[] ans = new String[a.size()];
        for(int i=0;i<ans.length;i++)ans[i]=a.get(i);
        
        return ans;
    }
}
// @lc code=end

