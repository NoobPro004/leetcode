/*
 * @lc app=leetcode id=1766 lang=java
 *
 * [1766] Tree of Coprimes
 */
import java.util.*;
// @lc code=start
class Solution {

    // public class Node{
    //     int curr;
    //     List<Integer> arr;

    //     public Node(int c,List<Integer> arr){
    //         curr=c;
    //         this.arr=arr;
    //     }
    // }

    Map<Integer,int[]> map = new HashMap<>();
    boolean[][] coprime = new boolean[52][52];
    int[] ans;
    Map<Integer,List<Integer>> graph = new HashMap<>();
    public int[] getCoprimes(int[] nums, int[][] edges) {
        // int n=nums.length;
        // int[] ans=new int[n];
        // Arrays.fill(ans,-1);
        // boolean[][] coprime=new boolean[52][52];

        // for(int i=0;i<=51;i++){
        //     for(int j=0;j<=51;j++){
        //         if(gcd(i,j)==1)coprime[i][j]=true;
        //     }
        // }
        
        // Map<Integer,List<Integer>> graph = new HashMap<>();
        //  for(int[] i:edges){
        //     if(!graph.containsKey(i[0]))graph.put(i[0],new ArrayList<Integer>());
        //     if(!graph.containsKey(i[1]))graph.put(i[1],new ArrayList<Integer>());

        //     graph.get(i[1]).add(i[0]);
        //     graph.get(i[0]).add(i[1]);
        //  }

        //  boolean[] visited=new boolean[n];
        //  Queue<Node> q = new LinkedList<Node>();
        //   q.add(new Node(0,new ArrayList<Integer>()));
        //   while(!q.isEmpty()){
        //     Node curr=q.poll();
        //     visited[curr.curr]=true;
        //     if(curr.curr!=0){
        //         boolean found=false;
        //         ListInrteger<Integer> arr=curr.arr;
        //         for(int i=arr.size()-1;i>=0;i--){
        //             if(coprime[nums[curr.curr]][nums[arr.get(i)]]){
        //                 ans[curr.curr]=arr.get(i);
        //                 found=true;
        //             }

        //             if(found)break;
        //         }
        //     }

        //     if(map.containsKey(curr.curr)){
        //         for(int next : map.get(curr.curr)){
        //             if(!visited[next]){
        //                 List<Integer> arr=new ArrayList<Integer>(curr.arr);
        //                 arr.add(curr.curr);
        //                 q.add(new Node(next,arr));
        //             }
        //         }
        //     }
        //   }

        int n=nums.length;
        ans=new int[n];
        for(int i=0;i<52;i++){
            for(int j=0;j<52;j++){
                if(gcd(i,j)==1){
                    coprime[i][j]=true;
                }
            }
        }

         for(int[] i:edges){
            if(!graph.containsKey(i[0]))graph.put(i[0],new ArrayList<Integer>());
            if(!graph.containsKey(i[1]))graph.put(i[1],new ArrayList<Integer>());

            graph.get(i[1]).add(i[0]);
            graph.get(i[0]).add(i[1]);
         }

        solve(0,new HashSet<Integer>(),0,nums);

        return ans;
    }

    public void solve(int curr,Set<Integer> visited,int depth,int[] values){
        if(visited.contains(curr)){
            return;
        }

        visited.add(curr);
        int ancestor = -1;
        int minDist = Integer.MAX_VALUE;
        for(int i=1;i<51;i++){
            if(coprime[i][values[curr]] && map.containsKey(i) && depth-map.get(i)[1]<=minDist){
                ancestor=map.get(i)[0];
                minDist=depth-map.get(i)[1];
            }
        }

        ans[curr]=ancestor;
        int[] prev=map.containsKey(values[curr]) ? map.get(values[curr]) : new int[]{-1,-1};

        map.put(values[curr],new int[]{curr,depth});

        if(graph.containsKey(curr)){
            for(int next : graph.get(curr)){
                solve(next,visited,depth+1,values);
            }
        }

        if(prev[0]!=-1){
            map.put(values[curr],prev);
        }else map.remove(values[curr]);

    }

    public int gcd(int x,int y){
        return x==0 ? y : gcd(y%x,x);
    }
}
// @lc code=end
