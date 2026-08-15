class Solution {
    public int[] sortArray(int[] nums) {
        mergesort(nums,0,nums.length-1);
        return nums;
    }
    public void merge(int nums[],int l,int m,int h){
        int temp[]=new int[h-l+1];
        int left=l;
        int right=m+1;
        int k=0;
        while(left<=m&&right<=h){
            if(nums[left]<=nums[right]){
                temp[k++]=nums[left++];
            }
            else{
                temp[k++]=nums[right++];
            }
        }
        while(left<=m){
            temp[k++]=nums[left++];
        }
        while(right<=h){
            temp[k++]=nums[right++];
        }
        for(int i=0;i<temp.length;i++){
            nums[i+l]=temp[i];
        }
    }
    public void mergesort(int nums[],int low,int high){
        if(low<high){
            int mid=low+(high-low)/2;
            mergesort(nums,low,mid);
            mergesort(nums,mid+1,high);
            merge(nums,low,mid,high);
        }
    }
}