class Solution {
    int max=0;
    int count=0;
    public int countMaxOrSubsets(int[] nums) {
        for(int n:nums){
            max|=n;
        }
        dfs(nums,0,0);
        return count;
    }
    void dfs(int nums[],int index,int current){
        if(index==nums.length){
            if(current==max){
                count++;
            }
            return;
        }
        dfs(nums,index+1,current|nums[index]);
        dfs(nums,index+1,current);
    }
}