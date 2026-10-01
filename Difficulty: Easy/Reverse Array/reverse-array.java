class Solution {
    public void reverseArray(int arr[]) {
        int n = arr.length;
        ArrayList<Integer>ans= new ArrayList<>();
        for (int i = n - 1; i >= 0; i--) {
            ans.add(arr[i]);
        }
        for (int i = 0; i < n; i++) {
                    arr[i] = ans.get(i);
                }
    }
}