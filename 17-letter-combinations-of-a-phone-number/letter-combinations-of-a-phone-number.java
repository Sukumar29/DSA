class Solution {
    String[] letters = {
        "", "", "abc", "def", "ghi","jkl", "mno", "pqrs", "tuv", "wxyz"
    };
    public List<String> letterCombinations(String digits) {
        List<String> result=new ArrayList<>();
        if(digits.length()==0){
            return result;
        }
        solve(digits,0,new StringBuilder(),result);
        return result;
    }
    private void solve(String digits,int index,StringBuilder current,List<String> result){
        if(index==digits.length()){
            result.add(current.toString());
            return;
        }
        int digit=digits.charAt(index)-'0';
        String chars=letters[digit];
        for(char c:chars.toCharArray()){
            current.append(c);
            solve(digits,index+1,current,result);
            current.deleteCharAt(current.length()-1);
        }
    }
}