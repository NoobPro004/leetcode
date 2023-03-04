/*
 * @lc app=leetcode id=2094 lang=java
 *
 * [2094] Finding 3-Digit Even Numbers
 *
 * https://leetcode.com/problems/finding-3-digit-even-numbers/description/
 *
 * algorithms
 * Easy (57.80%)
 * Likes:    395
 * Dislikes: 230
 * Total Accepted:    22.1K
 * Total Submissions: 38.3K
 * Testcase Example:  '[2,1,3,0]'
 *
 * You are given an integer array digits, where each element is a digit. The
 * array may contain duplicates.
 * 
 * You need to find all the unique integers that follow the given
 * requirements:
 * 
 * 
 * The integer consists of the concatenation of three elements from digits in
 * any arbitrary order.
 * The integer does not have leading zeros.
 * The integer is even.
 * 
 * 
 * For example, if the given digits were [1, 2, 3], integers 132 and 312 follow
 * the requirements.
 * 
 * Return a sorted array of the unique integers.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: digits = [2,1,3,0]
 * Output: [102,120,130,132,210,230,302,310,312,320]
 * Explanation: All the possible integers that follow the requirements are in
 * the output array. 
 * Notice that there are no odd integers or integers with leading zeros.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: digits = [2,2,8,8,2]
 * Output: [222,228,282,288,822,828,882]
 * Explanation: The same digit can be used as many times as it appears in
 * digits. 
 * In this example, the digit 8 is used twice each time in 288, 828, and
 * 882. 
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: digits = [3,7,5]
 * Output: []
 * Explanation: No even integers can be formed using the given digits.
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 3 <= digits.length <= 100
 * 0 <= digits[i] <= 9
 * 
 * 
 */

// @lc code=start
class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int[] arr = new int[10];
        for(int i:digits)arr[i]++;
        
        List<Integer> ans=  new ArrayList<>();
        int[] even=new int[]{0,2,4,6,8};
        for(int i=1;i<=9;i++){
            if(arr[i]==0)continue;
            arr[i]--;
            for(int j=0;j<=9;j++){
                if(arr[j]==0)continue;
                arr[j]--;
                for(int k : even){
                    if(arr[k]>0){
                        ans.add(i*100+j*10+k);
                    }
                }
                arr[j]++;
            }
            
            arr[i]++;
        }
        
        int[] a=new int[ans.size()];
        for(int i=0;i<a.length;i++)a[i]=ans.get(i);
        
        return a;
    }
}
// @lc code=end

