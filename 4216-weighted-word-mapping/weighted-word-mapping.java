class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb=new StringBuilder();
        for(String s:words){
            int sum=0;
            for(char c:s.toCharArray()){
                sum+=weights[c-'a'];
            }
            int x=sum%26;
            sb.append((char)('a'+(25-x)));
        }
        return sb.toString();
    }
}