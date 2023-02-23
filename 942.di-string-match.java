/*
 * @lc app=leetcode id=942 lang=java
 *
 * [942] DI String Match
 *
 * https://leetcode.com/problems/di-string-match/description/
 *
 * algorithms
 * Easy (77.08%)
 * Likes:    2107
 * Dislikes: 845
 * Total Accepted:    127.1K
 * Total Submissions: 164.7K
 * Testcase Example:  '"IDID"'
 *
 * A permutation perm of n + 1 integers of all the integers in the range [0, n]
 * can be represented as a string s of length n where:
 * 
 * 
 * s[i] == 'I' if perm[i] < perm[i + 1], and
 * s[i] == 'D' if perm[i] > perm[i + 1].
 * 
 * 
 * Given a string s, reconstruct the permutation perm and return it. If there
 * are multiple valid permutations perm, return any of them.
 * 
 * 
 * Example 1:
 * Input: s = "IDID"
 * Output: [0,4,1,3,2]
 * Example 2:
 * Input: s = "III"
 * Output: [0,1,2,3]
 * Example 3:
 * Input: s = "DDI"
 * Output: [3,2,0,1]
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= s.length <= 10^5
 * s[i] is either 'I' or 'D'.
 * 
 * 
 */

// @lc code=start
class Solution {
    public int[] diStringMatch(String s) {
        int l=0;
        int h=s.length();
        int[] ans = new int[s.length()+1];
        int i=0;
        for(char c : s.toCharArray()){
            if(c=='I'){
                ans[i++]=l++;
            }else{
                ans[i++]=h--;
            }
        }
        while(l<=h && i<ans.length)ans[i++]=l++;
        
        return ans;
    }
}
// @lc code=end

