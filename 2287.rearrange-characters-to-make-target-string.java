/*
 * @lc app=leetcode id=2287 lang=java
 *
 * [2287] Rearrange Characters to Make Target String
 *
 * https://leetcode.com/problems/rearrange-characters-to-make-target-string/description/
 *
 * algorithms
 * Easy (58.19%)
 * Likes:    348
 * Dislikes: 25
 * Total Accepted:    29.8K
 * Total Submissions: 51.3K
 * Testcase Example:  '"ilovecodingonleetcode"\n"code"'
 *
 * You are given two 0-indexed strings s and target. You can take some letters
 * from s and rearrange them to form new strings.
 * 
 * Return the maximum number of copies of target that can be formed by taking
 * letters from s and rearranging them.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: s = "ilovecodingonleetcode", target = "code"
 * Output: 2
 * Explanation:
 * For the first copy of "code", take the letters at indices 4, 5, 6, and 7.
 * For the second copy of "code", take the letters at indices 17, 18, 19, and
 * 20.
 * The strings that are formed are "ecod" and "code" which can both be
 * rearranged into "code".
 * We can make at most two copies of "code", so we return 2.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: s = "abcba", target = "abc"
 * Output: 1
 * Explanation:
 * We can make one copy of "abc" by taking the letters at indices 0, 1, and 2.
 * We can make at most one copy of "abc", so we return 1.
 * Note that while there is an extra 'a' and 'b' at indices 3 and 4, we cannot
 * reuse the letter 'c' at index 2, so we cannot make a second copy of "abc".
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: s = "abbaccaddaeea", target = "aaaaa"
 * Output: 1
 * Explanation:
 * We can make one copy of "aaaaa" by taking the letters at indices 0, 3, 6, 9,
 * and 12.
 * We can make at most one copy of "aaaaa", so we return 1.
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= s.length <= 100
 * 1 <= target.length <= 10
 * s and target consist of lowercase English letters.
 * 
 * 
 */

// @lc code=start
class Solution {
    public int rearrangeCharacters(String s, String target) {
        int[] arr=new int[26];
        int[] arr2=new int[26];
        for(char c:s.toCharArray())arr[c-'a']++;
        
        for(char c:target.toCharArray())arr2[c-'a']++;
        
        int ans=Integer.MAX_VALUE;
        for(char c:target.toCharArray()){
            ans=Math.min(ans,arr[c-'a']/arr2[c-'a']);
        }
        
        return ans;
    }
}
// @lc code=end

