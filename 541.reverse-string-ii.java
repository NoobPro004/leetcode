/*
 * @lc app=leetcode id=541 lang=java
 *
 * [541] Reverse String II
 *
 * https://leetcode.com/problems/reverse-string-ii/description/
 *
 * algorithms
 * Easy (50.54%)
 * Likes:    1524
 * Dislikes: 3079
 * Total Accepted:    190.3K
 * Total Submissions: 377.2K
 * Testcase Example:  '"abcdefg"\n2'
 *
 * Given a string s and an integer k, reverse the first k characters for every
 * 2k characters counting from the start of the string.
 * 
 * If there are fewer than k characters left, reverse all of them. If there are
 * less than 2k but greater than or equal to k characters, then reverse the
 * first k characters and leave the other as original.
 * 
 * 
 * Example 1:
 * Input: s = "abcdefg", k = 2
 * Output: "bacdfeg"
 * Example 2:
 * Input: s = "abcd", k = 2
 * Output: "bacd"
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= s.length <= 10^4
 * s consists of only lowercase English letters.
 * 1 <= k <= 10^4
 * 
 * 
 */

// @lc code=start
class Solution {
    public String reverseStr(String s, int k) {
        char[] arr=st.toCharArray();
        for(int i=0;i<arr.length;i+=2*k){
            int s=i;
            int e=i+k-1;
            if(e>=st.length()){
                e=arr.length-1;
                swap(arr,s,e);
            }else{
               swap(arr,s,e);
            }
        }
        
        return new String(arr);
    }
    
    public void swap(char[] arr,int i,int j){
        while(i<j){
            char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
            i++;
            j--;
        }
    }
}
// @lc code=end

