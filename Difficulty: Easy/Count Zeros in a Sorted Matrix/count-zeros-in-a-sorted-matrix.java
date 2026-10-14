class Solution {
    public int countZeros(int[][] arr) {
        // code here
        int count = 0 ;
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[0].length ;j++){
                if(arr[i][j]==0) count++;
            }
        }
        return count;
        
    }
};