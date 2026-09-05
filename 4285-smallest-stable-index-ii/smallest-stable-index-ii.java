class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int suffixsum[]=new int[n];
        suffixsum[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            suffixsum[i]=Math.min(nums[i],suffixsum[i+1]);
        }
        int maxleft=0;
        for(int i=0;i<n;i++){
            maxleft=Math.max(maxleft,nums[i]);
            if(maxleft-suffixsum[i]<=k){
                return i;
            }
        }
        return -1;
    }
}