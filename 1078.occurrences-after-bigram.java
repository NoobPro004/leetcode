/*
 * @lc app=leetcode id=1078 lang=java
 *
 * [1078] Occurrences After Bigram
 *
 * https://leetcode.com/problems/occurrences-after-bigram/description/
 *
 * algorithms
 * Easy (63.63%)
 * Likes:    412
 * Dislikes: 325
 * Total Accepted:    60.7K
 * Total Submissions: 95.4K
 * Testcase Example:  '"alice is a good girl she is a good student"\n"a"\n"good"'
 *
 * Given two strings first and second, consider occurrences in some text of the
 * form "first second third", where second comes immediately after first, and
 * third comes immediately after second.
 * 
 * Return an array of all the words third for each occurrence of "first second
 * third".
 * 
 * 
 * Example 1:
 * Input: text = "alice is a good girl she is a good student", first = "a",
 * second = "good"
 * Output: ["girl","student"]
 * Example 2:
 * Input: text = "we will we will rock you", first = "we", second = "will"
 * Output: ["we","rock"]
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= text.length <= 1000
 * text consists of lowercase English letters and spaces.
 * All the words in text a separated by a single space.
 * 1 <= first.length, second.length <= 10
 * first and second consist of lowercase English letters.
 * 
 * 
 */

// @lc code=start
class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        String[] arr=text.split(" ");
        List<String> a = new ArrayList<>();
        for(int i=2;i<arr.length;i++){
            if(arr[i-1].equals(second) && arr[i-2].equals(first))a.add(arr[i]);
        }
        
        String[] ans=  new String[a.size()];
        for(int i=0;i<a.size();i++)ans[i]=a.get(i);
        
        
        return ans;
    }
}
// @lc code=end

