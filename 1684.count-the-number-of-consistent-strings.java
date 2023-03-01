/*
 * @lc app=leetcode id=1684 lang=java
 *
 * [1684] Count the Number of Consistent Strings
 *
 * https://leetcode.com/problems/count-the-number-of-consistent-strings/description/
 *
 * algorithms
 * Easy (82.11%)
 * Likes:    1349
 * Dislikes: 55
 * Total Accepted:    122.4K
 * Total Submissions: 149.1K
 * Testcase Example:  '"ab"\n["ad","bd","aaab","baa","badab"]'
 *
 * You are given a string allowed consisting of distinct characters and an
 * array of strings words. A string is consistent if all characters in the
 * string appear in the string allowed.
 * 
 * Return the number of consistent strings in the array words.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
 * Output: 2
 * Explanation: Strings "aaab" and "baa" are consistent since they only contain
 * characters 'a' and 'b'.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: allowed = "abc", words = ["a","b","c","ab","ac","bc","abc"]
 * Output: 7
 * Explanation: All strings are consistent.
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: allowed = "cad", words = ["cc","acd","b","ba","bac","bad","ac","d"]
 * Output: 4
 * Explanation: Strings "cc", "acd", "ac", and "d" are consistent.
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= words.length <= 10^4
 * 1 <= allowed.length <=^ 26
 * 1 <= words[i].length <= 10
 * The characters in allowed are distinct.
 * words[i] and allowed contain only lowercase English letters.
 * 
 * 
 */

// @lc code=start
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        //         int[] count= new int[26];
//         for(char c:allowed.toCharArray())count[c-'a']++;
        
//         int ans=0;
//         for(String s:words){
//             int[] temp=new int[26];
//             for(char c:s.toCharArray())temp[c-'a']++;
//             if(isEqual(count,temp))ans++;
//         }
        
//         return ans;
//     }
    
//     public boolean isEqual(int[] c,int[] b){
//         for(int i=0;i<26;i++){
//             if(b[i]!=0 && c[i]==0)return false;
                 
//         }
//         return true;
        
        int a=0;
        for(char c:allowed.toCharArray()){
            a|=(1 << (c-'a'));
        }

        int ans=0;
        search : for(String s:words){
            for(char c:s.toCharArray()){
                if((a & (1<<(c-'a'))) == 0)continue search;
            }
            
            ans++;
        }

        return ans;
    }
}
// @lc code=end

