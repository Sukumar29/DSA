class Solution {
    public int threeSumMulti(int[] arr, int target) {
        int n=arr.length;
        long count=0;
        int MOD=1_000_000_007;
        for(int i=0;i<n;i++){
            int freq[]=new int[101];
            for(int j=0;j<i;j++){
                int a=target-arr[i]-arr[j];
                if(a>=0&&a<=100){
                    count+=freq[a];
                    count%=MOD;
                }
                freq[arr[j]]++;
            }
        }
        return (int)count;
    }
}