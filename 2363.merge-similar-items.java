/*
 * @lc app=leetcode id=2363 lang=java
 *
 * [2363] Merge Similar Items
 *
 * https://leetcode.com/problems/merge-similar-items/description/
 *
 * algorithms
 * Easy (75.57%)
 * Likes:    363
 * Dislikes: 12
 * Total Accepted:    34.3K
 * Total Submissions: 45.3K
 * Testcase Example:  '[[1,1],[4,5],[3,8]]\n[[3,1],[1,5]]'
 *
 * You are given two 2D integer arrays, items1 and items2, representing two
 * sets of items. Each array items has the following properties:
 * 
 * 
 * items[i] = [valuei, weighti] where valuei represents the value and weighti
 * represents the weight of the i^th item.
 * The value of each item in items is unique.
 * 
 * 
 * Return a 2D integer array ret where ret[i] = [valuei, weighti], with weighti
 * being the sum of weights of all items with value valuei.
 * 
 * Note: ret should be returned in ascending order by value.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: items1 = [[1,1],[4,5],[3,8]], items2 = [[3,1],[1,5]]
 * Output: [[1,6],[3,9],[4,5]]
 * Explanation: 
 * The item with value = 1 occurs in items1 with weight = 1 and in items2 with
 * weight = 5, total weight = 1 + 5 = 6.
 * The item with value = 3 occurs in items1 with weight = 8 and in items2 with
 * weight = 1, total weight = 8 + 1 = 9.
 * The item with value = 4 occurs in items1 with weight = 5, total weight =
 * 5.  
 * Therefore, we return [[1,6],[3,9],[4,5]].
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: items1 = [[1,1],[3,2],[2,3]], items2 = [[2,1],[3,2],[1,3]]
 * Output: [[1,4],[2,4],[3,4]]
 * Explanation: 
 * The item with value = 1 occurs in items1 with weight = 1 and in items2 with
 * weight = 3, total weight = 1 + 3 = 4.
 * The item with value = 2 occurs in items1 with weight = 3 and in items2 with
 * weight = 1, total weight = 3 + 1 = 4.
 * The item with value = 3 occurs in items1 with weight = 2 and in items2 with
 * weight = 2, total weight = 2 + 2 = 4.
 * Therefore, we return [[1,4],[2,4],[3,4]].
 * 
 * Example 3:
 * 
 * 
 * Input: items1 = [[1,3],[2,2]], items2 = [[7,1],[2,2],[1,4]]
 * Output: [[1,7],[2,4],[7,1]]
 * Explanation:
 * The item with value = 1 occurs in items1 with weight = 3 and in items2 with
 * weight = 4, total weight = 3 + 4 = 7. 
 * The item with value = 2 occurs in items1 with weight = 2 and in items2 with
 * weight = 2, total weight = 2 + 2 = 4. 
 * The item with value = 7 occurs in items2 with weight = 1, total weight = 1.
 * Therefore, we return [[1,7],[2,4],[7,1]].
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= items1.length, items2.length <= 1000
 * items1[i].length == items2[i].length == 2
 * 1 <= valuei, weighti <= 1000
 * Each valuei in items1 is unique.
 * Each valuei in items2 is unique.
 * 
 * 
 */

// @lc code=start
class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        //         Map<Integer,Integer> map = new HashMap<>();
//         for(int[] i:items1){
//             map.put(i[0],i[1]);
//         }
        
//         for(int[] i :items2){
//             map.put(i[0],map.getOrDefault(i[0],0)+i[1]);
//         }
        
//         List<List<Integer>> ans=new ArrayList<>();
//          for(int i:map.keySet()){
//              List<Integer> a = new ArrayList<>();
//               a.add(i);
//              a.add(map.get(i));
//              ans.add(a);
             
//          }
//         Collections.sort(ans,(a,b)->{
//             return a.get(0)-b.get(0);
//         });
//         return ans;
        
List<List<Integer>> ans=new ArrayList<>();
int count[]=new int[1005];
for(int arr[]:items1) count[arr[0]]+=arr[1];  
for(int arr[]:items2) count[arr[0]]+=arr[1]; 
for(int i=0; i<count.length; i++){ if(count[i]==0) continue;
    ans.add(Arrays.asList(i,count[i]));/
}
return ans;
    }
}
// @lc code=end

