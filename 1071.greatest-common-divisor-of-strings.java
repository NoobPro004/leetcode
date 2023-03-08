/*
 * @lc app=leetcode id=1071 lang=java
 *
 * [1071] Greatest Common Divisor of Strings
 *
 * https://leetcode.com/problems/greatest-common-divisor-of-strings/description/
 *
 * algorithms
 * Easy (56.74%)
 * Likes:    3285
 * Dislikes: 500
 * Total Accepted:    160.9K
 * Total Submissions: 284.1K
 * Testcase Example:  '"ABCABC"\n"ABC"'
 *
 * For two strings s and t, we say "t divides s" if and only if s = t + ... + t
 * (i.e., t is concatenated with itself one or more times).
 * 
 * Given two strings str1 and str2, return the largest string x such that x
 * divides both str1 and str2.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: str1 = "ABCABC", str2 = "ABC"
 * Output: "ABC"
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: str1 = "ABABAB", str2 = "ABAB"
 * Output: "AB"
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: str1 = "LEET", str2 = "CODE"
 * Output: ""
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= str1.length, str2.length <= 1000
 * str1 and str2 consist of English uppercase letters.
 * 
 * 
 */

// @lc code=start
class Solution {
    public String gcdOfStrings(String str1, String str2) {
        //         String ans="";
//         for(int i=0;i<Math.min(str1.length(),str2.length());i++){
//             String div=str1.substring(0,i+1);
//             if(isDivide(str1,str2,div))ans=div;
//         }
        
//         return ans;
//     }
    
//     public boolean isDivide(String a,String b,String div){
//         while(a.length()>0){
//             if(a.indexOf(div)!=0)return false;
            
//             a=a.substring(div.length());
//         }
        
//         while(b.length()>0){
//             if(b.indexOf(div)!=0)return false;
            
//             b=b.substring(div.length());
//         }
        
        
//         return true;
        
String ans="";
if(!(str1+str2).equals(str2+str1))return "";

int gc=gcd(str1.length(),str2.length());

return str1.substring(0,gc);
}

public int gcd(int x,int y){
if(x==0)return y;
return gcd(y%x,x);
    }
}
// @lc code=end

