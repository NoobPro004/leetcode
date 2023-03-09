/*
 * @lc app=leetcode id=917 lang=java
 *
 * [917] Reverse Only Letters
 *
 * https://leetcode.com/problems/reverse-only-letters/description/
 *
 * algorithms
 * Easy (61.77%)
 * Likes:    1791
 * Dislikes: 60
 * Total Accepted:    158.2K
 * Total Submissions: 255.6K
 * Testcase Example:  '"ab-cd"'
 *
 * Given a string s, reverse the string according to the following rules:
 * 
 * 
 * All the characters that are not English letters remain in the same
 * position.
 * All the English letters (lowercase or uppercase) should be reversed.
 * 
 * 
 * Return s after reversing it.
 * 
 * 
 * Example 1:
 * Input: s = "ab-cd"
 * Output: "dc-ba"
 * Example 2:
 * Input: s = "a-bC-dEf-ghIj"
 * Output: "j-Ih-gfE-dCba"
 * Example 3:
 * Input: s = "Test1ng-Leet=code-Q!"
 * Output: "Qedo1ct-eeLg=ntse-T!"
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= s.length <= 100
 * s consists of characters with ASCII values in the range [33, 122].
 * s does not contain '\"' or '\\'.
 * 
 * 
 */

// @lc code=start
class Solution {
    public String reverseOnlyLetters(String s) {
        int i=0;
        int j=s.length()-1;
        char[] arr=s.toCharArray();
        while(i<j){
            if(!Character.isLetter(arr[i]))i++;
            else if(!Character.isLetter(arr[j]))j--;
            else{
                char temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
        
        return new String(arr);
    }
}
// @lc code=end

