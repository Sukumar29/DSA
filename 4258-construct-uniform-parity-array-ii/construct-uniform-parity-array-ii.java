class Solution {
    public boolean uniformArray(int[] nums1) {
        int mid=Integer.MAX_VALUE;
        for(int i:nums1){
            if(i%2!=0){
                mid=Math.min(mid,i);
            }
        }
        if(mid==Integer.MAX_VALUE){
            return true;
        }
        for(int i:nums1){
            if(i%2==0&&i<mid){
                return false;
            }
        }
        return true;
    }
}