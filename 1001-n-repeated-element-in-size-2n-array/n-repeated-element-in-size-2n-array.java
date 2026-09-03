class Solution {
    public int repeatedNTimes(int[] nums) {
       HashSet<Integer> h=new HashSet<>();
       for(int i:nums){
            if(h.contains(i)){
                return i;   
            }
            h.add(i);
       } 
       return -1;
    }
}