/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */
import java.util.*;
// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)return false;
        int a=0;
        int t=x;
        while(t>0){
            a=a*10+t%10;
            t/=10;
        }
        
        return a==x;
    }
}
// @lc code=end

