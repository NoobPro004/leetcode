/*
 * @lc app=leetcode id=1337 lang=java
 *
 * [1337] The K Weakest Rows in a Matrix
 *
 * https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/description/
 *
 * algorithms
 * Easy (72.19%)
 * Likes:    3110
 * Dislikes: 187
 * Total Accepted:    234.2K
 * Total Submissions: 324.6K
 * Testcase Example:  '[[1,1,0,0,0],[1,1,1,1,0],[1,0,0,0,0],[1,1,0,0,0],[1,1,1,1,1]]\n3'
 *
 * You are given an m x n binary matrix mat of 1's (representing soldiers) and
 * 0's (representing civilians). The soldiers are positioned in front of the
 * civilians. That is, all the 1's will appear to the left of all the 0's in
 * each row.
 * 
 * A row i is weaker than a row j if one of the following is true:
 * 
 * 
 * The number of soldiers in row i is less than the number of soldiers in row
 * j.
 * Both rows have the same number of soldiers and i < j.
 * 
 * 
 * Return the indices of the k weakest rows in the matrix ordered from weakest
 * to strongest.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: mat = 
 * [[1,1,0,0,0],
 * ⁠[1,1,1,1,0],
 * ⁠[1,0,0,0,0],
 * ⁠[1,1,0,0,0],
 * ⁠[1,1,1,1,1]], 
 * k = 3
 * Output: [2,0,3]
 * Explanation: 
 * The number of soldiers in each row is: 
 * - Row 0: 2 
 * - Row 1: 4 
 * - Row 2: 1 
 * - Row 3: 2 
 * - Row 4: 5 
 * The rows ordered from weakest to strongest are [2,0,3,1,4].
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: mat = 
 * [[1,0,0,0],
 * ⁠[1,1,1,1],
 * ⁠[1,0,0,0],
 * ⁠[1,0,0,0]], 
 * k = 2
 * Output: [0,2]
 * Explanation: 
 * The number of soldiers in each row is: 
 * - Row 0: 1 
 * - Row 1: 4 
 * - Row 2: 1 
 * - Row 3: 1 
 * The rows ordered from weakest to strongest are [0,2,3,1].
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * m == mat.length
 * n == mat[i].length
 * 2 <= n, m <= 100
 * 1 <= k <= m
 * matrix[i][j] is either 0 or 1.
 * 
 * 
 */

// @lc code=start
class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        Comparator<int[]> cmp = new Comparator<>(){
            public int compare(int[] a, int[] b){
                if(a[1]==b[1]){
                    return b[0]-a[0];
                }
                return b[1]-a[1];
            }
        };
        
        PriorityQueue<int[]> pq = new PriorityQueue<>(cmp);
        for(int i=0;i<mat.length;i++){
            int sol=getSol(mat[i]);
            pq.add(new int[]{i,sol});
            if(pq.size()>k)pq.poll();
        }
        
        int[] ans=new int[k];
        for(int i=0;i<k;i++)ans[k-i-1]=pq.poll()[0];
        
        return ans;
    }
    
    public int getSol(int[] a){
        int l=0;
        int h=a.length-1;
        int ans=-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(a[mid]==0){
                h=mid-1;
            }else{
                ans=mid;
                l=mid+1;
            }
        }
        
        return ans+1;
    }
}
// @lc code=end

