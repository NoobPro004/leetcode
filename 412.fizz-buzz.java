/*
 * @lc app=leetcode id=412 lang=java
 *
 * [412] Fizz Buzz
 *
 * https://leetcode.com/problems/fizz-buzz/description/
 *
 * algorithms
 * Easy (69.60%)
 * Likes:    1704
 * Dislikes: 246
 * Total Accepted:    910.7K
 * Total Submissions: 1.3M
 * Testcase Example:  '3'
 *
 * Given an integer n, return a string array answer (1-indexed) where:
 * 
 * 
 * answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
 * answer[i] == "Fizz" if i is divisible by 3.
 * answer[i] == "Buzz" if i is divisible by 5.
 * answer[i] == i (as a string) if none of the above conditions are true.
 * 
 * 
 * 
 * Example 1:
 * Input: n = 3
 * Output: ["1","2","Fizz"]
 * Example 2:
 * Input: n = 5
 * Output: ["1","2","Fizz","4","Buzz"]
 * Example 3:
 * Input: n = 15
 * Output:
 * ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]
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
    public List<String> fizzBuzz(int n) {
        //         List<String> ans=  new ArrayList<>();
//         for(int i=1;i<=n;i++){
//             ans.add(get(i));
//         }
        
//         return ans;
//     }
    
//     public String get(int n){
//         if(n%3==0 && n%5==0)return "FizzBuzz";
//         if(n%3==0)return "Fizz";
//         if(n%5==0)return "Buzz";
//         return n+"";
        
List<String> ret = new ArrayList<String>(n);
for(int i=1,fizz=0,buzz=0;i<=n ;i++){
    fizz++;
    buzz++;
    if(fizz==3 && buzz==5){
        ret.add("FizzBuzz");
        fizz=0;
        buzz=0;
    }else if(fizz==3){
        ret.add("Fizz");
        fizz=0;
    }else if(buzz==5){
        ret.add("Buzz");
        buzz=0;
    }else{
        ret.add(String.valueOf(i));
    }
} 
return ret;
    }
}
// @lc code=end

