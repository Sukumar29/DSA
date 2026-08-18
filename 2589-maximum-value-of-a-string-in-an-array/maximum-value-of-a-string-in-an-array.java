class Solution {
    public int maximumValue(String[] strs) {
        int max=0;
        for(String s:strs){
            int value=0;
            if(s.matches("\\d+")){
                value=Integer.parseInt(s);
            }
            else{
                value=s.length();
            }
            max=Math.max(max,value);
        }
        return max;
    }
}