class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int arr[]=new int[n];
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<n;i++){
            while(!s.isEmpty()&&temperatures[i]>temperatures[s.peek()]){
                int prev=s.pop();
                arr[prev]=i-prev;
            }
            s.push(i);
        }
        return arr;
    }
}