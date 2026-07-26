class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int product=nums[0]*nums[1]*nums[nums.length-1];
        int max=nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
        return Math.max(product,max);
    }
}