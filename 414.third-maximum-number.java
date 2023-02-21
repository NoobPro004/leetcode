/*
 * @lc app=leetcode id=414 lang=java
 *
 * [414] Third Maximum Number
 *
 * https://leetcode.com/problems/third-maximum-number/description/
 *
 * algorithms
 * Easy (32.96%)
 * Likes:    2322
 * Dislikes: 2710
 * Total Accepted:    410.1K
 * Total Submissions: 1.2M
 * Testcase Example:  '[3,2,1]'
 *
 * Given an integer array nums, return the third distinct maximum number in
 * this array. If the third maximum does not exist, return the maximum
 * number.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: nums = [3,2,1]
 * Output: 1
 * Explanation:
 * The first distinct maximum is 3.
 * The second distinct maximum is 2.
 * The third distinct maximum is 1.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: nums = [1,2]
 * Output: 2
 * Explanation:
 * The first distinct maximum is 2.
 * The second distinct maximum is 1.
 * The third distinct maximum does not exist, so the maximum (2) is returned
 * instead.
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: nums = [2,2,3,1]
 * Output: 1
 * Explanation:
 * The first distinct maximum is 3.
 * The second distinct maximum is 2 (both 2's are counted together since they
 * have the same value).
 * The third distinct maximum is 1.
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= nums.length <= 10^4
 * -2^31 <= nums[i] <= 2^31 - 1
 * 
 * 
 * 
 * Follow up: Can you find an O(n) solution?
 */

// @lc code=start
class Solution {
    public int thirdMax(int[] nums) {
//         int f=Integer.MIN_VALUE;
//         int s=Integer.MIN_VALUE;
//         int t=Integer.MIN_VALUE;
//         boolean finds=false;
//         boolean findt=false;
//         for(int i:nums){
//             if(i>f){
//                 if(finds){
//                     findt=true;
//                 }
//                 if(f!=Integer.MIN_VALUE){
//                     finds=true;
//                 }
//                     t=s;
//                 s=f;
//                 f=i;
//             }else if(i>s && i!=f){
//                 if(finds){
//                     findt=true;
//                 }
//                 if(s!=Integer.MIN_VALUE){
//                     findt=true;
//                 }
//                 t=s;
//                 s=i;
//             }else if(i>t && i!=s && i!=f){
//                 findt=true;
//                 t=i;
//             }
//         }
        
//         System.out.println(finds);
//         System.out.println(findt);
//         if(!findt)return f;
        
//         return t;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int max=Integer.MIN_VALUE;
         for(int i:nums){
             if(pq.contains(i)){
                 continue;
             }
             if(pq.size()<3){
                 pq.add(i);
                 max=Math.max(max,i);
             }else{
                 max=Math.max(max,i);
                 pq.add(i);
                 pq.poll();
             }
         }
        
        return pq.size() <=2 ? max :pq.poll();
    }
}
// @lc code=end

