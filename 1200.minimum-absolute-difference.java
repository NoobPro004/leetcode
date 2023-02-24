/*
 * @lc app=leetcode id=1200 lang=java
 *
 * [1200] Minimum Absolute Difference
 *
 * https://leetcode.com/problems/minimum-absolute-difference/description/
 *
 * algorithms
 * Easy (69.71%)
 * Likes:    1953
 * Dislikes: 65
 * Total Accepted:    150.8K
 * Total Submissions: 216.4K
 * Testcase Example:  '[4,2,1,3]'
 *
 * Given an array of distinct integers arr, find all pairs of elements with the
 * minimum absolute difference of any two elements.
 * 
 * Return a list of pairs in ascending order(with respect to pairs), each pair
 * [a, b] follows
 * 
 * 
 * a, b are from arr
 * a < b
 * b - a equals to the minimum absolute difference of any two elements in
 * arr
 * 
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: arr = [4,2,1,3]
 * Output: [[1,2],[2,3],[3,4]]
 * Explanation: The minimum absolute difference is 1. List all pairs with
 * difference equal to 1 in ascending order.
 * 
 * Example 2:
 * 
 * 
 * Input: arr = [1,3,6,10,15]
 * Output: [[1,3]]
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: arr = [3,8,-10,23,19,-4,-14,27]
 * Output: [[-14,-10],[19,23],[23,27]]
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 2 <= arr.length <= 10^5
 * -10^6 <= arr[i] <= 10^6
 * 
 * 
 */

// @lc code=start
class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        int min=Integer.MAX_VALUE;
         for(int i=0;i<arr.length-1;i++){
             int diff=arr[i+1]-arr[i];
             if(diff==min){
                 List<Integer> a  =new ArrayList<>();
             a.add(arr[i]);
             a.add(arr[i+1]);
             ans.add(a);
             }else if(diff<min){
                 List<Integer> a  =new ArrayList<>();
             a.add(arr[i]);
             a.add(arr[i+1]);
                 ans.clear();
                 min=diff;
             ans.add(a);
             }
             
         }
        
        return ans;
    }
}
// @lc code=end

