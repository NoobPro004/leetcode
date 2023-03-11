/*
 * @lc app=leetcode id=1859 lang=java
 *
 * [1859] Sorting the Sentence
 *
 * https://leetcode.com/problems/sorting-the-sentence/description/
 *
 * algorithms
 * Easy (84.14%)
 * Likes:    1670
 * Dislikes: 52
 * Total Accepted:    108.1K
 * Total Submissions: 128.5K
 * Testcase Example:  '"is2 sentence4 This1 a3"'
 *
 * A sentence is a list of words that are separated by a single space with no
 * leading or trailing spaces. Each word consists of lowercase and uppercase
 * English letters.
 * 
 * A sentence can be shuffled by appending the 1-indexed word position to each
 * word then rearranging the words in the sentence.
 * 
 * 
 * For example, the sentence "This is a sentence" can be shuffled as "sentence4
 * a3 is2 This1" or "is2 sentence4 This1 a3".
 * 
 * 
 * Given a shuffled sentence s containing no more than 9 words, reconstruct and
 * return the original sentence.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: s = "is2 sentence4 This1 a3"
 * Output: "This is a sentence"
 * Explanation: Sort the words in s to their original positions "This1 is2 a3
 * sentence4", then remove the numbers.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: s = "Myself2 Me1 I4 and3"
 * Output: "Me Myself and I"
 * Explanation: Sort the words in s to their original positions "Me1 Myself2
 * and3 I4", then remove the numbers.
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 2 <= s.length <= 200
 * s consists of lowercase and uppercase English letters, spaces, and digits
 * from 1 to 9.
 * The number of words in s is between 1 and 9.
 * The words in s are separated by a single space.
 * s contains no leading or trailing spaces.
 * 
 */

// @lc code=start
class Solution {
    public String sortSentence(String s) {
        String[] arr=s.split(" ");
        String[] ans=new String[arr.length];
        for(String st:arr){
            int a=(int)(st.charAt(st.length()-1)-'0');
            ans[a-1]=st.substring(0,st.length()-1);
        }
        
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<ans.length-1;i++){
            sb.append(ans[i]).append(" ");
        }
        
        sb.append(ans[ans.length-1]);
        
        return sb.toString();
    }
}
// @lc code=end

