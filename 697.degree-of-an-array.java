/*
 * @lc app=leetcode id=697 lang=java
 *
 * [697] Degree of an Array
 *
 * https://leetcode.com/problems/degree-of-an-array/description/
 *
 * algorithms
 * Easy (55.95%)
 * Likes:    2571
 * Dislikes: 1508
 * Total Accepted:    176K
 * Total Submissions: 314.6K
 * Testcase Example:  '[1,2,2,3,1]'
 *
 * Given a non-empty array of non-negative integers nums, the degree of this
 * array is defined as the maximum frequency of any one of its elements.
 * 
 * Your task is to find the smallest possible length of a (contiguous) subarray
 * of nums, that has the same degree as nums.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: nums = [1,2,2,3,1]
 * Output: 2
 * Explanation: 
 * The input array has a degree of 2 because both elements 1 and 2 appear
 * twice.
 * Of the subarrays that have the same degree:
 * [1, 2, 2, 3, 1], [1, 2, 2, 3], [2, 2, 3, 1], [1, 2, 2], [2, 2, 3], [2, 2]
 * The shortest length is 2. So return 2.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: nums = [1,2,2,3,1,4,2]
 * Output: 6
 * Explanation: 
 * The degree is 3 because the element 2 is repeated 3 times.
 * So [2,2,3,1,4,2] is the shortest subarray, therefore returning 6.
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * nums.length will be between 1 and 50,000.
 * nums[i] will be an integer between 0 and 49,999.
 * 
 * 
 */

// @lc code=start
class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer,int[]> map = new HashMap<>();
         for(int i=0;i<nums.length;i++){
             if(!map.containsKey(nums[i])){
                 map.put(nums[i],new int[]{i,1});
             }else{
                 int[] a=map.get(nums[i]);
                 a[1]++;
                 map.put(nums[i],a);
             }
             
             if(map.get(nums[i])[1]>max){
                 ans=i-map.get(nums[i])[0]+1;
                 max=map.get(nums[i])[1];
             }else if(map.get(nums[i])[1]==max){
                 ans=Math.min(ans,i-map.get(nums[i])[0]+1);
             }
         }
        
        return ans;
    }
}
// @lc code=end

