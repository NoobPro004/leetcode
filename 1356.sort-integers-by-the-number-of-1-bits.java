/*
 * @lc app=leetcode id=1356 lang=java
 *
 * [1356] Sort Integers by The Number of 1 Bits
 *
 * https://leetcode.com/problems/sort-integers-by-the-number-of-1-bits/description/
 *
 * algorithms
 * Easy (72.70%)
 * Likes:    1507
 * Dislikes: 66
 * Total Accepted:    104.3K
 * Total Submissions: 143.2K
 * Testcase Example:  '[0,1,2,3,4,5,6,7,8]'
 *
 * You are given an integer array arr. Sort the integers in the array in
 * ascending order by the number of 1's in their binary representation and in
 * case of two or more integers have the same number of 1's you have to sort
 * them in ascending order.
 * 
 * Return the array after sorting it.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: arr = [0,1,2,3,4,5,6,7,8]
 * Output: [0,1,2,4,8,3,5,6,7]
 * Explantion: [0] is the only integer with 0 bits.
 * [1,2,4,8] all have 1 bit.
 * [3,5,6] have 2 bits.
 * [7] has 3 bits.
 * The sorted array by bits is [0,1,2,4,8,3,5,6,7]
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: arr = [1024,512,256,128,64,32,16,8,4,2,1]
 * Output: [1,2,4,8,16,32,64,128,256,512,1024]
 * Explantion: All integers have 1 bit in the binary representation, you should
 * just sort them in ascending order.
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= arr.length <= 500
 * 0 <= arr[i] <= 10^4
 * 
 * 
 */

// @lc code=start
class Solution {
    public int[] sortByBits(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : arr){
            if(!map.containsKey(i))map.put(i,get(i));
        }
        
        Integer[] nums = new Integer[arr.length];
        for(int i=0;i<nums.length;i++){
            nums[i]=arr[i];
        }
        Comparator<Integer> cmp =new Comparator<Integer>(){
            public int compare(Integer a,Integer b){
               if(map.get(a)!=map.get(b))return map.get(a)-map.get(b);
            
            return a-b; 
            }
        };
        
        Arrays.sort(nums,cmp);
        
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
        }
        return arr;
    }
    
    public int get(int x){
        int count=0;
         while(x>0){
             if((x & 1) != 0)count++;
             
             x>>=1;
         }
        
        return count;
    }
}
// @lc code=end

