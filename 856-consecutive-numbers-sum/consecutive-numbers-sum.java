class Solution {
    public int consecutiveNumbersSum(int n) {
        int c=0;
        for(int i=1;i*(i-1)/2<n;i++){
            int rem=n-i*(i-1)/2;
            if(rem%i==0){
                c++;
            }
        }
        return c;
    }
}