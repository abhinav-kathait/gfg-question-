class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        int n = arr.length;
        ArrayList<Integer>num=new ArrayList <Integer>();
        int rmax = 0 ;
        for(int i = n-1 ; i >= 0 ; i--){
            if(arr[i]>rmax){
                rmax = arr[i];
                num.add(arr[i]);
            }
            else if(arr[i]==rmax){
                num.add(arr[i]);
            }
        }
        Collections.reverse(num);
        return num ;
    }
}
