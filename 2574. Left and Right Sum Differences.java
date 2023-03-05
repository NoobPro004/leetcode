class Solution {
    public int[] leftRigthDifference(int[] nums) {
        int sum=0;
         for(int i:nums)sum+=i;
        
        int lsum=0;
         for(int i=0;i<nums.length;i++){
             int temp=nums[i];
             nums[i]=Math.abs(lsum-(sum-temp));
             lsum+=temp;
             sum-=temp;
         }
        
        return nums;
    }
}