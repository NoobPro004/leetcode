/*
 * @lc app=leetcode id=1365 lang=java
 *
 * [1365] How Many Numbers Are Smaller Than the Current Number
 *
 * https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/description/
 *
 * algorithms
 * Easy (86.70%)
 * Likes:    4421
 * Dislikes: 90
 * Total Accepted:    408.6K
 * Total Submissions: 471.4K
 * Testcase Example:  '[8,1,2,2,3]'
 *
 * Given the array nums, for each nums[i] find out how many numbers in the
 * array are smaller than it. That is, for each nums[i] you have to count the
 * number of valid j's such that j != i and nums[j] < nums[i].
 * 
 * Return the answer in an array.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: nums = [8,1,2,2,3]
 * Output: [4,0,1,1,3]
 * Explanation: 
 * For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3). 
 * For nums[1]=1 does not exist any smaller number than it.
 * For nums[2]=2 there exist one smaller number than it (1). 
 * For nums[3]=2 there exist one smaller number than it (1). 
 * For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: nums = [6,5,4,8]
 * Output: [2,1,0,3]
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: nums = [7,7,7,7]
 * Output: [0,0,0,0]
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 2 <= nums.length <= 500
 * 0 <= nums[i] <= 100
 * 
 * 
 */

// @lc code=start
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] count= new int[101];
        for(int i:nums){
            count[i]++;
        }
        for(int i=1;i<count.length;i++)count[i]+=count[i-1];
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                nums[i]=count[nums[i]-1];
            }else{
                nums[i]=0;
            }
        }
        
        return nums;
    }
}
// @lc code=end

