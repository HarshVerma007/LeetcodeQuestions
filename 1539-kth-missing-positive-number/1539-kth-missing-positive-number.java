class Solution {
    public int findKthPositive(int[] arr, int k) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] <= k) {
                k++;
                i++;
            } else {
                break;
            }
        }
        return k;
    }
}
