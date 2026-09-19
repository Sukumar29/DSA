class Solution {
    public long shadowPairs(int[] nums) {
        long count=0;
        int[] stack=new int[nums.length];
        int top=-1;
        for(int j=0;j<nums.length;j++){
            int left=0,right=top+1;
            while(left<right){
                int mid=left+(right-left)/2;
                if(stack[mid]<nums[j])
                    left=mid+1;
                else
                    right=mid;
            }
            count+=left;
            while(top>=0&&stack[top]>nums[j])
                top--;
            stack[++top]=nums[j];
        }
        return count;
    }
}