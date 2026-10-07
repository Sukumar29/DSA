class Solution {
    Set<String> ans=new HashSet<>();
    public List<String> removeInvalidParentheses(String s) {
        int left=0;
        int right=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                left++;
            }
            else if(ch==')'){
                if(left>0){
                    left--;
                }
                else{
                    right++;
                }
            }
        }
        dfs(s,0,left,right);
        return new ArrayList<>(ans);
    }
    void dfs(String s,int index,int left,int right){
        if(left==0&&right==0){
            if(valid(s)){
                ans.add(s);
            }
            return;
        }
        for(int i=index;i<s.length();i++){
            if(i>index&&s.charAt(i)==s.charAt(i-1)){
                continue;
            }
            if(left>0&&s.charAt(i)=='('){
                String newStr=s.substring(0,i)+s.substring(i+1);
                dfs(newStr,i,left-1,right);
            }
            if(right>0&&s.charAt(i)==')'){
                String newStr=s.substring(0,i)+s.substring(i+1);
                dfs(newStr,i,left,right-1);
            }
        }
    }
    boolean valid(String s){
        int count=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                count++;
            }
            else if(ch==')'){
                count--;
                if(count<0){
                    return false;
                }
            }
        }
        return count==0;
    }
}