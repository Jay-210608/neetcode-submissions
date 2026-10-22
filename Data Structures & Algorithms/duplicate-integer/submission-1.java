class Solution {
    public boolean hasDuplicate(int[] nums) {
        System.out.println("Input: nums = "+Arrays.toString(nums));
        HashSet<Integer>seen=new HashSet<>();
       for(int n:nums){
        if(seen.contains(n)){
            return true;
        }
        seen.add(n);
       }
        return false;
    }
}