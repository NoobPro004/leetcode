/*
 * @lc app=leetcode id=1704 lang=java
 *
 * [1704] Determine if String Halves Are Alike
 *
 * https://leetcode.com/problems/determine-if-string-halves-are-alike/description/
 *
 * algorithms
 * Easy (77.82%)
 * Likes:    1647
 * Dislikes: 79
 * Total Accepted:    185.4K
 * Total Submissions: 238.3K
 * Testcase Example:  '"book"'
 *
 * You are given a string s of even length. Split this string into two halves
 * of equal lengths, and let a be the first half and b be the second half.
 * 
 * Two strings are alike if they have the same number of vowels ('a', 'e', 'i',
 * 'o', 'u', 'A', 'E', 'I', 'O', 'U'). Notice that s contains uppercase and
 * lowercase letters.
 * 
 * Return true if a and b are alike. Otherwise, return false.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: s = "book"
 * Output: true
 * Explanation: a = "bo" and b = "ok". a has 1 vowel and b has 1 vowel.
 * Therefore, they are alike.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: s = "textbook"
 * Output: false
 * Explanation: a = "text" and b = "book". a has 1 vowel whereas b has 2.
 * Therefore, they are not alike.
 * Notice that the vowel o is counted twice.
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 2 <= s.length <= 1000
 * s.length is even.
 * s consists of uppercase and lowercase letters.
 * 
 * 
 */

// @lc code=start
class Solution {
    public boolean halvesAreAlike(String s) {
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        
        int i=0;
        int counta=0;
        int countb=0;
        int j=s.length()-1;
        while(i<j){
            if(set.contains(s.charAt(i++)))counta++;
            
            if(set.contains(s.charAt(j--)))countb++;
        }
        
        return counta==countb;
    }
}
// @lc code=end

