/*
 * @lc app=leetcode id=1636 lang=java
 *
 * [1636] Sort Array by Increasing Frequency
 *
 * https://leetcode.com/problems/sort-array-by-increasing-frequency/description/
 *
 * algorithms
 * Easy (69.28%)
 * Likes:    2223
 * Dislikes: 85
 * Total Accepted:    90.3K
 * Total Submissions: 130.2K
 * Testcase Example:  '[1,1,2,2,2,3]'
 *
 * Given an array of integers nums, sort the array in increasing order based on
 * the frequency of the values. If multiple values have the same frequency,
 * sort them in decreasing order.
 * 
 * Return the sorted array.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: nums = [1,1,2,2,2,3]
 * Output: [3,1,1,2,2,2]
 * Explanation: '3' has a frequency of 1, '1' has a frequency of 2, and '2' has
 * a frequency of 3.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: nums = [2,3,1,3,2]
 * Output: [1,3,3,2,2]
 * Explanation: '2' and '3' both have a frequency of 2, so they are sorted in
 * decreasing order.
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: nums = [-1,1,-6,4,5,-6,1,4,1]
 * Output: [5,-1,4,4,-6,-6,1,1,1]
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= nums.length <= 100
 * -100 <= nums[i] <= 100
 * 
 * 
 */

// @lc code=start
class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
         for(int i:nums)map.put(i,map.getOrDefault(i,0)+1);
        Comparator<Integer> cmp = new Comparator<Integer>(){
          public int compare(Integer a,Integer b){
              if(map.get(a)==map.get(b))return b-a;
            return map.get(a)-map.get(b);
          }  
        };
        Integer[] arr=new Integer[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
        }
        Arrays.sort(arr,cmp);
        for(int i=0;i<nums.length;i++){
            nums[i]=arr[i];
        }
        return nums;
    }
}
// @lc code=end

