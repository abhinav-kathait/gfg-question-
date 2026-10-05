class Solution {
    String modify(String s) {
        char ch = s.charAt(0);
        if(ch>='A'&&ch<='Z'){
           return s.toUpperCase();
        }
        else{
            return s.toLowerCase();
        }
    }
}