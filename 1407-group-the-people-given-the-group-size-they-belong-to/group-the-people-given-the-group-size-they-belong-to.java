class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer,List<Integer>> map=new HashMap<>();
        List<List<Integer>> l=new ArrayList<>();
        for(int i=0;i<groupSizes.length;i++){
            int a=groupSizes[i];
            map.putIfAbsent(a,new ArrayList<>());
            map.get(a).add(i);
            if(map.get(a).size()==a){
                l.add(map.get(a));
                map.put(a,new ArrayList<>());
            }
        }
        return l;
    }
}