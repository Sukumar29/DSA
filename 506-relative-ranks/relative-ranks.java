class Solution {
    public String[] findRelativeRanks(int[] score) {
        String result[]=new String[score.length];
        Map<Integer,Integer> map=new TreeMap<>(Collections.reverseOrder());
        for(int i=0;i<score.length;i++){
            map.put(score[i],i);
        }
        int r=1;
        for(int marks:map.keySet()){
            int index=map.get(marks);
            if(r==1){
                result[index]="Gold Medal";
            }
            else if(r==2){
                result[index]="Silver Medal";
            }
            else if(r==3){
                result[index]="Bronze Medal";
            }
            else{
                result[index]=String.valueOf(r);
            }
            r++;
        }
        return result;
    }
}