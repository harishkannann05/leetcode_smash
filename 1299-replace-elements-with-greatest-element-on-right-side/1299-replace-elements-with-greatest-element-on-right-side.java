class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int maxRight = -1;   // last element will become -1
        
        for (int i = n - 1; i >= 0; i--) {
            int current = arr[i];  // keep original value
            arr[i] = maxRight;     // replace with max on right
            if (current > maxRight) {
                maxRight = current;   // update max
            }
        }
        
        return arr;
    }
}