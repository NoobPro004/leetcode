/*
 * @lc app=leetcode id=953 lang=java
 *
 * [953] Verifying an Alien Dictionary
 *
 * https://leetcode.com/problems/verifying-an-alien-dictionary/description/
 *
 * algorithms
 * Easy (54.40%)
 * Likes:    4509
 * Dislikes: 1439
 * Total Accepted:    451.2K
 * Total Submissions: 828.9K
 * Testcase Example:  '["hello","leetcode"]\n"hlabcdefgijkmnopqrstuvwxyz"'
 *
 * In an alien language, surprisingly, they also use English lowercase letters,
 * but possibly in a different order. The order of the alphabet is some
 * permutation of lowercase letters.
 * 
 * Given a sequence of words written in the alien language, and the order of
 * the alphabet, return true if and only if the given words are sorted
 * lexicographically in this alien language.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: words = ["hello","leetcode"], order = "hlabcdefgijkmnopqrstuvwxyz"
 * Output: true
 * Explanation: As 'h' comes before 'l' in this language, then the sequence is
 * sorted.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: words = ["word","world","row"], order = "worldabcefghijkmnpqstuvxyz"
 * Output: false
 * Explanation: As 'd' comes after 'l' in this language, then words[0] >
 * words[1], hence the sequence is unsorted.
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: words = ["apple","app"], order = "abcdefghijklmnopqrstuvwxyz"
 * Output: false
 * Explanation: The first three characters "app" match, and the second string
 * is shorter (in size.) According to lexicographical rules "apple" > "app",
 * because 'l' > '∅', where '∅' is defined as the blank character which is less
 * than any other character (More info).
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= words.length <= 100
 * 1 <= words[i].length <= 20
 * order.length == 26
 * All characters in words[i] and order are English lowercase letters.
 * 
 * 
 */

// @lc code=start
class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        Map<Character,Integer> map = new HashMap<>();
        int i=0;
        for(char c : order.toCharArray()){
            map.put(c,i);
            i++;
        }
        i=1;
        for(i=1;i<words.length;i++){
            if(!comp(words[i],words[i-1],map))return false;;
        }
        
        return true;
        
    }
    
    public boolean comp(String a,String b,Map<Character,Integer> map){
        
        int i=0;
        while(i<a.length() && i<b.length() && a.charAt(i)==b.charAt(i))i++;
        if(i<a.length() && i<b.length() && map.get(a.charAt(i))<map.get(b.charAt(i)))return false;
        if(i==b.length() || i==a.length())return a.length()>=b.length();
        return true;
    }
}
// @lc code=end

