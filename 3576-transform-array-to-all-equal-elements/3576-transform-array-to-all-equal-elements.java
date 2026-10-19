class Solution {
    public boolean canMakeEqual(int[] arr, int k) {
        return helper(1, k,  arr) || helper(-1, k, arr);
    }

    private boolean helper(int num, int k, int[] arr) {
        int count = 0, curr = arr[0];
        for(int i = 0; i < arr.length-1; i++) {
            if(curr != num) {
                count++;
                curr = -arr[i+1];
            }
            else {
                curr = arr[i+1];
            }
        }
        return curr == num && count <= k;
    }
}