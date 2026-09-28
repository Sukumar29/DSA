class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int arr[]=new int[seq.length()];
        int d=0;
        for(int i=0;i<seq.length();i++){
            if(seq.charAt(i)=='('){
                d++;
                arr[i]=d%2;
            }
            else if(seq.charAt(i)==')'){
                arr[i]=d%2;
                d--;
            }
        }
        return arr;
    }
}