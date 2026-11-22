class Solution {
    public int maxProfit(int[] nums) {
        int profit=0;
        int buy=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(buy>nums[i]){
                buy=nums[i];
            }
            else{
                profit=Math.max(nums[i]-buy,profit);
            }
        }
        return profit;
    }
}