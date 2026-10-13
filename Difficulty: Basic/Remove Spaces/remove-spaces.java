class Solution {
    public String removeSpaces(String s) {
        String ans = "";
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i)!=' '){
                ans+=s.charAt(i);
            }
        }
        return ans;
    }
}