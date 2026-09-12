class Solution {
    public int[] concatWithReverse(int[] nums) {
        int result[]=new int[2*nums.length];
        int k=0;
        for(int i:nums){
            result[k++]=i;
        }
        for(int i=nums.length-1;i>=0;i--){
            result[k++]=nums[i];
        }
        return result;
    }
}