class Solution {
    public int maxVowels(String s, int k) {
        int vowels=0;
        for(int i=0;i<k;i++){
            if(isVowels(s.charAt(i))){
                vowels++;
            }
        }
        int maxcount=vowels;
        for(int i=k;i<s.length();i++){
            if(isVowels(s.charAt(i))){
                vowels++;
            }
            if(isVowels(s.charAt(i-k))){
                vowels--;
            }
            maxcount=Math.max(maxcount,vowels);
        }
        return maxcount;
    }
    private boolean isVowels(char c){
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';  
    }
}