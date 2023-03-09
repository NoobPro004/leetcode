/*
 * @lc app=leetcode id=345 lang=java
 *
 * [345] Reverse Vowels of a String
 *
 * https://leetcode.com/problems/reverse-vowels-of-a-string/description/
 *
 * algorithms
 * Easy (49.97%)
 * Likes:    3201
 * Dislikes: 2375
 * Total Accepted:    484.8K
 * Total Submissions: 969.1K
 * Testcase Example:  '"hello"'
 *
 * Given a string s, reverse only all the vowels in the string and return it.
 * 
 * The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both
 * lower and upper cases, more than once.
 * 
 * 
 * Example 1:
 * Input: s = "hello"
 * Output: "holle"
 * Example 2:
 * Input: s = "leetcode"
 * Output: "leotcede"
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= s.length <= 3 * 10^5
 * s consist of printable ASCII characters.
 * 
 * 
 */

// @lc code=start
class Solution {
    public String reverseVowels(String arr) {
        char[]  s= arr.toCharArray();
       int k=s.length -1;
       for(int i=0;i<k;i++){
           if(s[i]=='a' || s[i]=='A' || s[i]=='e' || s[i]=='E' || s[i]=='i'|| s[i]=='I' || s[i]=='o' || s[i]=='O'| s[i]=='u' || s[i]=='U'){
               for(int j=k;j>i;j--){
                   if(s[j]=='a' || s[j]=='A' || s[j]=='e' || s[j]=='E' || s[j]=='i'|| s[j]=='I' || s[j]=='o' || s[j]=='O'| s[j]=='u' || s[j]=='U'){
                       char temp= s[i];
                       s[i]=s[j];
                       s[j]=temp;
                       k=j-1;
                       break;
                       }
               }
           }
       }
       
       
    StringBuilder jo = new StringBuilder();
       for(int i=0;i<s.length;i++){
           jo.append(s[i]);
       }
     
       
       return jo.toString();
       
   }
}
// @lc code=end

