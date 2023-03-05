/*
 * @lc app=leetcode id=2506 lang=java
 *
 * [2506] Count Pairs Of Similar Strings
 *
 * https://leetcode.com/problems/count-pairs-of-similar-strings/description/
 *
 * algorithms
 * Easy (70.31%)
 * Likes:    290
 * Dislikes: 22
 * Total Accepted:    24.1K
 * Total Submissions: 34.3K
 * Testcase Example:  '["aba","aabb","abcd","bac","aabc"]'
 *
 * You are given a 0-indexed string array words.
 * 
 * Two strings are similar if they consist of the same characters.
 * 
 * 
 * For example, "abca" and "cba" are similar since both consist of characters
 * 'a', 'b', and 'c'.
 * However, "abacba" and "bcfd" are not similar since they do not consist of
 * the same characters.
 * 
 * 
 * Return the number of pairs (i, j) such that 0 <= i < j <= word.length - 1
 * and the two strings words[i] and words[j] are similar.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: words = ["aba","aabb","abcd","bac","aabc"]
 * Output: 2
 * Explanation: There are 2 pairs that satisfy the conditions:
 * - i = 0 and j = 1 : both words[0] and words[1] only consist of characters
 * 'a' and 'b'. 
 * - i = 3 and j = 4 : both words[3] and words[4] only consist of characters
 * 'a', 'b', and 'c'. 
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: words = ["aabb","ab","ba"]
 * Output: 3
 * Explanation: There are 3 pairs that satisfy the conditions:
 * - i = 0 and j = 1 : both words[0] and words[1] only consist of characters
 * 'a' and 'b'. 
 * - i = 0 and j = 2 : both words[0] and words[2] only consist of characters
 * 'a' and 'b'.
 * - i = 1 and j = 2 : both words[1] and words[2] only consist of characters
 * 'a' and 'b'.
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: words = ["nba","cba","dba"]
 * Output: 0
 * Explanation: Since there does not exist any pair that satisfies the
 * conditions, we return 0.
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= words.length <= 100
 * 1 <= words[i].length <= 100
 * words[i] consist of only lowercase English letters.
 * 
 * 
 */

// @lc code=start
class Solution {
    public int similarPairs(String[] words) {
        //         int ans=0;
//         Map<String,Integer> map = new HashMap<>();
//         for(String s:words){
//             char[] a=s.toCharArray();
//             Arrays.sort(a);
//             StringBuilder sb = new StringBuilder();
//             for(char c:a)if(sb.length()==0 || sb.charAt(sb.length()-1)!=c)sb.append(c);
            
//             String st=sb.toString();
//             ans+=map.getOrDefault(st,0);
//             map.put(st,map.getOrDefault(st,0)+1);
//         }
        
//         return ans;
        
int ans=0;
Map<Integer,Integer> map = new HashMap<>();
 for(String s:words){
     int a=0;
     for(char c:s.toCharArray()){
         a=a | 1<<(c-'a');
     }
     
     int count=map.getOrDefault(a,0);
     ans+=count;
     map.put(a,count+1);
 }

return ans;
    }
}
// @lc code=end

