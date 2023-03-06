/*
 * @lc app=leetcode id=1399 lang=java
 *
 * [1399] Count Largest Group
 *
 * https://leetcode.com/problems/count-largest-group/description/
 *
 * algorithms
 * Easy (67.05%)
 * Likes:    361
 * Dislikes: 811
 * Total Accepted:    37K
 * Total Submissions: 55.3K
 * Testcase Example:  '13'
 *
 * You are given an integer n.
 * 
 * Each number from 1 to n is grouped according to the sum of its digits.
 * 
 * Return the number of groups that have the largest size.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: n = 13
 * Output: 4
 * Explanation: There are 9 groups in total, they are grouped according sum of
 * its digits of numbers from 1 to 13:
 * [1,10], [2,11], [3,12], [4,13], [5], [6], [7], [8], [9].
 * There are 4 groups with largest size.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: n = 2
 * Output: 2
 * Explanation: There are 2 groups [1], [2] of size 1.
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= n <= 10^4
 * 
 * 
 */

// @lc code=start
class Solution {
    public int countLargestGroup(int n) {
        Map<Integer,Integer> map = new HashMap<>();
        Map<Integer,Integer> count=new HashMap<>();
        int max=0;
        int ans=-1;
        for(int i=1;i<=n;i++){
            int sum=get(i,map);
            count.put(sum,count.getOrDefault(sum,0)+1);
            if(count.get(sum)>max){
                max=count.get(sum);
                ans=1;
            }else if(count.get(sum)==max){
                ans++;
            }
        }
        
        return ans;
        
    }
    
    public int get(int x,Map<Integer,Integer> map){
        if(x<=9){
            map.put(x,x);
            return x;
        }
        
        if(map.containsKey(x))return map.get(x);
        int a=x%10+get(x/10,map);
        map.put(x,a);
        return a;
    }
}
// @lc code=end

