/*
 * @lc app=leetcode id=2000 lang=java
 *
 * [2000] Reverse Prefix of Word
 *
 * https://leetcode.com/problems/reverse-prefix-of-word/description/
 *
 * algorithms
 * Easy (78.35%)
 * Likes:    602
 * Dislikes: 14
 * Total Accepted:    59.6K
 * Total Submissions: 75.9K
 * Testcase Example:  '"abcdefd"\n"d"'
 *
 * Given a 0-indexed string word and a character ch, reverse the segment of
 * word that starts at index 0 and ends at the index of the first occurrence of
 * ch (inclusive). If the character ch does not exist in word, do
 * nothing.
 * 
 * 
 * For example, if word = "abcdefd" and ch = "d", then you should reverse the
 * segment that starts at 0 and ends at 3 (inclusive). The resulting string
 * will be "dcbaefd".
 * 
 * 
 * Return the resulting string.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: word = "abcdefd", ch = "d"
 * Output: "dcbaefd"
 * Explanation: The first occurrence of "d" is at index 3. 
 * Reverse the part of word from 0 to 3 (inclusive), the resulting string is
 * "dcbaefd".
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: word = "xyxzxe", ch = "z"
 * Output: "zxyxxe"
 * Explanation: The first and only occurrence of "z" is at index 3.
 * Reverse the part of word from 0 to 3 (inclusive), the resulting string is
 * "zxyxxe".
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: word = "abcd", ch = "z"
 * Output: "abcd"
 * Explanation: "z" does not exist in word.
 * You should not do any reverse operation, the resulting string is "abcd".
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= word.length <= 250
 * word consists of lowercase English letters.
 * ch is a lowercase English letter.
 * 
 * 
 */

// @lc code=start
class Solution {
    public String reversePrefix(String word, char ch) {
        int prev=-1;
        if(word.length()==0)return "";
        char[] arr=word.toCharArray();
        char c=arr[0];
        for(int i=0;i<word.length();i++){
            
            if(arr[i]==c && prev==-1)prev=i;
            
            if(arr[i]==ch && prev!=-1){
                if(prev!=-1){
                    reverse(arr,prev,i);
                    break;
                }
                
                prev=-1;
            }
        }
        
        return new String(arr);
    }
    
    public void reverse(char[] arr,int i,int j){
        while(i<j){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        
        return;
    }
}
// @lc code=end

