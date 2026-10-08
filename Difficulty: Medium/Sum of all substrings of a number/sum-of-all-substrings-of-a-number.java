class Solution {
    public static int sumSubstrings(String s) {
        int sum = 0 ;
        for(int i = 0 ; i < s.length() ; i++ ){
            int n = 0;
            for(int j = i ; j < s.length() ; j++){
                n = n*10+(s.charAt(j) - '0'); // i*10 will give the tens and hunderd value and the other will give oine value
                sum+=n;
            }
        }
        return sum ;
    }
}