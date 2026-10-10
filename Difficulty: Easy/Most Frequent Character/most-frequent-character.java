class Solution {
    public static char getMaxOccuringChar(String s) {
        
        // brute froce
        
        
        int n = s.length();
        int maxFreq = -1;                
        char ans = s.charAt(0);
        for(int i = 0 ; i<n ; i++){
            int freq = 0 ;
            char ch = s.charAt(i);
            for(int j = i ; j < n ; j++ ){
                if(ch==s.charAt(j)){
                    freq++;
                }
            }
            if(freq>maxFreq){
                maxFreq=freq;
                ans = ch;
            }
            else if(freq==maxFreq&&ch<ans){
                ans = ch;
            }
        }
        return ans;
        
        
        
        // char [] arr1 = s.toCharArray();
        // Arrays.sort(arr1);
        
    }
}