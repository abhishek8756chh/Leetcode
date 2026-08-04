class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        ArrayList<Integer>list=new ArrayList<>();
        int max=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
        }
      
        for(int i=min;i<=max;i++){
            if(!map.containsKey(i)){
                list.add(i);   
            }
           
        }
        return list;
    }
}