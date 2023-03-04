/*
 * @lc app=leetcode id=2089 lang=java
 *
 * [2089] Find Target Indices After Sorting Array
 *
 * https://leetcode.com/problems/find-target-indices-after-sorting-array/description/
 *
 * algorithms
 * Easy (76.61%)
 * Likes:    1288
 * Dislikes: 58
 * Total Accepted:    107.4K
 * Total Submissions: 140.3K
 * Testcase Example:  '[1,2,5,2,3]\n2'
 *
 * You are given a 0-indexed integer array nums and a target element target.
 * 
 * A target index is an index i such that nums[i] == target.
 * 
 * Return a list of the target indices of nums after sorting nums in
 * non-decreasing order. If there are no target indices, return an empty list.
 * The returned list must be sorted in increasing order.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: nums = [1,2,5,2,3], target = 2
 * Output: [1,2]
 * Explanation: After sorting, nums is [1,2,2,3,5].
 * The indices where nums[i] == 2 are 1 and 2.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: nums = [1,2,5,2,3], target = 3
 * Output: [3]
 * Explanation: After sorting, nums is [1,2,2,3,5].
 * The index where nums[i] == 3 is 3.
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: nums = [1,2,5,2,3], target = 5
 * Output: [4]
 * Explanation: After sorting, nums is [1,2,2,3,5].
 * The index where nums[i] == 5 is 4.
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= nums.length <= 100
 * 1 <= nums[i], target <= 100
 * 
 * 
 */

// @lc code=start
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> ans=  new ArrayList<>();
        int l=getIndex(nums,target,true);
        if(l==-1)return ans;
        int h=getIndex(nums,target,false);
        for(int i=l;i<=h;i++)ans.add(i);
        
        return ans;
    }
    
    public int getIndex(int[] nums,int target,boolean left){
        int l=0;
        int h=nums.length-1;
        int ans=-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(nums[mid]==target){
                ans=mid;
                if(left)h=mid-1;
                else l=mid+1;
            }else if(nums[mid]<target){
                l=mid+1;
            }else{
                h=mid-1;
            }
        }
        
        return ans;
    }
}
// @lc code=end

