/*
 * @lc app=leetcode id=67 lang=java
 *
 * [67] Add Binary
 *
 * https://leetcode.com/problems/add-binary/description/
 *
 * algorithms
 * Easy (51.53%)
 * Likes:    7670
 * Dislikes: 750
 * Total Accepted:    1.1M
 * Total Submissions: 2.1M
 * Testcase Example:  '"11"\n"1"'
 *
 * Given two binary strings a and b, return their sum as a binary string.
 * 
 * 
 * Example 1:
 * Input: a = "11", b = "1"
 * Output: "100"
 * Example 2:
 * Input: a = "1010", b = "1011"
 * Output: "10101"
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= a.length, b.length <= 10^4
 * a and b consist only of '0' or '1' characters.
 * Each string does not contain leading zeros except for the zero itself.
 * 
 * 
 */

// @lc code=start
class Solution {
    public String addBinary(String a, String b) {
        StringBuilder ans=new StringBuilder();
        int i=a.length()-1;
        int j=b.length()-1;
        int carry=0;
        while(i>=0 || j>=0){
            int x=(i>=0 ? (int)(a.charAt(i)-'0'): 0);
            int y=(j>=0 ? (int)(b.charAt(j)-'0'):0);
            int sum=carry+x+y;
            ans.append(sum%2+"");
            carry=sum/2;
            i--;
            j--;
        }
        
        if(carry>0){
            ans.append(carry+"");
        }
        return ans.reverse().toString();
    }
}
// @lc code=end

