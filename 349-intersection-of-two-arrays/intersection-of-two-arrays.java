class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s=new HashSet<>();
        Set<Integer> result=new HashSet<>();
        for(int i:nums1){
            s.add(i);
        }
        for(int i:nums2){
            if(s.contains(i)){
                result.add(i);
            }
        }
        int ans[]=new int[result.size()];
        int i=0;
        for(int n:result){
            ans[i++]=n;
        }
        return ans;
    }
}