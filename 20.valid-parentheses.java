/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */
import java.util.*;
// @lc code=start
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack  =new Stack<>();
         for(Character c :s.toCharArray()){
            if(c==')'){
                if(stack.isEmpty() || stack.peek()!='(')return false;
                stack.pop();
            }else if(c=='}'){
                if(stack.isEmpty() || stack.peek()!='{')return false;
stack.pop();
            }else if(c==']'){
                if(stack.isEmpty() || stack.peek()!='[')return false;
stack.pop();
            }else{

                stack.push(c);
            }

         }


         return stack.isEmpty();
    }
}
// @lc code=end

