/*
 * @lc app=leetcode id=605 lang=java
 *
 * [605] Can Place Flowers
 *
 * https://leetcode.com/problems/can-place-flowers/description/
 *
 * algorithms
 * Easy (32.59%)
 * Likes:    3538
 * Dislikes: 717
 * Total Accepted:    345K
 * Total Submissions: 1.1M
 * Testcase Example:  '[1,0,0,0,1]\n1'
 *
 * You have a long flowerbed in which some of the plots are planted, and some
 * are not. However, flowers cannot be planted in adjacent plots.
 * 
 * Given an integer array flowerbed containing 0's and 1's, where 0 means empty
 * and 1 means not empty, and an integer n, return if n new flowers can be
 * planted in the flowerbed without violating the no-adjacent-flowers rule.
 * 
 * 
 * Example 1:
 * Input: flowerbed = [1,0,0,0,1], n = 1
 * Output: true
 * Example 2:
 * Input: flowerbed = [1,0,0,0,1], n = 2
 * Output: false
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= flowerbed.length <= 2 * 10^4
 * flowerbed[i] is 0 or 1.
 * There are no two adjacent flowers in flowerbed.
 * 0 <= n <= flowerbed.length
 * 
 * 
 */

// @lc code=start
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n==0)return true;
        if(flowerbed.length==0 & n>0)return false;
        
        
        if(flowerbed.length==1 && n==1)return flowerbed[0]==0;
        if(flowerbed.length==0 && n>1)return false;
        
        if(flowerbed[0]==0 && flowerbed[1]==0){
            n--;
            flowerbed[0]=1;
        }
        
        if(flowerbed[flowerbed.length-1]==0 && flowerbed[flowerbed.length-2]==0){
            flowerbed[flowerbed.length-1]=1;
            n--;
        }
        
        for(int i=1;i<flowerbed.length-1;i++){
            if(flowerbed[i]==0 && flowerbed[i-1]==0 && flowerbed[i+1]==0){
                n--;
                flowerbed[i]=1;
            }
        }
        
        return n<=0;
    }
}
// @lc code=end

