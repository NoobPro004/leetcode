/*
 * @lc app=leetcode id=1346 lang=java
 *
 * [1346] Check If N and Its Double Exist
 *
 * https://leetcode.com/problems/check-if-n-and-its-double-exist/description/
 *
 * algorithms
 * Easy (36.46%)
 * Likes:    1497
 * Dislikes: 164
 * Total Accepted:    268.9K
 * Total Submissions: 737.1K
 * Testcase Example:  '[10,2,5,3]'
 *
 * Given an array arr of integers, check if there exist two indices i and j
 * such that :
 * 
 * 
 * i != j
 * 0 <= i, j < arr.length
 * arr[i] == 2 * arr[j]
 * 
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: arr = [10,2,5,3]
 * Output: true
 * Explanation: For i = 0 and j = 2, arr[i] == 10 == 2 * 5 == 2 * arr[j]
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: arr = [3,1,7,11]
 * Output: false
 * Explanation: There is no i and j that satisfy the conditions.
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 2 <= arr.length <= 500
 * -10^3 <= arr[i] <= 10^3
 * 
 * 
 */

// @lc code=start
class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for(int i:arr){
            if(set.contains(i*2))return true;
            
            if(i%2==0 && set.contains(i/2))return true;
            
            set.add(i);
        }
        
        return false;
    }
}
// @lc code=end

