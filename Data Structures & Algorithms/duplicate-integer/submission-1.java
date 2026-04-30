class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> numHash = new HashSet<Integer>();
        for(int i = 0; i<nums.length; i++){
            numHash.add(nums[i]);
        }
       return(numHash.size() != nums.length);
    }
}