class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (String op:operations) {
            switch(op){
                case "C":
                    stack.pop();
                    break;
                case "D":
                    stack.push(stack.peek()*2);
                    break;
                case "+":
                    int last=stack.pop();
                    int sum=last+stack.peek();
                    stack.push(last);
                    stack.push(sum);
                    break;
                default:
                    stack.push(Integer.parseInt(op));
            }
        }
        int total=0;
        for (int score:stack) {
            total+=score;
        }
        return total;
    }
}