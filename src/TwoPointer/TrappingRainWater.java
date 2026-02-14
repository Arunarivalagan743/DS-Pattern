package TwoPointer;



public class TrappingRainWater {


    public int trapTwoPointer(int[] height) {

        int n = height.length;

        // Two pointers
        int left = 0;
        int right = n - 1;

        // Maximum height seen so far from both sides
        int leftMax = 0;
        int rightMax = 0;

        int total = 0; // total trapped water

        // Process until pointers meet
        while (left < right) {

            // Move the pointer with smaller height
            if (height[left] < height[right]) {

                // Water trapped on left side
                if (height[left] < leftMax) {
                    total += leftMax - height[left];
                }
                // Update left max
                else {
                    leftMax = height[left];
                }

                left++;
            }
            else {

                // Water trapped on right side
                if (height[right] < rightMax) {
                    total += rightMax - height[right];
                }
                // Update right max
                else {
                    rightMax = height[right];
                }

                right--;
            }
        }

        return total;
    }

    // =====================================================
    // LeetCode calls this method
    // Switch between approaches here
    // =====================================================
    public int trap(int[] height) {
        return trapTwoPointer(height);     // Optimal

    }
}
