/*
 * @lc app=leetcode id=507 lang=java
 *
 * [507] Perfect Number
 *
 * https://leetcode.com/problems/perfect-number/description/
 *
 * algorithms
 * Easy (37.71%)
 * Likes:    793
 * Dislikes: 1024
 * Total Accepted:    129.3K
 * Total Submissions: 343.4K
 * Testcase Example:  '28'
 *
 * A perfect number is a positive integer that is equal to the sum of its
 * positive divisors, excluding the number itself. A divisor of an integer x is
 * an integer that can divide x evenly.
 * 
 * Given an integer n, return true if n is a perfect number, otherwise return
 * false.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: num = 28
 * Output: true
 * Explanation: 28 = 1 + 2 + 4 + 7 + 14
 * 1, 2, 4, 7, and 14 are all divisors of 28.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: num = 7
 * Output: false
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= num <= 10^8
 * 
 * 
 */

// @lc code=start
class Solution {
    public boolean checkPerfectNumber(int num) {
        //         Set<Integer> set =new HashSet<>();
//          for(int i=1;i*i<=num;i++){
//              if(num%i==0){
//                  set.add(i);
//                  set.add(num/i);
//              }
//          }
        
//         set.remove(num);
//         int ans=0;
//         for(int i:set)ans+=i;
        
//         return ans==num;
        
if (num <= 0) {
    return false;
}
int sum = 0;
for (int i = 1; i * i <= num; i++) {
    if (num % i == 0) {
        sum += i;
        if (i * i != num) {
            sum += num / i;
        }

    }
}
return sum - num == num;5
    }
}
// @lc code=end

