/*
 * @lc app=leetcode id=1716 lang=java
 *
 * [1716] Calculate Money in Leetcode Bank
 *
 * https://leetcode.com/problems/calculate-money-in-leetcode-bank/description/
 *
 * algorithms
 * Easy (65.85%)
 * Likes:    545
 * Dislikes: 16
 * Total Accepted:    38.3K
 * Total Submissions: 58K
 * Testcase Example:  '4'
 *
 * Hercy wants to save money for his first car. He puts money in the Leetcode
 * bank every day.
 * 
 * He starts by putting in $1 on Monday, the first day. Every day from Tuesday
 * to Sunday, he will put in $1 more than the day before. On every subsequent
 * Monday, he will put in $1 more than the previous Monday. 
 * 
 * Given n, return the total amount of money he will have in the Leetcode bank
 * at the end of the n^th day.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: n = 4
 * Output: 10
 * Explanation: After the 4^th day, the total is 1 + 2 + 3 + 4 = 10.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: n = 10
 * Output: 37
 * Explanation: After the 10^th day, the total is (1 + 2 + 3 + 4 + 5 + 6 + 7) +
 * (2 + 3 + 4) = 37. Notice that on the 2^nd Monday, Hercy only puts in $2.
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: n = 20
 * Output: 96
 * Explanation: After the 20^th day, the total is (1 + 2 + 3 + 4 + 5 + 6 + 7) +
 * (2 + 3 + 4 + 5 + 6 + 7 + 8) + (3 + 4 + 5 + 6 + 7 + 8) = 96.
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= n <= 1000
 * 
 * 
 */

// @lc code=start
class Solution {
    public int totalMoney(int n) {
        //         int first=0;
//         int last=0;
//         int ans=0;
//         for(int i=0;i<n;i++){
//             if(i%7==0){
//                 ans+=first+1;
//                 first++;
//                 last=first;
//             }else{
//                 ans+=last+1;
//                 last++;
//             }
//         }
        
//         return ans;
int weeks=n/7;
int ans=0;
for(int i=1;i<=weeks;i++){
    ans+=7*(i+3);
}

for(int i=7*weeks;i<n;i++){
    ans+=++weeks;
}

return ans;
    }
}
// @lc code=end

