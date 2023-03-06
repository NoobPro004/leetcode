/*
 * @lc app=leetcode id=2325 lang=java
 *
 * [2325] Decode the Message
 *
 * https://leetcode.com/problems/decode-the-message/description/
 *
 * algorithms
 * Easy (84.73%)
 * Likes:    590
 * Dislikes: 60
 * Total Accepted:    52.4K
 * Total Submissions: 61.9K
 * Testcase Example:  '"the quick brown fox jumps over the lazy dog"\n"vkbs bs t suepuv"'
 *
 * You are given the strings key and message, which represent a cipher key and
 * a secret message, respectively. The steps to decode message are as
 * follows:
 * 
 * 
 * Use the first appearance of all 26 lowercase English letters in key as the
 * order of the substitution table.
 * Align the substitution table with the regular English alphabet.
 * Each letter in message is then substituted using the table.
 * Spaces ' ' are transformed to themselves.
 * 
 * 
 * 
 * For example, given key = "happy boy" (actual key would have at least one
 * instance of each letter in the alphabet), we have the partial substitution
 * table of ('h' -> 'a', 'a' -> 'b', 'p' -> 'c', 'y' -> 'd', 'b' -> 'e', 'o' ->
 * 'f').
 * 
 * 
 * Return the decoded message.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: key = "the quick brown fox jumps over the lazy dog", message = "vkbs
 * bs t suepuv"
 * Output: "this is a secret"
 * Explanation: The diagram above shows the substitution table.
 * It is obtained by taking the first appearance of each letter in "the quick
 * brown fox jumps over the lazy dog".
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: key = "eljuxhpwnyrdgtqkviszcfmabo", message = "zwx hnfx lqantp
 * mnoeius ycgk vcnjrdb"
 * Output: "the five boxing wizards jump quickly"
 * Explanation: The diagram above shows the substitution table.
 * It is obtained by taking the first appearance of each letter in
 * "eljuxhpwnyrdgtqkviszcfmabo".
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 26 <= key.length <= 2000
 * key consists of lowercase English letters and ' '.
 * key contains every letter in the English alphabet ('a' to 'z') at least
 * once.
 * 1 <= message.length <= 2000
 * message consists of lowercase English letters and ' '.
 * 
 * 
 */

// @lc code=start
class Solution {
    public String decodeMessage(String key, String message) {
        int[] arr=new int[26];
        Arrays.fill(arr,-1);
        int i=0;
        for(char a:key.toCharArray()){
            if(Character.isLetter(a) && arr[a-'a']==-1){
                arr[a-'a']=i++;
            }
        }
        StringBuilder ans=new StringBuilder();
        for(char c:message.toCharArray()){
            if(Character.isLetter(c)){
                ans.append((char)(arr[c-'a']+'a'));
                           
            }else ans.append(c);
        }
        
        return ans.toString();
    }
}
// @lc code=end

