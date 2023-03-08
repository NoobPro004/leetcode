/*
 * @lc app=leetcode id=492 lang=java
 *
 * [492] Construct the Rectangle
 *
 * https://leetcode.com/problems/construct-the-rectangle/description/
 *
 * algorithms
 * Easy (54.41%)
 * Likes:    559
 * Dislikes: 352
 * Total Accepted:    93.8K
 * Total Submissions: 171.9K
 * Testcase Example:  '4'
 *
 * A web developer needs to know how to design a web page's size. So, given a
 * specific rectangular web page’s area, your job by now is to design a
 * rectangular web page, whose length L and width W satisfy the following
 * requirements:
 * 
 * 
 * The area of the rectangular web page you designed must equal to the given
 * target area.
 * The width W should not be larger than the length L, which means L >= W.
 * The difference between length L and width W should be as small as
 * possible.
 * 
 * 
 * Return an array [L, W] where L and W are the length and width of the web
 * page you designed in sequence.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: area = 4
 * Output: [2,2]
 * Explanation: The target area is 4, and all the possible ways to construct it
 * are [1,4], [2,2], [4,1]. 
 * But according to requirement 2, [1,4] is illegal; according to requirement
 * 3,  [4,1] is not optimal compared to [2,2]. So the length L is 2, and the
 * width W is 2.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: area = 37
 * Output: [37,1]
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: area = 122122
 * Output: [427,286]
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= area <= 10^7
 * 
 * 
 */

// @lc code=start
class Solution {
    public int[] constructRectangle(int area) {
        //         int l=1;
//         int h=area;
//         int[] ans=new int[]{area,1};
//         while(l<=h){
//             int a=l*h;
//             if(a==area){
//                 ans[0]=h;
//                 ans[1]=l;
//                 l++;
//                 h--;
//             }else if(a>area){
//                 h--;
//             }else l++;
//         }
        
//         return ans;
int[] ans=new int[]{area,1};
for(int i=1;i*i<=area;i++){
    if(area%i==0){
        ans[0]=Math.max(i,area/i);
        ans[1]=Math.min(i,area/i);
    }
}

return ans;
    }
}
// @lc code=end

