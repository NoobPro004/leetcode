/*
 * @lc app=leetcode id=1417 lang=java
 *
 * [1417] Reformat The String
 *
 * https://leetcode.com/problems/reformat-the-string/description/
 *
 * algorithms
 * Easy (55.10%)
 * Likes:    492
 * Dislikes: 91
 * Total Accepted:    49.2K
 * Total Submissions: 89.6K
 * Testcase Example:  '"a0b1c2"'
 *
 * You are given an alphanumeric string s. (Alphanumeric string is a string
 * consisting of lowercase English letters and digits).
 * 
 * You have to find a permutation of the string where no letter is followed by
 * another letter and no digit is followed by another digit. That is, no two
 * adjacent characters have the same type.
 * 
 * Return the reformatted string or return an empty string if it is impossible
 * to reformat the string.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: s = "a0b1c2"
 * Output: "0a1b2c"
 * Explanation: No two adjacent characters have the same type in "0a1b2c".
 * "a0b1c2", "0a1b2c", "0c2a1b" are also valid permutations.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: s = "leetcode"
 * Output: ""
 * Explanation: "leetcode" has only characters so we cannot separate them by
 * digits.
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: s = "1229857369"
 * Output: ""
 * Explanation: "1229857369" has only digits so we cannot separate them by
 * characters.
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= s.length <= 500
 * s consists of only lowercase English letters and/or digits.
 * 
 * 
 */

// @lc code=start
class Solution {
    public String reformat(String s) {
        int[] digits=new int[10];
        int count=0;
        int[] arr=new int[26];
        for(char c:s.toCharArray()){
            if(Character.isLetter(c)){
                arr[c-'a']++;
                count++;
            }else{
                digits[c-'0']++;
            }
        }
        
        int rem=s.length()-count-count;
        
        if(rem>1 || rem<-1)return "";
        boolean dig= rem==1;
        StringBuilder ans = new StringBuilder();
        int i=0;
        int j=0;
        while(ans.length()!=s.length()){
            if(dig){
                if(digits[i]>0){
                    ans.append((char)(i+'0')+"");
                    dig=!dig;
                    digits[i]--;
                }else i++;
            }else{
                if(arr[j]>0){
                    ans.append((char)(j+'a'));
                    arr[j]--;
                    dig=!dig;
                }else{
                    j++;
                }
            }
        }
        
        return ans.toString();
    }
}
// @lc code=end

