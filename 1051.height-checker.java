/*
 * @lc app=leetcode id=1051 lang=java
 *
 * [1051] Height Checker
 *
 * https://leetcode.com/problems/height-checker/description/
 *
 * algorithms
 * Easy (75.41%)
 * Likes:    827
 * Dislikes: 63
 * Total Accepted:    258.3K
 * Total Submissions: 342.3K
 * Testcase Example:  '[1,1,4,2,1,3]'
 *
 * A school is trying to take an annual photo of all the students. The students
 * are asked to stand in a single file line in non-decreasing order by height.
 * Let this ordering be represented by the integer array expected where
 * expected[i] is the expected height of the i^th student in line.
 * 
 * You are given an integer array heights representing the current order that
 * the students are standing in. Each heights[i] is the height of the i^th
 * student in line (0-indexed).
 * 
 * Return the number of indices where heights[i] != expected[i].
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: heights = [1,1,4,2,1,3]
 * Output: 3
 * Explanation: 
 * heights:  [1,1,4,2,1,3]
 * expected: [1,1,1,2,3,4]
 * Indices 2, 4, and 5 do not match.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: heights = [5,1,2,3,4]
 * Output: 5
 * Explanation:
 * heights:  [5,1,2,3,4]
 * expected: [1,2,3,4,5]
 * All indices do not match.
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: heights = [1,2,3,4,5]
 * Output: 0
 * Explanation:
 * heights:  [1,2,3,4,5]
 * expected: [1,2,3,4,5]
 * All indices match.
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= heights.length <= 100
 * 1 <= heights[i] <= 100
 * 
 * 
 */

// @lc code=start
class Solution {
    public int heightChecker(int[] heights) {
        final int[] buckets = createBuckets(heights);
        int outOfOrder = 0;
        int nextInBucket = 0;  
        
        for (int i = 0; i < heights.length; i++) {
            nextInBucket = nextValidNumber(buckets, nextInBucket);
            if (heights[i] != nextInBucket)
                outOfOrder++;
            
            buckets[nextInBucket]--;
        }
        
        return outOfOrder;
    }
    
    /*
        Creates the buckets. As an example, if the range was 0 <= num <= 10, and the input was
        [1, 1, 4, 2, 1, 3], then the buckets array would be equal to
        [0, 3, 1, 1, 1, 0, 0, 0, 0, 0, 0], because there are three "1", one "2" and so on.
    */
    private int[] createBuckets(int[] arr) {
        final int[] buckets = new int[101];
        for (int number : arr)
            buckets[number]++;
        
        return buckets;
    }
    
    /*
        Returns the next valid number. For example, if our bucket array is [0, 0, 7, 3, 0, 1], and
        our currentNumber is 0, then it returns 2, since it's the index of the first non-empty bucket.
    */
    private int nextValidNumber(int[] buckets, int currentNumber) {
        while (buckets[currentNumber] == 0)
            currentNumber++;
        
        return currentNumber;
    }
}
// @lc code=end

