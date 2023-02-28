/*
 * @lc app=leetcode id=1528 lang=java
 *
 * [1528] Shuffle String
 *
 * https://leetcode.com/problems/shuffle-string/description/
 *
 * algorithms
 * Easy (85.32%)
 * Likes:    2150
 * Dislikes: 383
 * Total Accepted:    279.8K
 * Total Submissions: 328.1K
 * Testcase Example:  '"codeleet"\n[4,5,6,7,0,2,1,3]'
 *
 * You are given a string s and an integer array indices of the same length.
 * The string s will be shuffled such that the character at the i^th position
 * moves to indices[i] in the shuffled string.
 * 
 * Return the shuffled string.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
 * Output: "leetcode"
 * Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: s = "abc", indices = [0,1,2]
 * Output: "abc"
 * Explanation: After shuffling, each character remains in its position.
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * s.length == indices.length == n
 * 1 <= n <= 100
 * s consists of only lowercase English letters.
 * 0 <= indices[i] < n
 * All values of indices are unique.
 * 
 * 
 */

// @lc code=start
class Solution {
    public String restoreString(String s, int[] indices) {
       //         Map<Integer,Integer> map = new HashMap<>();
//          for(int i=0;i<indices.length;i++){
//              map.put(indices[i],i);
//          }
        
//         StringBuilder ans=  new StringBuilder();
//         for(int i=0;i<indices.length;i++){
//             ans.append(s.charAt(map.get(i)));
//         }
        
//         return ans.toString();
        
        char[] arr= s.toCharArray();
        for(int i=0;i<indices.length;i++){
            while(indices[i]!=i){
                swap(arr,i,indices[i]);
                swapInd(indices,i,indices[i]);
            }
        }
        
        
        return new String(arr);
    }
    
    public void swapInd(int[] arr,int i,int j){
        int temp=arr[i]; 
        arr[i]=arr[j];
        arr[j]=temp;
    }
    
    public void swap(char[] arr,int i,int j){
        char temp=arr[i]; 
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
// @lc code=end

