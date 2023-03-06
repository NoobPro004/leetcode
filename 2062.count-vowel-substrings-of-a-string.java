/*
 * @lc app=leetcode id=2062 lang=java
 *
 * [2062] Count Vowel Substrings of a String
 *
 * https://leetcode.com/problems/count-vowel-substrings-of-a-string/description/
 *
 * algorithms
 * Easy (66.31%)
 * Likes:    700
 * Dislikes: 171
 * Total Accepted:    26.6K
 * Total Submissions: 40.2K
 * Testcase Example:  '"aeiouu"'
 *
 * A substring is a contiguous (non-empty) sequence of characters within a
 * string.
 * 
 * A vowel substring is a substring that only consists of vowels ('a', 'e',
 * 'i', 'o', and 'u') and has all five vowels present in it.
 * 
 * Given a string word, return the number of vowel substrings in word.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: word = "aeiouu"
 * Output: 2
 * Explanation: The vowel substrings of word are as follows (underlined):
 * - "aeiouu"
 * - "aeiouu"
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: word = "unicornarihan"
 * Output: 0
 * Explanation: Not all 5 vowels are present, so there are no vowel
 * substrings.
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: word = "cuaieuouac"
 * Output: 7
 * Explanation: The vowel substrings of word are as follows (underlined):
 * - "cuaieuouac"
 * - "cuaieuouac"
 * - "cuaieuouac"
 * - "cuaieuouac"
 * - "cuaieuouac"
 * - "cuaieuouac"
 * - "cuaieuouac"
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= word.length <= 100
 * word consists of lowercase English letters only.
 * 
 * 
 */

// @lc code=start
class Solution {
    public int countVowelSubstrings(String word) {
        int vow=0;
        Map<Character,Integer> map = new HashMap<>();
        int j=0;
        int k=0;
        map.put('a',0);
        map.put('e',0);
        map.put('i',0);
        map.put('o',0);
        map.put('u',0);
        int ans=0;
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.getOrDefault(c,0)+1);
                if(map.get(c)==1){
                    vow++;
                }
                
                while(vow==5){
                    map.put(word.charAt(k), map.get(word.charAt(k)) - 1);
                if ((int) map.get(word.charAt(k)) == 0) {
                    --vow;
                }
                    k++;
                    
                }
                
                ans+=(k-j);
            }else{
                map.forEach((k1,v)->{
                    map.put(k1,0);
                });
                
                j=i+1;
                k=i+1;
                 vow=0;   
            }
        }
        
        return ans;
    }
}
// @lc code=end

