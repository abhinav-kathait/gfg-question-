class Solution {
    public static int findEquilibrium(int arr[]) {
        int tsum = 0 ;
        for(int ele:arr){
            tsum+=ele;
        }
        int leftsum = 0;
        for(int i = 0 ; i < arr.length ; i++ ){
            int rigthsum = tsum-leftsum-arr[i];
            if(rigthsum==leftsum) return i ;
            leftsum += arr[i];
        }
        return -1 ;
    }
}
