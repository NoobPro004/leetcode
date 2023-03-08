/*
 * @lc app=leetcode id=1518 lang=java
 *
 * [1518] Water Bottles
 *
 * https://leetcode.com/problems/water-bottles/description/
 *
 * algorithms
 * Easy (60.43%)
 * Likes:    843
 * Dislikes: 67
 * Total Accepted:    60.7K
 * Total Submissions: 100.4K
 * Testcase Example:  '9\n3'
 *
 * There are numBottles water bottles that are initially full of water. You can
 * exchange numExchange empty water bottles from the market with one full water
 * bottle.
 * 
 * The operation of drinking a full water bottle turns it into an empty
 * bottle.
 * 
 * Given the two integers numBottles and numExchange, return the maximum number
 * of water bottles you can drink.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: numBottles = 9, numExchange = 3
 * Output: 13
 * Explanation: You can exchange 3 empty bottles to get 1 full water bottle.
 * Number of water bottles you can drink: 9 + 3 + 1 = 13.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: numBottles = 15, numExchange = 4
 * Output: 19
 * Explanation: You can exchange 4 empty bottles to get 1 full water bottle. 
 * Number of water bottles you can drink: 15 + 3 + 1 = 19.
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= numBottles <= 100
 * 2 <= numExchange <= 100
 * 
 * 
 */

// @lc code=start
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        //         int ans=numBottles;
//         int empty=numBottles;
//         while(empty>=numExchange){
//             int temp=empty/numExchange;
//             ans+=temp;
//             empty-=temp*numExchange;
//             empty+=temp;
//         }
        
//         return ans;
        
return numBottles + (numBottles-1)/(numExchange-1);
    }
}
// @lc code=end

