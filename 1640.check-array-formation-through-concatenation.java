/*
 * @lc app=leetcode id=1640 lang=java
 *
 * [1640] Check Array Formation Through Concatenation
 *
 * https://leetcode.com/problems/check-array-formation-through-concatenation/description/
 *
 * algorithms
 * Easy (56.19%)
 * Likes:    791
 * Dislikes: 127
 * Total Accepted:    73.8K
 * Total Submissions: 131.2K
 * Testcase Example:  '[15,88]\n[[88],[15]]'
 *
 * You are given an array of distinct integers arr and an array of integer
 * arrays pieces, where the integers in pieces are distinct. Your goal is to
 * form arr by concatenating the arrays in pieces in any order. However, you
 * are not allowed to reorder the integers in each array pieces[i].
 * 
 * Return true if it is possible to form the array arr from pieces. Otherwise,
 * return false.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: arr = [15,88], pieces = [[88],[15]]
 * Output: true
 * Explanation: Concatenate [15] then [88]
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: arr = [49,18,16], pieces = [[16,18,49]]
 * Output: false
 * Explanation: Even though the numbers match, we cannot reorder pieces[0].
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: arr = [91,4,64,78], pieces = [[78],[4,64],[91]]
 * Output: true
 * Explanation: Concatenate [91] then [4,64] then [78]
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= pieces.length <= arr.length <= 100
 * sum(pieces[i].length) == arr.length
 * 1 <= pieces[i].length <= arr.length
 * 1 <= arr[i], pieces[i][j] <= 100
 * The integers in arr are distinct.
 * The integers in pieces are distinct (i.e., If we flatten pieces in a 1D
 * array, all the integers in this array are distinct).
 * 
 * 
 */

// @lc code=start
class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        Map<Integer,Integer> map = new HashMap<>();
         for(int i=0;i<p.length;i++){
             for(int j=0;j<p[i].length;j++){
                 map.put(p[i][j],i);
             }
         }
        
        int i=0;
        while(i<arr.length){
            int curr=arr[i];
            if(!map.containsKey(curr) || p[map.get(curr)][0]!=curr)return false;
            
            int[] k=p[map.get(curr)];
            for(int j=0;j<k.length;j++){
                if(arr[i]!=k[j])return false;
                map.remove(k[j]);
                i++;
            }
            
        }
        
        return true;
    }
}
// @lc code=end

