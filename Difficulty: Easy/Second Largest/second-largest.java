class Solution {
    public int getSecondLargest(int[] arr) {
      int n = arr.length ;
      int max = Integer.MIN_VALUE;
      for(int i = 0 ; i < n ; i++){
          if(arr[i]>max) max = arr[i];
      }
      int s_max = -1 ;
      for(int i = 0 ; i < n ; i++){
          if(arr[i]>s_max&&arr[i]!=max) s_max=arr[i];
      }
      return s_max ;
      
    }
}