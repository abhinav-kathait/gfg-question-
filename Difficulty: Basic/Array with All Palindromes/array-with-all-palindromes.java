class Solution {
    public static boolean isPalinArray(int[] arr) {
      for(int i = 0 ; i < arr.length ; i++){
          int num = arr[i];
          int x = 0 ; 
          while(num != 0 ){
              x  = x * 10 + (num % 10);
              num = num / 10;
          }
          if(x!=arr[i]) return false ;
      }
      return true;
    }
}