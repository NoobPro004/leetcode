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

        int curr=0;
        int n=x;
        while(n>0){
            curr=curr*10+n%10;
            n/=10;
        }

        return curr==x;
    }
}
// @lc code=end

