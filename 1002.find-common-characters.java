/*
 * @lc app=leetcode id=1002 lang=java
 *
 * [1002] Find Common Characters
 *
 * https://leetcode.com/problems/find-common-characters/description/
 *
 * algorithms
 * Easy (68.43%)
 * Likes:    2902
 * Dislikes: 238
 * Total Accepted:    172.3K
 * Total Submissions: 251.8K
 * Testcase Example:  '["bella","label","roller"]'
 *
 * Given a string array words, return an array of all characters that show up
 * in all strings within the words (including duplicates). You may return the
 * answer in any order.
 * 
 * 
 * Example 1:
 * Input: words = ["bella","label","roller"]
 * Output: ["e","l","l"]
 * Example 2:
 * Input: words = ["cool","lock","cook"]
 * Output: ["c","o"]
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= words.length <= 100
 * 1 <= words[i].length <= 100
 * words[i] consists of lowercase English letters.
 * 
 * 
 */

// @lc code=start
class Solution {
    public List<String> commonChars(String[] words) {
        int[] arr= new int[26];
        Arrays.fill(arr,words.length);
        
        for(String s:words){
            int[] temp = new int[26];
            for(char c:s.toCharArray()){
                temp[c-'a']++;
            }
            
            getInter(arr,temp);
        }
        
        List<String> ans = new ArrayList<>();
        for(int i=0;i<26;i++){
                int count=arr[i];
                for(int j=0;j<count;j++){
                    ans.add((char)('a'+i) +"");
            }
        }
        
        return ans;
    }
    
    public void getInter(int[] f,int[] s){
        for(int i=0;i<26;i++){
            f[i]=Math.min(f[i],s[i]);
        }
    }
}
// @lc code=end

