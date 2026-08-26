class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        solve(nums,0,new ArrayList<>(),result);
        return result;
        
    }
    public void solve(int nums[],int i,List<Integer> current,List<List<Integer>> result){
        if(i==nums.length){
            result.add(new ArrayList<>(current));
            return;
        }
        current.add(nums[i]);
        solve(nums,i+1,current,result);
        current.remove(current.size()-1);
        solve(nums,i+1,current,result);
    }
}