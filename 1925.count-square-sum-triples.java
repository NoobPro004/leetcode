/*
 * @lc app=leetcode id=1925 lang=java
 *
 * [1925] Count Square Sum Triples
 *
 * https://leetcode.com/problems/count-square-sum-triples/description/
 *
 * algorithms
 * Easy (68.10%)
 * Likes:    323
 * Dislikes: 28
 * Total Accepted:    31.2K
 * Total Submissions: 45.9K
 * Testcase Example:  '5'
 *
 * A square triple (a,b,c) is a triple where a, b, and c are integers and a^2 +
 * b^2 = c^2.
 * 
 * Given an integer n, return the number of square triples such that 1 <= a, b,
 * c <= n.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: n = 5
 * Output: 2
 * Explanation: The square triples are (3,4,5) and (4,3,5).
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: n = 10
 * Output: 4
 * Explanation: The square triples are (3,4,5), (4,3,5), (6,8,10), and
 * (8,6,10).
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= n <= 250
 * 
 * 
 */

// @lc code=start
class Solution {
    public int countTriples(int n) {
        //         int ans=0;
//           for(int i=1;i<=n;i++){
//               for(int j=1;j<=n;j++){
//                   int rem=i*i+j*j;
//                   int sq=(int)Math.sqrt(rem);
//                   if(sq*sq==rem && sq<=n)ans++;
//               }
//           }
        
//         return ans;
        
int ans=0;
int[] arr=new int[n*n+1];
for(int i=1;i<=n;i++)arr[i*i]=1;

for(int i=1;i<=n;i++){
    for(int j=i;i*i+j*j<=n*n;j++){
        ans+=arr[i*i+j*j]*2;
    }
    
    
}

return ans;
    }
}
// @lc code=end

