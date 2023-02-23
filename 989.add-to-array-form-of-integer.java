/*
 * @lc app=leetcode id=989 lang=java
 *
 * [989] Add to Array-Form of Integer
 *
 * https://leetcode.com/problems/add-to-array-form-of-integer/description/
 *
 * algorithms
 * Easy (45.43%)
 * Likes:    2952
 * Dislikes: 244
 * Total Accepted:    218.5K
 * Total Submissions: 463.3K
 * Testcase Example:  '[1,2,0,0]\n34'
 *
 * The array-form of an integer num is an array representing its digits in left
 * to right order.
 * 
 * 
 * For example, for num = 1321, the array form is [1,3,2,1].
 * 
 * 
 * Given num, the array-form of an integer, and an integer k, return the
 * array-form of the integer num + k.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: num = [1,2,0,0], k = 34
 * Output: [1,2,3,4]
 * Explanation: 1200 + 34 = 1234
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: num = [2,7,4], k = 181
 * Output: [4,5,5]
 * Explanation: 274 + 181 = 455
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: num = [2,1,5], k = 806
 * Output: [1,0,2,1]
 * Explanation: 215 + 806 = 1021
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= num.length <= 10^4
 * 0 <= num[i] <= 9
 * num does not contain any leading zeros except for the zero itself.
 * 1 <= k <= 10^4
 * 
 * 
 */

// @lc code=start
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> arr =new ArrayList<>();
        int sum=0;
        for(int i=num.length-1;i>=0;i--){
            sum+=num[i]+k%10;
            k/=10;
            arr.add(0,sum%10);
            sum/=10;
        }
        
        while(k>0){
            sum+=k%10;
            arr.add(0,sum%10);
            k/=10;
            sum/=10;
            
        }
        
        while(sum>0){
            arr.add(0,sum%10);
            sum/=10;
        }
        
        return arr;
    }
}
// @lc code=end

