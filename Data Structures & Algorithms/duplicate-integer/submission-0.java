class Solution {
    public boolean hasDuplicate(int[] nums) {
        for(int i =0 ;i<nums.length;i++){
            if(nums.indexOf(i)!=nums.lastIndexOf(i)){
                return false;
            }
            return true;
        }
    }
}