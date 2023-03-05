/*
 * @lc app=leetcode id=2418 lang=java
 *
 * [2418] Sort the People
 *
 * https://leetcode.com/problems/sort-the-people/description/
 *
 * algorithms
 * Easy (81.33%)
 * Likes:    731
 * Dislikes: 10
 * Total Accepted:    64K
 * Total Submissions: 78.9K
 * Testcase Example:  '["Mary","John","Emma"]\n[180,165,170]'
 *
 * You are given an array of strings names, and an array heights that consists
 * of distinct positive integers. Both arrays are of length n.
 * 
 * For each index i, names[i] and heights[i] denote the name and height of the
 * i^th person.
 * 
 * Return names sorted in descending order by the people's heights.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: names = ["Mary","John","Emma"], heights = [180,165,170]
 * Output: ["Mary","Emma","John"]
 * Explanation: Mary is the tallest, followed by Emma and John.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: names = ["Alice","Bob","Bob"], heights = [155,185,150]
 * Output: ["Bob","Alice","Bob"]
 * Explanation: The first Bob is the tallest, followed by Alice and the second
 * Bob.
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * n == names.length == heights.length
 * 1 <= n <= 10^3
 * 1 <= names[i].length <= 20
 * 1 <= heights[i] <= 10^5
 * names[i] consists of lower and upper case English letters.
 * All the values of heights are distinct.
 * 
 * 
 */

// @lc code=start
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer,String> map = new HashMap<>();
        for(int i=0;i<heights.length;i++){
            map.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        for(int i=heights.length-1;i>=0;i--){
            names[names.length-1-i]=map.get(heights[i]);
        }
        
        return names;
    }
}
// @lc code=end

