class Solution {
    public static boolean isPalinArray(int[] arr) {
        int n = arr.length;
        for(int i = 0 ; i < n ; i++){
            int temp = arr[i];
            int x = 0 ;
            while(temp!=0){
                x = x*10 + (temp%10);
               temp = temp / 10;
            }
            if(arr[i]!=x) return false ;
        }
        return true;
    }
}