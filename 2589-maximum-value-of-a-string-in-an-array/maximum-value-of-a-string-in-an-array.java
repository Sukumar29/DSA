class Solution {
    public int maximumValue(String[] strs) {
        int ans=0;
        for(String s:strs){
            boolean n=true;
            for(char c:s.toCharArray()){
                if(!Character.isDigit(c)){
                    n=false;
                    break;
                }
            }
            if(n){
                ans=Math.max(ans,Integer.parseInt(s));
            }
            else{
                ans=Math.max(ans,s.length());
            }
        }   
        return ans;
    }
}