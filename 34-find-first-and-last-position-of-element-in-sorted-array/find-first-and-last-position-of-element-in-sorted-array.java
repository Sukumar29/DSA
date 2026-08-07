class Solution {
    public int[] searchRange(int[] nums, int target) {

        int first=FirstPosition(nums,target);
        int last=LastPosition(nums,target);

        return new int[]{first,last};

    }
    private int FirstPosition(int nums[],int target){
        int first=-1;
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(target==nums[mid]){
                first=mid;
                high=mid-1;
            }
            else if(target>nums[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return first;
    }
    private int LastPosition(int nums[],int target){
        int last=-1;
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(target==nums[mid]){
                last=mid;
                low=mid+1;
            }
            else if(target>nums[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return last;
    }    
}