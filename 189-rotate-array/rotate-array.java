class Solution {
        public void rotate(int[] nums, int k) {
            int n=nums.length;
            int r=k%n;
            if(r<0){
                r+=nums.length;
            }
            reverse(nums,0,n-1);
            reverse(nums,0,r-1);
            reverse(nums,r,n-1);
        }   
        private void reverse(int nums[],int left,int right){
            while(left<right){
                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                left++;
                right--;
            }
        }
    }
    
