/*
 * @lc app=leetcode id=303 lang=java
 *
 * [303] Range Sum Query - Immutable
 *
 * https://leetcode.com/problems/range-sum-query-immutable/description/
 *
 * algorithms
 * Easy (58.97%)
 * Likes:    2611
 * Dislikes: 1781
 * Total Accepted:    420.1K
 * Total Submissions: 711.1K
 * Testcase Example:  '["NumArray","sumRange","sumRange","sumRange"]\n' +
  '[[[-2,0,3,-5,2,-1]],[0,2],[2,5],[0,5]]'
 *
 * Given an integer array nums, handle multiple queries of the following
 * type:
 * 
 * 
 * Calculate the sum of the elements of nums between indices left and right
 * inclusive where left <= right.
 * 
 * 
 * Implement the NumArray class:
 * 
 * 
 * NumArray(int[] nums) Initializes the object with the integer array nums.
 * int sumRange(int left, int right) Returns the sum of the elements of nums
 * between indices left and right inclusive (i.e. nums[left] + nums[left + 1] +
 * ... + nums[right]).
 * 
 * 
 * 
 * Example 1:
 * 
 * 
 * Input
 * ["NumArray", "sumRange", "sumRange", "sumRange"]
 * [[[-2, 0, 3, -5, 2, -1]], [0, 2], [2, 5], [0, 5]]
 * Output
 * [null, 1, -1, -3]
 * 
 * Explanation
 * NumArray numArray = new NumArray([-2, 0, 3, -5, 2, -1]);
 * numArray.sumRange(0, 2); // return (-2) + 0 + 3 = 1
 * numArray.sumRange(2, 5); // return 3 + (-5) + 2 + (-1) = -1
 * numArray.sumRange(0, 5); // return (-2) + 0 + 3 + (-5) + 2 + (-1) = -3
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= nums.length <= 10^4
 * -10^5 <= nums[i] <= 10^5
 * 0 <= left <= right < nums.length
 * At most 10^4 calls will be made to sumRange.
 * 
 * 
 */

// @lc code=start
class NumArray {
    int[] seg;
    int total;
    public NumArray(int[] nums) {
        int n = nums.length-1;
        total=nums.length-1;
        seg=new int[4*n+1];
        build(0,0,n,nums);
    }
    
    public int build(int pos,int l,int h,int[] nums){
        if(l>h)return 0;
        if(l==h){
            seg[pos]=nums[l];
            return seg[pos];
        }
        int mid=l+(h-l)/2;
        seg[pos]=build(pos*2+1,l,mid,nums)+build(pos*2+2,mid+1,h,nums);
        
        return seg[pos];
    }
    
    public int getQuery(int pos,int l,int h,int left,int right){
        if(right<l || left>h)return 0;
        
        if(l>=left && right>=h)return seg[pos];
        
        int mid=l+(h-l)/2;
        return getQuery(pos*2+1,l,mid,left,right)+getQuery(pos*2+2,mid+1,h,left,right);
        
    }
    
    public int sumRange(int left, int right) {
        return getQuery(0,0,total,left,right);
    }
}   

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
// @lc code=end

