/*
 * @lc app=leetcode id=1089 lang=java
 *
 * [1089] Duplicate Zeros
 *
 * https://leetcode.com/problems/duplicate-zeros/description/
 *
 * algorithms
 * Easy (51.51%)
 * Likes:    2192
 * Dislikes: 650
 * Total Accepted:    336.4K
 * Total Submissions: 653.1K
 * Testcase Example:  '[1,0,2,3,0,4,5,0]'
 *
 * Given a fixed-length integer array arr, duplicate each occurrence of zero,
 * shifting the remaining elements to the right.
 * 
 * Note that elements beyond the length of the original array are not written.
 * Do the above modifications to the input array in place and do not return
 * anything.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: arr = [1,0,2,3,0,4,5,0]
 * Output: [1,0,0,2,3,0,0,4]
 * Explanation: After calling your function, the input array is modified to:
 * [1,0,0,2,3,0,0,4]
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: arr = [1,2,3]
 * Output: [1,2,3]
 * Explanation: After calling your function, the input array is modified to:
 * [1,2,3]
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= arr.length <= 10^4
 * 0 <= arr[i] <= 9
 * 
 * 
 */

// @lc code=start
class Solution {
    public void duplicateZeros(int[] arr) {
        int count=0;
         for(int i:arr)if(i==0)count++;
        
        int len=arr.length+count-1;
        for(int i=arr.length-1;i>=0 && len>=0;i--){
            if(arr[i]==0){
                if(len>arr.length-1)len--;
                else arr[len--]=0;
                if(len>arr.length-1)len--;
                else arr[len--]=0;
            }else{
                if(len>arr.length-1)len--;
                else arr[len--]=arr[i];
            }
        }
    }
}
// @lc code=end

