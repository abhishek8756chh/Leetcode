class Solution {
    public int maxProduct(int[] nums) {
    //    int max=Integer.MIN_VALUE;
    //    for(int i=0;i<nums.length;i++){
    //     for(int j=i+1;j<nums.length;j++){
    //         int pro=(nums[i]-1)*(nums[j]-1);
    //         max=Math.max(pro,max);
    //     }
    //    }
    //    return max;   n^2 toimecomplexity;


    //  Arrays.sort(nums);
    //    return (nums[nums.length-1]-1)*(nums[nums.length-2]-1);    timecomplexity (Onlogn)

   int max=0;
   int max1=0;
    for(int i=0;i<nums.length;i++){
        if(nums[i]>max){
            max1=max;
            max=nums[i];
        }
        else if(nums[i]>max1){
            max1=nums[i];
        }
    }

   return  (max-1)*(max1-1);

    }
}