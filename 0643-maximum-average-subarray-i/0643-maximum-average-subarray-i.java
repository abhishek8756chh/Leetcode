class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxSum=0;
        double sum=0;
        for(int i=0;i<k;i++){
           sum+=nums[i];

        }
        maxSum=sum/k;
        int left=0;
        for(int i=k;i<nums.length;i++){
            sum=sum-nums[left]+nums[i];
            maxSum=Math.max(maxSum,sum/k);
            left++;
        }
        return maxSum;
    }
}