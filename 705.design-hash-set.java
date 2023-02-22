/*
 * @lc app=leetcode id=705 lang=java
 *
 * [705] Design HashSet
 *
 * https://leetcode.com/problems/design-hashset/description/
 *
 * algorithms
 * Easy (65.71%)
 * Likes:    2586
 * Dislikes: 235
 * Total Accepted:    275.8K
 * Total Submissions: 419.8K
 * Testcase Example:  '["MyHashSet","add","add","contains","contains","add","contains","remove","contains"]\n' +
  '[[],[1],[2],[1],[3],[2],[2],[2],[2]]'
 *
 * Design a HashSet without using any built-in hash table libraries.
 * 
 * Implement MyHashSet class:
 * 
 * 
 * void add(key) Inserts the value key into the HashSet.
 * bool contains(key) Returns whether the value key exists in the HashSet or
 * not.
 * void remove(key) Removes the value key in the HashSet. If key does not exist
 * in the HashSet, do nothing.
 * 
 * 
 * 
 * Example 1:
 * 
 * 
 * Input
 * ["MyHashSet", "add", "add", "contains", "contains", "add", "contains",
 * "remove", "contains"]
 * [[], [1], [2], [1], [3], [2], [2], [2], [2]]
 * Output
 * [null, null, null, true, false, null, true, null, false]
 * 
 * Explanation
 * MyHashSet myHashSet = new MyHashSet();
 * myHashSet.add(1);      // set = [1]
 * myHashSet.add(2);      // set = [1, 2]
 * myHashSet.contains(1); // return True
 * myHashSet.contains(3); // return False, (not found)
 * myHashSet.add(2);      // set = [1, 2]
 * myHashSet.contains(2); // return True
 * myHashSet.remove(2);   // set = [1]
 * myHashSet.contains(2); // return False, (already removed)
 * 
 * 
 * Constraints:
 * 
 * 
 * 0 <= key <= 10^6
 * At most 10^4 calls will be made to add, remove, and contains.
 * 
 * 
 */

// @lc code=start
class MyHashSet {
    Node[] arr;
    public MyHashSet() {
        arr=new Node[3000];
    }
    
    public void add(int key) {
        int index=getIndex(key);
        if(arr[index]==null){
            arr[index]=new Node(0);
        }
        
        Node f=arr[index];
        while(f.next!=null){
            if(f.next.v==key)return ;
            
            f=f.next;
        }
        f.next=new Node(key);
    }
    
    public int getIndex(int k){
        return Integer.hashCode(k)%arr.length;
    }
    
    public void remove(int key) {
        int index=getIndex(key);
        if(arr[index]==null)return ;
        
        Node f=arr[index];
        while(f.next!=null && f.next.v!=key){
            f=f.next;
        }
        
        if(f.next!=null)f.next=f.next.next;
    }
    
    public boolean contains(int key) {
        int index=getIndex(key);
        if(arr[index]==null)return false;
        Node f=arr[index];
        while(f.next!=null){
            if(f.next.v==key)return true;
            
            f=f.next;
        }
        
        return false;
    }
    
}

public class Node {
    int v;
    Node next;
    public Node(int v){
        this.v=v;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
// @lc code=end

