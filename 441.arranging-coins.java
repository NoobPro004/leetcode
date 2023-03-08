/*
 * @lc app=leetcode id=441 lang=java
 *
 * [441] Arranging Coins
 *
 * https://leetcode.com/problems/arranging-coins/description/
 *
 * algorithms
 * Easy (46.23%)
 * Likes:    3103
 * Dislikes: 1187
 * Total Accepted:    344.3K
 * Total Submissions: 744.9K
 * Testcase Example:  '5'
 *
 * You have n coins and you want to build a staircase with these coins. The
 * staircase consists of k rows where the i^th row has exactly i coins. The
 * last row of the staircase may be incomplete.
 * 
 * Given the integer n, return the number of complete rows of the staircase you
 * will build.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: n = 5
 * Output: 2
 * Explanation: Because the 3^rd row is incomplete, we return 2.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: n = 8
 * Output: 3
 * Explanation: Because the 4^th row is incomplete, we return 3.
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= n <= 2^31 - 1
 * 
 * 
 */

// @lc code=start
class Solution {
    public int arrangeCoins(int n) {
        //         int ans=0;
//         int i=1;
//         while(i<=n){
//             ans++;
//             n-=i++;
//         }
        
//         return ans;
        
long l=1;
long h=n;
int ans=-1;
while(l<=h){
    long mid=l+(h-l)/2;
    long sum=mid*(mid+1)/2;
    if(sum==n)return (int)mid;
    else if(sum<n)l=mid+1;
    else{
        h=mid-1;
        ans=(int)mid;
    }
}

return ans-1;
    }
}
// @lc code=end

