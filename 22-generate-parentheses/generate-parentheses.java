class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> l=new ArrayList<>();
        backtrack(l,"",0,0,n);
        return l;
    }
    public static void backtrack(List<String> l,String s,int open,int close,int n){
        if(open==n&&close==n){
            l.add(s);
            return;
        }
        if(open<n) backtrack(l,s+"(",open+1,close,n);
        if(close<open) backtrack(l,s+")",open,close+1,n);
    }
}