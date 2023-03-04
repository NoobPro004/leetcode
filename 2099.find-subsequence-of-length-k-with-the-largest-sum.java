/*
 * @lc app=leetcode id=2099 lang=java
 *
 * [2099] Find Subsequence of Length K With the Largest Sum
 *
 * https://leetcode.com/problems/find-subsequence-of-length-k-with-the-largest-sum/description/
 *
 * algorithms
 * Easy (42.80%)
 * Likes:    891
 * Dislikes: 84
 * Total Accepted:    31.6K
 * Total Submissions: 73.7K
 * Testcase Example:  '[2,1,3,3]\n2'
 *
 * You are given an integer array nums and an integer k. You want to find a
 * subsequence of nums of length k that has the largest sum.
 * 
 * Return any such subsequence as an integer array of length k.
 * 
 * A subsequence is an array that can be derived from another array by deleting
 * some or no elements without changing the order of the remaining elements.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: nums = [2,1,3,3], k = 2
 * Output: [3,3]
 * Explanation:
 * The subsequence has the largest sum of 3 + 3 = 6.
 * 
 * Example 2:
 * 
 * 
 * Input: nums = [-1,-2,3,4], k = 3
 * Output: [-1,3,4]
 * Explanation: 
 * The subsequence has the largest sum of -1 + 3 + 4 = 6.
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: nums = [3,4,3,3], k = 2
 * Output: [3,4]
 * Explanation:
 * The subsequence has the largest sum of 3 + 4 = 7. 
 * Another possible subsequence is [4, 3].
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= nums.length <= 1000
 * -10^5 <= nums[i] <= 10^5
 * 1 <= k <= nums.length
 * 
 * 
 */

// @lc code=start
class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int n = nums.length;
        int[] index = new int[n];
        for (int i = 0; i < n; ++i) {
            index[i] = i;
        }
        
        // Use Quick Select to put the indexes of the 
        // max k items to the left of index array. 
        int lo = 0, hi = n - 1;
        while (lo < hi) {
            int idx = quickSelect(nums, index, lo, hi);
            if (idx < k) {
                lo = idx + 1;
            }else {
                hi = idx;
            }
        }
        
        // Count the occurrencs of the kth largest items
        // within the k largest ones.
        int kthVal = nums[index[k - 1]], freqOfkthVal = 0;
        for (int i : Arrays.copyOf(index, k)) {
            freqOfkthVal += nums[i] == kthVal ? 1 : 0;
        }
        
        // Greedily copy the subsequence into output array seq.
        int[] seq = new int[k];
        int i = 0;
        for (int num : nums) {
            if (num > kthVal || num == kthVal && freqOfkthVal-- > 0) {
                seq[i++] = num;
            }
        }
        return seq;
    }
    
    // Divide index[lo...hi] into two parts: larger and less than 
    // the pivot; Then return the position of the pivot;
    private int quickSelect(int[] nums, int[] index, int lo, int hi) {
        int pivot = index[lo];
        while (lo < hi) {
            while (lo < hi && nums[index[hi]] <= nums[pivot]) {
                --hi;
            }
            index[lo] = index[hi];
            while (lo < hi && nums[index[lo]] >= nums[pivot]) {
                ++lo;
            }
            index[hi] = index[lo];
        } 
        index[lo] = pivot;
        return lo;
    }
}
// @lc code=end

