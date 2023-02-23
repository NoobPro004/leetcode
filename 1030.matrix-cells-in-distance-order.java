/*
 * @lc app=leetcode id=1030 lang=java
 *
 * [1030] Matrix Cells in Distance Order
 *
 * https://leetcode.com/problems/matrix-cells-in-distance-order/description/
 *
 * algorithms
 * Easy (69.55%)
 * Likes:    612
 * Dislikes: 271
 * Total Accepted:    48.8K
 * Total Submissions: 70.2K
 * Testcase Example:  '1\n2\n0\n0'
 *
 * You are given four integers row, cols, rCenter, and cCenter. There is a rows
 * x cols matrix and you are on the cell with the coordinates (rCenter,
 * cCenter).
 * 
 * Return the coordinates of all cells in the matrix, sorted by their distance
 * from (rCenter, cCenter) from the smallest distance to the largest distance.
 * You may return the answer in any order that satisfies this condition.
 * 
 * The distance between two cells (r1, c1) and (r2, c2) is |r1 - r2| + |c1 -
 * c2|.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: rows = 1, cols = 2, rCenter = 0, cCenter = 0
 * Output: [[0,0],[0,1]]
 * Explanation: The distances from (0, 0) to other cells are: [0,1]
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: rows = 2, cols = 2, rCenter = 0, cCenter = 1
 * Output: [[0,1],[0,0],[1,1],[1,0]]
 * Explanation: The distances from (0, 1) to other cells are: [0,1,1,2]
 * The answer [[0,1],[1,1],[0,0],[1,0]] would also be accepted as correct.
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: rows = 2, cols = 3, rCenter = 1, cCenter = 2
 * Output: [[1,2],[0,2],[1,1],[0,1],[1,0],[0,0]]
 * Explanation: The distances from (1, 2) to other cells are: [0,1,1,2,2,3]
 * There are other answers that would also be accepted as correct, such as
 * [[1,2],[1,1],[0,2],[1,0],[0,1],[0,0]].
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= rows, cols <= 100
 * 0 <= rCenter < rows
 * 0 <= cCenter < cols
 * 
 * 
 */

// @lc code=start
class Solution {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        //         Comparator<int[]> cmp = new Comparator<int[]>(){
//              public int compare(int[] a,int[] b){
//                 return a[2]-b[2];
//             }
//         };
//         PriorityQueue<int[]> pq= new PriorityQueue<int[]>(cmp);
//         for(int i=0;i<rows;i++){
//             for(int j=0;j<cols;j++){
//                 int[] arr=new int[]{i,j,Math.abs(i-rCenter)+Math.abs(j-cCenter)};
//                 pq.add(arr);
//             }
//         }
        
//         int[][] ans=new int[rows*cols][cols];
//         for(int i=0;i<ans.length;i++){
//             int[] curr=pq.poll();
//             ans[i]=new int[]{curr[0],curr[1]};
//         }
        
//         return ans;
List<int[]> arr= new ArrayList<>();
Queue<int[]> q = new LinkedList<>();
boolean[][] visited=new boolean[rows][cols];
q.add(new int[]{rCenter,cCenter});
while(!q.isEmpty()){
    int size=q.size();
    for(int i=0;i<size;i++){
        int[] curr=q.poll();
        if(visited[curr[0]][curr[1]])continue ;
        
        if(!visited[curr[0]][curr[1]]){arr.add(curr);}
        
        visited[curr[0]][curr[1]]=true;
        
        if(curr[0]+1<rows && !visited[curr[0]+1][curr[1]]){
            q.add(new int[]{curr[0]+1,curr[1]});
        }
        if(curr[0]-1>=0 && !visited[curr[0]-1][curr[1]]){
            q.add(new int[]{curr[0]-1,curr[1]});
        }
if(curr[1]+1<cols && !visited[curr[0]][curr[1]+1]){
            q.add(new int[]{curr[0],curr[1]+1});
        }
if(curr[1]-1>=0 && !visited[curr[0]][curr[1]-1]){
            q.add(new int[]{curr[0],curr[1]-1});
        }

    }
}

int[][] ans=new int[arr.size()][2];
for(int i=0;i<ans.length;i++){
    ans[i]=arr.get(i);
}
return ans;
    }
}
// @lc code=end

