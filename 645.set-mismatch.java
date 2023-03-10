/*
 * @lc app=leetcode id=645 lang=java
 *
 * [645] Set Mismatch
 *
 * https://leetcode.com/problems/set-mismatch/description/
 *
 * algorithms
 * Easy (42.85%)
 * Likes:    3490
 * Dislikes: 805
 * Total Accepted:    260.5K
 * Total Submissions: 608.4K
 * Testcase Example:  '[1,2,2,4]'
 *
 * You have a set of integers s, which originally contains all the numbers from
 * 1 to n. Unfortunately, due to some error, one of the numbers in s got
 * duplicated to another number in the set, which results in repetition of one
 * number and loss of another number.
 * 
 * You are given an integer array nums representing the data status of this set
 * after the error.
 * 
 * Find the number that occurs twice and the number that is missing and return
 * them in the form of an array.
 * 
 * 
 * Example 1:
 * Input: nums = [1,2,2,4]
 * Output: [2,3]
 * Example 2:
 * Input: nums = [1,1]
 * Output: [1,2]
 * 
 * 
 * Constraints:
 * 
 * 
 * 2 <= nums.length <= 10^4
 * 1 <= nums[i] <= 10^4
 * 
 * 
 */

// @lc code=start
class Solution {
    public int[] findErrorNums(int[] nums) {
        //         int[] ans = new int[2];
//         for(int i:nums){
//             int abs=Math.abs(i);
//             if(nums[abs-1]<0){
//                 ans[0]=abs;
//             }else{
//                 nums[abs-1]=-nums[abs-1];
//             }
//         }
        
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]>0)ans[1]=i+1;
//         }
        
//         return ans;
        
        int xor=0;
        for(int i=0;i<nums.length;i++){
            xor^=(i+1)^nums[i];
        }
        int mask=1;
        while((mask & xor)==0){
        mask<<=1;
        }

        int xor1=0;
        for(int i:nums){
        if((i & mask) != 0){
            xor1^=i;
        }
        }

        for(int i=1;i<=nums.length;i++){
        if((i & mask) != 0){
            xor1^=i;
        }
        }
        for(int i:nums){
        if(i==xor1)return new int[]{xor1,xor1^xor};
        }
        return new int[]{xor1^xor,xor1};
    }
}
// @lc code=end

