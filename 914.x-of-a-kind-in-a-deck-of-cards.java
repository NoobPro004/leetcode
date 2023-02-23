/*
 * @lc app=leetcode id=914 lang=java
 *
 * [914] X of a Kind in a Deck of Cards
 *
 * https://leetcode.com/problems/x-of-a-kind-in-a-deck-of-cards/description/
 *
 * algorithms
 * Easy (31.49%)
 * Likes:    1568
 * Dislikes: 386
 * Total Accepted:    101.8K
 * Total Submissions: 324K
 * Testcase Example:  '[1,2,3,4,4,3,2,1]'
 *
 * You are given an integer array deck where deck[i] represents the number
 * written on the i^th card.
 * 
 * Partition the cards into one or more groups such that:
 * 
 * 
 * Each group has exactly x cards where x > 1, and
 * All the cards in one group have the same integer written on them.
 * 
 * 
 * Return true if such partition is possible, or false otherwise.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: deck = [1,2,3,4,4,3,2,1]
 * Output: true
 * Explanation: Possible partition [1,1],[2,2],[3,3],[4,4].
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: deck = [1,1,1,2,2,2,3,3]
 * Output: false
 * Explanation: No possible partition.
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= deck.length <= 10^4
 * 0 <= deck[i] < 10^4
 * 
 * 
 */

// @lc code=start
class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:deck)map.put(i,map.getOrDefault(i,0)+1);
        
        int gc=map.get(deck[0]);
        for(int i:map.keySet()){
            gc=gcd(gc,map.get(i));
        }
        
        return gc>1;
    }
    
    public int gcd(int x,int y){
        if(x==0)return y;
        
        return gcd(y%x,x);
    }
}
// @lc code=end

