/*
 * @lc app=leetcode id=409 lang=java
 *
 * [409] Longest Palindrome
 *
 * https://leetcode.com/problems/longest-palindrome/description/
 *
 * algorithms
 * Easy (54.39%)
 * Likes:    4443
 * Dislikes: 271
 * Total Accepted:    481.8K
 * Total Submissions: 887.4K
 * Testcase Example:  '"abccccdd"'
 *
 * Given a string s which consists of lowercase or uppercase letters, return
 * the length of the longest palindrome that can be built with those letters.
 * 
 * Letters are case sensitive, for example, "Aa" is not considered a palindrome
 * here.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: s = "abccccdd"
 * Output: 7
 * Explanation: One longest palindrome that can be built is "dccaccd", whose
 * length is 7.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: s = "a"
 * Output: 1
 * Explanation: The longest palindrome that can be built is "a", whose length
 * is 1.
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= s.length <= 2000
 * s consists of lowercase and/or uppercase English letters only.
 * 
 * 
 */

// @lc code=start
class Solution {
    public int longestPalindrome(String s) {
        int[] arr=new int[256];
        for(char c:s.toCharArray())arr[c]++;
        
        int ans=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                ans+=arr[i];
            }else ans+=arr[i]-1;
        }
        
        if(s.length()>ans)ans++;
        
        return ans;
    }
}
// @lc code=end

