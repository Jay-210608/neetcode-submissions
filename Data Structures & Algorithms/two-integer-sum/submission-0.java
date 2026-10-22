class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>map=new HashMap<>();
        System.out.println("Input: nums = "+Arrays.toString(nums)+", target = "+target);
        for(int i=0;i<nums.length;i++){
            int need = target-nums[i];
            if(map.containsKey(need)){
              return new int[]{map.get(need),i};  
            }
            map.put(nums[i],i);
        }
            return new int[]{};
    
}
}