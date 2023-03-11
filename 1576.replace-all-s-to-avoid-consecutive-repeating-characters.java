/*
 * @lc app=leetcode id=1576 lang=java
 *
 * [1576] Replace All ?'s to Avoid Consecutive Repeating Characters
 *
 * https://leetcode.com/problems/replace-all-s-to-avoid-consecutive-repeating-characters/description/
 *
 * algorithms
 * Easy (48.51%)
 * Likes:    485
 * Dislikes: 156
 * Total Accepted:    51.6K
 * Total Submissions: 106.8K
 * Testcase Example:  '"?zs"'
 *
 * Given a string s containing only lowercase English letters and the '?'
 * character, convert all the '?' characters into lowercase letters such that
 * the final string does not contain any consecutive repeating characters. You
 * cannot modify the non '?' characters.
 * 
 * It is guaranteed that there are no consecutive repeating characters in the
 * given string except for '?'.
 * 
 * Return the final string after all the conversions (possibly zero) have been
 * made. If there is more than one solution, return any of them. It can be
 * shown that an answer is always possible with the given constraints.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: s = "?zs"
 * Output: "azs"
 * Explanation: There are 25 solutions for this problem. From "azs" to "yzs",
 * all are valid. Only "z" is an invalid modification as the string will
 * consist of consecutive repeating characters in "zzs".
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: s = "ubv?w"
 * Output: "ubvaw"
 * Explanation: There are 24 solutions for this problem. Only "v" and "w" are
 * invalid modifications as the strings will consist of consecutive repeating
 * characters in "ubvvw" and "ubvww".
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= s.length <= 100
 * s consist of lowercase English letters and '?'.
 * 
 * 
 */

// @lc code=start
class Solution {
    public String modifyString(String s) {
        if(s.length()==1)return s.charAt(0)=='?' ?  "a" : s;
        int add=0;
        char[] arr=s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='?'){
                if(i==0){
                    while((char)(add+'a')==arr[i+1]){
                        add=(add+1)%26;
                    }
                    arr[i]=(char)(add+'a');
                }else if(i==arr.length-1){
                    while((char)(add+'a')==arr[i-1]){
                        add=(add+1)%26;
                    }
                    arr[i]=(char)(add+'a');
                }else{
                    while((char)(add+'a')==arr[i+1] || (char)(add+'a')==arr[i-1]){
                        add=(add+1)%26;
                    }
                    arr[i]=(char)(add+'a');
                }
            }
        }
        
        return new String(arr);
    }
}
// @lc code=end

