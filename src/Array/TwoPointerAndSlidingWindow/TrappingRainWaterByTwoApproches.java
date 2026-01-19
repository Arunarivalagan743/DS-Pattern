package Array.TwoPointerAndSlidingWindow;


public class TrappingRainWaterByTwoApproches {

    /* =====================================================
       APPROACH 1: PREFIX–SUFFIX MAX (O(N) Space)
       -----------------------------------------------------
       Idea:
       - Water at index i depends on:
         min(max height on left, max height on right) - height[i]
       - Precompute right max (suffix array)
       - Maintain left max dynamically
       Time  : O(N)
       Space : O(N)
    ====================================================== */
    public int trapPrefixSuffix(int[] height) {

        int n = height.length;

        // Suffix max array
        int[] sufMax = new int[n];

        // Last element has no right, so it is its own max
        sufMax[n - 1] = height[n - 1];

        // Build suffix max from right to left
        for (int i = n - 2; i >= 0; i--) {
            sufMax[i] = Math.max(sufMax[i + 1], height[i]);
        }

        int leftMax = 0; // maximum height seen from left
        int total = 0;   // total trapped water

        // Traverse from left to right
        for (int i = 0; i < n; i++) {

            // Update left maximum
            leftMax = Math.max(leftMax, height[i]);

            // Calculate water at current index
            int water = Math.min(leftMax, sufMax[i]) - height[i];

            // Add only positive water
            if (water > 0) {
                total += water;
            }
        }

        return total;
    }

    /* =====================================================
       APPROACH 2: TWO POINTER (O(1) Space — OPTIMAL)
       -----------------------------------------------------
       Idea:
       - Use two pointers from both ends
       - Always move the pointer with smaller height
       - Water is limited by the smaller boundary
       Time  : O(N)
       Space : O(1)
    ====================================================== */
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
        // return trapPrefixSuffix(height); // Alternative
    }
}
