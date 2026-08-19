class Solution {
    public void nextPermutation(int[] nums) {
        int ind=-1;
        int n=nums.length;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                ind=i;
                break;
            }
        }
        if(ind>=0){
            for(int i=n-1;i>=ind;i--){
                if(nums[i]>nums[ind]){
                    swap(nums,i,ind);
                    break;
                }
            }
        }
        rev(nums,ind+1,n-1);
    }
    private void swap(int nums[],int i,int ind){
        int temp=nums[i];
        nums[i]=nums[ind];
        nums[ind]=temp;
    }
    private void rev(int nums[],int left,int right){
        while(left<right){
            swap(nums,left,right);
            left++;
            right--;
        }
    }
}