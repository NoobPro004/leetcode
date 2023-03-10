/*
 * @lc app=leetcode id=2299 lang=java
 *
 * [2299] Strong Password Checker II
 *
 * https://leetcode.com/problems/strong-password-checker-ii/description/
 *
 * algorithms
 * Easy (56.37%)
 * Likes:    260
 * Dislikes: 33
 * Total Accepted:    29.7K
 * Total Submissions: 52.7K
 * Testcase Example:  '"IloveLe3tcode!"'
 *
 * A password is said to be strong if it satisfies all the following
 * criteria:
 * 
 * 
 * It has at least 8 characters.
 * It contains at least one lowercase letter.
 * It contains at least one uppercase letter.
 * It contains at least one digit.
 * It contains at least one special character. The special characters are the
 * characters in the following string: "!@#$%^&*()-+".
 * It does not contain 2 of the same character in adjacent positions (i.e.,
 * "aab" violates this condition, but "aba" does not).
 * 
 * 
 * Given a string password, return true if it is a strong password. Otherwise,
 * return false.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: password = "IloveLe3tcode!"
 * Output: true
 * Explanation: The password meets all the requirements. Therefore, we return
 * true.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: password = "Me+You--IsMyDream"
 * Output: false
 * Explanation: The password does not contain a digit and also contains 2 of
 * the same character in adjacent positions. Therefore, we return false.
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: password = "1aB!"
 * Output: false
 * Explanation: The password does not meet the length requirement. Therefore,
 * we return false.
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= password.length <= 100
 * password consists of letters, digits, and special characters:
 * "!@#$%^&*()-+".
 * 
 * 
 */

// @lc code=start
class Solution {
    public boolean strongPasswordCheckerII(String password) {
        int countChar=0;
        int countDig=0;
        boolean low=false;
        boolean upper=false;
        boolean spc=false;
        
        for(int i=0;i<password.length();i++){
            char c=password.charAt(i);
            if(i>0 && password.charAt(i)==password.charAt(i-1))return false;
            
            if(Character.isDigit(c)){
                countDig++;
            }else if(Character.isLetter(c)){
                if(Character.isLowerCase(c))low=true;
                else if(Character.isUpperCase(c))upper=true;
                
                countChar++;
            }else{
                spc=true;
            }
        }
        
        return password.length()>=8 && low && upper && spc && countDig>=1;
    }
}
// @lc code=end

