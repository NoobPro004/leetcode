/*
 * @lc app=leetcode id=1175 lang=java
 *
 * [1175] Prime Arrangements
 *
 * https://leetcode.com/problems/prime-arrangements/description/
 *
 * algorithms
 * Easy (54.24%)
 * Likes:    337
 * Dislikes: 447
 * Total Accepted:    24.7K
 * Total Submissions: 45.3K
 * Testcase Example:  '5'
 *
 * Return the number of permutations of 1 to n so that prime numbers are at
 * prime indices (1-indexed.)
 * 
 * (Recall that an integer is prime if and only if it is greater than 1, and
 * cannot be written as a product of two positive integers both smaller than
 * it.)
 * 
 * Since the answer may be large, return the answer modulo 10^9 + 7.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: n = 5
 * Output: 12
 * Explanation: For example [1,2,5,4,3] is a valid permutation, but [5,2,3,4,1]
 * is not because the prime number 5 is at index 1.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: n = 100
 * Output: 682289015
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= n <= 100
 * 
 * 
 */

// @lc code=start
class Solution {
    public int numPrimeArrangements(int n) {
        int mod=1000000007;
    public int numPrimeArrangements(int n) {
        int p=countPrime(n);
        int np=n-p;
        long ans=(fact(p)%mod*fact(np)%mod)%mod;
        
        
        return (int)(ans%mod);
    }
    
    public int countPrime(int n){
        boolean[] p=new boolean[n+1];
        Arrays.fill(p,true);
        p[0]=p[1]=false;
        for(int i=2;i*i
<=n;i++){
            if(p[i]){
                for(int j=2;i*j<=n;j++){
                    p[i*j]=false;
                }
            }
        }
        
        int ans=0;
        for(int i=0;i<=n;i++)if(p[i])ans++;
        
        
        return ans;
    }
    
    public long fact(int n){
        if(n==0)return 1;
        
        return (n*fact(n-1))%mod;
    }
}
// @lc code=end

