class Solution {
    public int firstUniqChar(String s) {
        // int freq[]=new int[26];
        // for(char c:s.toCharArray()){
        //     freq[c-'a']++;
        // }
        // for(char c=0;c<s.length();c++){
        //     if(freq[s.charAt(c)-'a']==1){
        //         return c;
        //     }
        // }
        // return -1;
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }
}