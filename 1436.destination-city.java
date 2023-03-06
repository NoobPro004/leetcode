/*
 * @lc app=leetcode id=1436 lang=java
 *
 * [1436] Destination City
 *
 * https://leetcode.com/problems/destination-city/description/
 *
 * algorithms
 * Easy (77.55%)
 * Likes:    1261
 * Dislikes: 62
 * Total Accepted:    121.4K
 * Total Submissions: 156.6K
 * Testcase Example:  '[["London","New York"],["New York","Lima"],["Lima","Sao Paulo"]]'
 *
 * You are given the array paths, where paths[i] = [cityAi, cityBi] means there
 * exists a direct path going from cityAi to cityBi. Return the destination
 * city, that is, the city without any path outgoing to another city.
 * 
 * It is guaranteed that the graph of paths forms a line without any loop,
 * therefore, there will be exactly one destination city.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: paths = [["London","New York"],["New York","Lima"],["Lima","Sao
 * Paulo"]]
 * Output: "Sao Paulo" 
 * Explanation: Starting at "London" city you will reach "Sao Paulo" city which
 * is the destination city. Your trip consist of: "London" -> "New York" ->
 * "Lima" -> "Sao Paulo".
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: paths = [["B","C"],["D","B"],["C","A"]]
 * Output: "A"
 * Explanation: All possible trips are: 
 * "D" -> "B" -> "C" -> "A". 
 * "B" -> "C" -> "A". 
 * "C" -> "A". 
 * "A". 
 * Clearly the destination city is "A".
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: paths = [["A","Z"]]
 * Output: "Z"
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= paths.length <= 100
 * paths[i].length == 2
 * 1 <= cityAi.length, cityBi.length <= 10
 * cityAi != cityBi
 * All strings consist of lowercase and uppercase English letters and the space
 * character.
 * 
 * 
 */

// @lc code=start
class Solution {
    public String destCity(List<List<String>> paths) {
        //         Map<String,Integer> out=new HashMap<>();
//          Map<String,Integer> in = new HashMap<>();
//         for(List<String> p:paths){
//             out.put(p.get(0),out.getOrDefault(p.get(0),0)+1);
//             in.put(p.get(1),in.getOrDefault(p.get(1),0)+1);
//         }
        
//         for(String s:in.keySet()){
//             if(in.get(s)==1 && !out.containsKey(s))return s;
//         }
        
//         return null;
Set<String> set= new HashSet<>();
for (List<String> l: paths) set.add(l.get(1));
for (List<String> l: paths) set.remove(l.get(0));
return set.iterator().next();
    }
}
// @lc code=end

