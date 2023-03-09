/*
 * @lc app=leetcode id=925 lang=java
 *
 * [925] Long Pressed Name
 *
 * https://leetcode.com/problems/long-pressed-name/description/
 *
 * algorithms
 * Easy (33.32%)
 * Likes:    2097
 * Dislikes: 297
 * Total Accepted:    114.4K
 * Total Submissions: 344.6K
 * Testcase Example:  '"alex"\n"aaleex"'
 *
 * Your friend is typing his name into a keyboard. Sometimes, when typing a
 * character c, the key might get long pressed, and the character will be typed
 * 1 or more times.
 * 
 * You examine the typed characters of the keyboard. Return True if it is
 * possible that it was your friends name, with some characters (possibly none)
 * being long pressed.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: name = "alex", typed = "aaleex"
 * Output: true
 * Explanation: 'a' and 'e' in 'alex' were long pressed.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: name = "saeed", typed = "ssaaedd"
 * Output: false
 * Explanation: 'e' must have been pressed twice, but it was not in the typed
 * output.
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= name.length, typed.length <= 1000
 * name and typed consist of only lowercase English letters.
 * 
 * 
 */

// @lc code=start
class Solution {
    public boolean isLongPressedName(String name, String typed) {
        if(name.length()==0 && typed.length()==0)return true;
        if(name.length()==0 || typed.length()==0)return false;
        
        
        int i=0;
        int j=0;
        while(i<name.length() || j<typed.length()){
            if(name.charAt(i)!=typed.charAt(j))return false;
            int nn=getIndex(name,i)-i;
            int nt=getIndex(typed,j)-j;
            if(nn>nt)return false;
            
            i=nn+i;
            j+=nt;
            if(i>=name.length() && j>=typed.length())return true;
            if(i>=name.length() || j>=typed.length())return false;
            
        }
        
        return true;
    }
    public int getIndex(String s,int start){
        int j=start+1;
        while(j<s.length() &&s.charAt(start)==s.charAt(j)){
            j++;
        }
        
        return j;
    }
}
// @lc code=end

