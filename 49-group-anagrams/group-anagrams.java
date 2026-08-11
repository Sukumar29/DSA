class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Map<String,List<String>> map=new HashMap<>();
        // for(String s:strs){
        //     int count[]=new int[26];
        //     for(char i:s.toCharArray()){
        //         count[i-'a']++;
        //     }
        //     String key=Arrays.toString(count);
        //     map.putIfAbsent(key,new ArrayList<>());
        //     map.get(key).add(s);
        // }
        // return new ArrayList<>(map.values());
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }

        Map<String, List<String>> result = new HashMap<>();

        for (String s : strs) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String key = String.valueOf(c);
            if (!result.containsKey(key)) {
                result.put(key, new ArrayList<>());
            }
            result.get(key).add(s);
        }
        return new ArrayList<>(result.values());
    }
}