class Solution {
    public int trap(int[] height) {

        int left = 0;
        int right = height.length - 1;

        int leftMax = 0;
        int rightMax = 0;

        int water = 0;

        while (left < right) {

            // Process the smaller side
            if (height[left] < height[right]) {

                // Update maximum wall on the left
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    // Water trapped at current position
                    water += leftMax - height[left];
                }

                left++;

            } else {

                // Update maximum wall on the right
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    // Water trapped at current position
                    water += rightMax - height[right];
                }

                right--;
            }
        }

        return water;
    }
}