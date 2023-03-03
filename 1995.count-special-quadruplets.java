/*
 * @lc app=leetcode id=1995 lang=java
 *
 * [1995] Count Special Quadruplets
 *
 * https://leetcode.com/problems/count-special-quadruplets/description/
 *
 * algorithms
 * Easy (59.64%)
 * Likes:    485
 * Dislikes: 187
 * Total Accepted:    29.7K
 * Total Submissions: 49.7K
 * Testcase Example:  '[1,2,3,6]'
 *
 * Given a 0-indexed integer array nums, return the number of distinct
 * quadruplets (a, b, c, d) such that:
 * 
 * 
 * nums[a] + nums[b] + nums[c] == nums[d], and
 * a < b < c < d
 * 
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: nums = [1,2,3,6]
 * Output: 1
 * Explanation: The only quadruplet that satisfies the requirement is (0, 1, 2,
 * 3) because 1 + 2 + 3 == 6.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: nums = [3,3,6,4,5]
 * Output: 0
 * Explanation: There are no such quadruplets in [3,3,6,4,5].
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: nums = [1,1,1,3,5]
 * Output: 4
 * Explanation: The 4 quadruplets that satisfy the requirement are:
 * - (0, 1, 2, 3): 1 + 1 + 1 == 3
 * - (0, 1, 3, 4): 1 + 1 + 3 == 5
 * - (0, 2, 3, 4): 1 + 1 + 3 == 5
 * - (1, 2, 3, 4): 1 + 1 + 3 == 5
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 4 <= nums.length <= 50
 * 1 <= nums[i] <= 100
 * 
 * 
 */

// @lc code=start
class Solution {
    public int countQuadruplets(int[] nums) {
        //         Arrays.sort(nums);
//         int ans=0;
//          for(int i=0;i<nums.length-3;i++){
//              if(i>0 && nums[i]==nums[i-1])continue;
//              for(int j=i+1;j<nums.length-2;j++){
//                  if(nums[j]==nums[j-1])continue;
//                  for(int k=j+1;k<nums.length-1;k++){
//                      if(nums[k]==nums[k-1])continue ;
//                      if(get(nums[i]+nums[j]+nums[k],k+1,nums.length-1,nums))ans++;
//                  }
//              }
//          }
        
//         return ans;
//     }
    
//     public boolean get(int target,int l,int h,int[] nums){
//         while(l<=h){
//             int mid=l+(h-l)/2;
//             if(nums[mid]==target)return true;
            
//             if(nums[mid]<target)l=mid+1;
//             else h=mid-1;
//         }
        
//         return false;
        // Arrays.sort(nums);
        int n=nums.length;
        Map<Integer,Integer> count=  new HashMap<>();
         count.put(nums[n-1]-nums[n-2],1);
        int ans=0;
        for(int i=n-3;i>0;i--){
            for(int j=i-1;j>=0;j--){
                ans+=count.getOrDefault(nums[i]+nums[j],0);
            }
            
            for(int j=n-1;j>i;j--)count.put(nums[j]-nums[i],count.getOrDefault(nums[j]-nums[i],0)+1);
        }
        
        return ans;
    }
}
// @lc code=end

