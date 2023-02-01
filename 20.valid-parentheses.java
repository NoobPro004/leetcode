/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */
import java.util.*;
// @lc code=start
class Solution {
    public boolean isValid(String s) {
//         Stack<Character> stack  =new Stack<>();
//          for(Character c :s.toCharArray()){
//             if(c==')'){
//                 if(stack.isEmpty() || stack.peek()!='(')return false;
//                 stack.pop();
//             }else if(c=='}'){
//                 if(stack.isEmpty() || stack.peek()!='{')return false;
// stack.pop();
//             }else if(c==']'){
//                 if(stack.isEmpty() || stack.peek()!='[')return false;
// stack.pop();
//             }else{

//                 stack.push(c);
//             }

//          }


//          return stack.isEmpty();
if(s.length()%2==1)return false;

char[] a= new char[s.length()/2+2];
int start=1;
for(char c: s.toCharArray()){
    if(c=='[' || c=='{'  || c=='('){
        if(start>=a.length)return false;
        c=c=='[' ? ']' : c=='{' ?'}' :')';
        a[start++]=c;
    }else{
        if(start<=1 || a[start-1]!=c)return false;

        start--;
    }
}


return start==1;

    }
}
// @lc code=end

