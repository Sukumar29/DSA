class Solution {
    public int hIndex(int[] c) {
        // Arrays.sort(citations);
        // int n=citations.length;
        // int h=0;
        // for(int i=0;i<n;i++){
        //     int papers=n-i;
        //     if(citations[i]>=papers){
        //         h++;
        //     }
        // }
        // return h;
        int low=0;
        int high=c.length;
        while(low<high){
            int mid=(low+high+1)/2;
            int count=0;
            for(int i=0;i<c.length;i++) 
            {
                if(c[i]>=mid) {
                    count++;
                    }
                }
            if(count>=mid){
                low=mid;
            }
            else{
                high=mid-1;
            }
        }
        return low;
    }
}