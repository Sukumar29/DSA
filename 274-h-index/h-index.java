class Solution {
    public int hIndex(int[] citations) {
        // Arrays.sort(citations);
        // int n=citations.length;
        // int h=0;
        // for(int i=0;i<n;i++){
        //     int papers=n-i;
        //     if(citations[i]>=papers){
        //         h++;
        //     }
        // }
        // return h;
        Arrays.sort(citations);
        int h_index = 0;
        for (int i = citations.length - 1; i >= 0; i--) {
            if (citations[i] > h_index)
                h_index++;
            else
                break;
        }
        return h_index;
    }
}