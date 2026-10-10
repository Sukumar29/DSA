class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n=nums1.length;
        int diff[]=new int[n];
        long k=(long) k1+k2;
        int max=0;
        long total=0;
        for(int i=0;i<n;i++){
            diff[i]=Math.abs(nums1[i]-nums2[i]);
            max=Math.max(max,diff[i]);
            total+=diff[i];
        }
        if(total<=k){
            return 0;
        }
        int l=0,r=max;
        while(l<r){
            int mid=l+(r-l)/2;
            long a=0;
            for(int i:diff){
                if(i>mid){
                    a+=i-mid;
                }
            }
            if(a<=k){
                r=mid;
            }
            else{
                l=mid+1;
            }
        }
        long ans=0;
        for(int i:diff){
            int rem=Math.min(i,l);
            ans+=(long) rem*rem;
        }
        long used=0;
        for(int i:diff){
            if(i>l){
                used+=i-l;
            }
        }
        long ops=k-used;
        for(int d:diff){
            if(ops>0&&d>=l&&l>0){
                ans-=(long)l*l-(long)(l-1)*(l-1);
                ops--;
            }
        }
        return ans;
    }
}