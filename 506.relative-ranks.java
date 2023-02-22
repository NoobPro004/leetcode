/*
 * @lc app=leetcode id=506 lang=java
 *
 * [506] Relative Ranks
 *
 * https://leetcode.com/problems/relative-ranks/description/
 *
 * algorithms
 * Easy (60.00%)
 * Likes:    929
 * Dislikes: 46
 * Total Accepted:    117K
 * Total Submissions: 194.7K
 * Testcase Example:  '[5,4,3,2,1]'
 *
 * You are given an integer array score of size n, where score[i] is the score
 * of the i^th athlete in a competition. All the scores are guaranteed to be
 * unique.
 * 
 * The athletes are placed based on their scores, where the 1^st place athlete
 * has the highest score, the 2^nd place athlete has the 2^nd highest score,
 * and so on. The placement of each athlete determines their rank:
 * 
 * 
 * The 1^st place athlete's rank is "Gold Medal".
 * The 2^nd place athlete's rank is "Silver Medal".
 * The 3^rd place athlete's rank is "Bronze Medal".
 * For the 4^th place to the n^th place athlete, their rank is their placement
 * number (i.e., the x^th place athlete's rank is "x").
 * 
 * 
 * Return an array answer of size n where answer[i] is the rank of the i^th
 * athlete.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: score = [5,4,3,2,1]
 * Output: ["Gold Medal","Silver Medal","Bronze Medal","4","5"]
 * Explanation: The placements are [1^st, 2^nd, 3^rd, 4^th, 5^th].
 * 
 * Example 2:
 * 
 * 
 * Input: score = [10,3,8,9,4]
 * Output: ["Gold Medal","5","Bronze Medal","Silver Medal","4"]
 * Explanation: The placements are [1^st, 5^th, 3^rd, 2^nd, 4^th].
 * 
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * n == score.length
 * 1 <= n <= 10^4
 * 0 <= score[i] <= 10^6
 * All the values in score are unique.
 * 
 * 
 */

// @lc code=start
class Solution {
    public String[] findRelativeRanks(int[] score) {
        int count=4;
        String[] ans=new String[score.length];
        String[] arr = new String[]{"Gold Medal","Silver Medal","Bronze Medal"};
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<score.length;i++){
            map.put(score[i],i);
        }
        Arrays.sort(score);
        int index=0;
         for(int i=score.length-1;i>=0;i--){
             if(index<arr.length){
                 ans[map.get(score[i])]=arr[index++];
                 
             }else{
                 ans[map.get(score[i])]=count++ + "";
             }
         }
        return ans;
    }
}
// @lc code=end

