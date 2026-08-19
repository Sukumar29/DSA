class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        Map<Integer, Boolean> map=new HashMap<>();
        for(int i=1;i<=n;i++){
            map.put(i,false);
        }
        for(int i:nums){
            if(i>0&&i<=n){
                map.put(i,true);
            }
        }
        for(int i=1;i<=n;i++){
            if(!map.get(i)){
                return i;
            }
        }
        return n+1;
    }
}