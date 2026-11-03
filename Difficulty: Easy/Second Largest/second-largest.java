class Solution {
    public int getSecondLargest(int[] arr) {
      int max = Integer.MIN_VALUE;
      int s_max = Integer.MIN_VALUE;
      for(int i = 0 ; i < arr.length ; i++){
          if(arr[i]>max) max = arr[i];
      }
      for(int i = 0 ; i < arr.length ; i++ ){
          if(arr[i]>s_max && max!=arr[i]) s_max = arr[i];
          
      }
      if(s_max == Integer.MIN_VALUE) return -1;
      return s_max ;
    }
}