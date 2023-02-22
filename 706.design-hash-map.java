/*
 * @lc app=leetcode id=706 lang=java
 *
 * [706] Design HashMap
 *
 * https://leetcode.com/problems/design-hashmap/description/
 *
 * algorithms
 * Easy (64.81%)
 * Likes:    3911
 * Dislikes: 350
 * Total Accepted:    397.7K
 * Total Submissions: 613.9K
 * Testcase Example:  '["MyHashMap","put","put","get","get","put","get","remove","get"]\n' +
  '[[],[1,1],[2,2],[1],[3],[2,1],[2],[2],[2]]'
 *
 * Design a HashMap without using any built-in hash table libraries.
 * 
 * Implement the MyHashMap class:
 * 
 * 
 * MyHashMap() initializes the object with an empty map.
 * void put(int key, int value) inserts a (key, value) pair into the HashMap.
 * If the key already exists in the map, update the corresponding value.
 * int get(int key) returns the value to which the specified key is mapped, or
 * -1 if this map contains no mapping for the key.
 * void remove(key) removes the key and its corresponding value if the map
 * contains the mapping for the key.
 * 
 * 
 * 
 * Example 1:
 * 
 * 
 * Input
 * ["MyHashMap", "put", "put", "get", "get", "put", "get", "remove", "get"]
 * [[], [1, 1], [2, 2], [1], [3], [2, 1], [2], [2], [2]]
 * Output
 * [null, null, null, 1, -1, null, 1, null, -1]
 * 
 * Explanation
 * MyHashMap myHashMap = new MyHashMap();
 * myHashMap.put(1, 1); // The map is now [[1,1]]
 * myHashMap.put(2, 2); // The map is now [[1,1], [2,2]]
 * myHashMap.get(1);    // return 1, The map is now [[1,1], [2,2]]
 * myHashMap.get(3);    // return -1 (i.e., not found), The map is now [[1,1],
 * [2,2]]
 * myHashMap.put(2, 1); // The map is now [[1,1], [2,1]] (i.e., update the
 * existing value)
 * myHashMap.get(2);    // return 1, The map is now [[1,1], [2,1]]
 * myHashMap.remove(2); // remove the mapping for 2, The map is now [[1,1]]
 * myHashMap.get(2);    // return -1 (i.e., not found), The map is now
 * [[1,1]]
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 0 <= key, value <= 10^6
 * At most 10^4 calls will be made to put, get, and remove.
 * 
 * 
 */

// @lc code=start
class MyHashMap {
    Node[] arr;
        public MyHashMap() {
            arr=new Node[3000];
        }
        
        public void put(int key, int value) {
            int index=getIndex(key);
            if(arr[index]==null){
                arr[index]=new Node(0,0);
            }
            
            Node f=arr[index];
            while(f.next!=null){
                if(f.next.k==key){
                    f.next.v=value;
                    return ;
                }
                
                f=f.next;
            }
            f.next=new Node(key,value);
        }
        
        public int getIndex(int k){
            return Integer.hashCode(k)%arr.length;
        }
        
        public int get(int key) {
            int index=getIndex(key);
            if(arr[index]==null)return -1;
            Node f=arr[index];
            while(f.next!=null){
                if(f.next.k==key)return f.next.v;
                
                f=f.next;
            }
            
            return -1;
        }
        
        public void remove(int key) {
            int index=getIndex(key);
            if(arr[index]==null)return ;
            
            Node f=arr[index];
            while(f.next!=null && f.next.k!=key){
                f=f.next;
            }
            
            if(f.next!=null)f.next=f.next.next;
        }
    }
    
    /**
     * Your MyHashMap object will be instantiated and called as such:
     * MyHashMap obj = new MyHashMap();
     * obj.put(key,value);
     * int param_2 = obj.get(key);
     * obj.remove(key);
     */
    
    public class Node {
        int k;
        int v;
        Node next;
        public Node(int k,int v){
            this.k=k;
            this.v=v;
        }
    }
