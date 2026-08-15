class Solution {
    public int longestSubsequence(int[] nums) {
        int n=nums.length;
        int xor=0;
        boolean zero=false;
        for(int i:nums){
            xor^=i;
            if(i!=0){
                zero=true;
            }
        }
        if(xor!=0)return n;
        if(zero) return n-1;
        return 0;
    }
}