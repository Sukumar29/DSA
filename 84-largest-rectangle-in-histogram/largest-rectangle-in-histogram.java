class Solution {
    public int largestRectangleArea(int[] h) {
        Stack<Integer> s=new Stack<>();
        int a=0;
        for(int i=0;i<=h.length;i++){
            int current=0;
            if(i==h.length){
                current=0;
            }
            else current=h[i];
            while(!s.isEmpty()&&h[s.peek()]>current){
                int height=h[s.pop()];
                int width;
                if(s.isEmpty()){
                    width=i;
                }
                else{
                    width=i-s.peek()-1;
                }
                int area=width*height;
                a=Math.max(a,area);
            }
            s.push(i);
        }
        return a;
    }
}