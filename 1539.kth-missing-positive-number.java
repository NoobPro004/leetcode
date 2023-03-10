/*
 * @lc app=leetcode id=1539 lang=java
 *
 * [1539] Kth Missing Positive Number
 *
 * https://leetcode.com/problems/kth-missing-positive-number/description/
 *
 * algorithms
 * Easy (56.19%)
 * Likes:    3608
 * Dislikes: 266
 * Total Accepted:    215.5K
 * Total Submissions: 383.1K
 * Testcase Example:  '[2,3,4,7,11]\n5'
 *
 * Given an array arr of positive integers sorted in a strictly increasing
 * order, and an integer k.
 * 
 * Return the k^th positive integer that is missing from this array.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: arr = [2,3,4,7,11], k = 5
 * Output: 9
 * Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The
 * 5^th missing positive integer is 9.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: arr = [1,2,3,4], k = 2
 * Output: 6
 * Explanation: The missing positive integers are [5,6,7,...]. The 2^nd missing
 * positive integer is 6.
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= arr.length <= 1000
 * 1 <= arr[i] <= 1000
 * 1 <= k <= 1000
 * arr[i] < arr[j] for 1 <= i < j <= arr.length
 * 
 * 
 * 
 * Follow up:
 * 
 * Could you solve this problem in less than O(n) complexity?
 * 
 */

// @lc code=start
class Solution {
    public int findKthPositive(int[] arr, int k) {
       int start=0;
        for(int i=0;i<arr.length;i++){
            int diff=arr[i]-start-1;
            if(k<=diff){
                return start+k;
            }else k-=diff;
            
            start=arr[i];
        }
        
        return arr[arr.length-1]+k; 
    }
}
// @lc code=end

