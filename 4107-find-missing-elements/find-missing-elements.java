class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min=100;
        int max=0;
        boolean[] present=new boolean[101];
        for (int n:nums){
            min=Math.min(min,n);
            max=Math.max(max,n);
            present[n]=true;
        }
        List<Integer> ans=new ArrayList<>();
        for(int i=min;i<=max;i++){
            if(!present[i]){
                ans.add(i);
            }
        }
        return ans;
    }
}