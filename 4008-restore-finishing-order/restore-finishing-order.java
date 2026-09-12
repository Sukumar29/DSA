class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int result[]=new int[friends.length];
        HashSet<Integer> h=new HashSet<>();
        for(int i:friends){
            h.add(i);
        }
        int ind=0;;
        for(int i:order){
            if(h.contains(i)){
                result[ind++]=i;
            }
        }
        return result;
    }
}