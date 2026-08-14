class Solution {
    public boolean isHappy(int n) {
        for(int i=0;i<n;i++){
            int sum=0;
            while(n!=0){
                int rem=n%10;
                sum=sum+rem*rem;
                n=n/10;
            }
            if(sum==1)
                return true;
            else{
                n=sum;
                sum=0;
            }
        }
        return false;
    }
}