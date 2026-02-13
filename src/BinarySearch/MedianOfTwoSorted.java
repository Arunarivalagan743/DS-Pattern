package BinarySearch;

public class MedianOfTwoSorted {
    static void main(String args[]) {
        int a[] = {1,2,3,4,5};
        int b[] = {6,7,8,9,10};
        //1 2 3 4 5 6  7 8 9 10  n log n  spaceo (n +m)
        //res of final array is even means
//        int mid =  (a.length +  b.length ) /2;
//        int tot = (a.length +  b.length );
//       int count = 0;
//       int i  =0;
//       int j =0;
//       int m1 =-1;
//       int m2 =-1;
//       while(count<=mid)
//       {
//           m2 =  m1;
//           if(i< a.length && (j>=b.length || a[i] < b[j]) )
//           {
//               m1 =  a[i];
//               i++;
//           }
//           else{
//               m1 = b[j];
//               j++;
//           }
//           count++;
//       }
//       if(tot % 2  == 1)
//       {
//           System.out.println(m1);
//
//       }else {
//           System.out.println((m1+m2 )/ 2.0);
//           Time	O(n + m)
//            Space	O(1)
//       }

    }
    static class Solution {

        public double findMedianSortedArrays(int[] nums1, int[] nums2) {

            // Always apply binary search on smaller array
            if (nums1.length > nums2.length) {
                return findMedianSortedArrays(nums2, nums1);
            }

            int n1 = nums1.length;
            int n2 = nums2.length;

            int low = 0;
            int high = n1;

            int tot = n1 + n2;

            while (low <= high) {

                int cut1 = (low + high) / 2;
                int cut2 = (tot + 1) / 2 - cut1;

                int l1 = (cut1 == 0) ? Integer.MIN_VALUE : nums1[cut1 - 1];
                int r1 = (cut1 == n1) ? Integer.MAX_VALUE : nums1[cut1];

                int l2 = (cut2 == 0) ? Integer.MIN_VALUE : nums2[cut2 - 1];
                int r2 = (cut2 == n2) ? Integer.MAX_VALUE : nums2[cut2];

                // Correct partition
                if (l1 <= r2 && l2 <= r1) {

                    // Odd total length
                    if (tot % 2 == 1) {
                        return Math.max(l1, l2);
                    }

                    // Even total length
                    return (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;
                }

                // Move left
                else if (l1 > r2) {
                    high = cut1 - 1;
                }

                // Move right
                else {
                    low = cut1 + 1;
                }
            }

            return 0.0;
        }

        // MAIN METHOD TO TEST
        public static void main(String[] args) {

            int a[] = {1,2,3,4,5};
            int b[] = {6,7,8,9,10};

            Solution s = new Solution();

            double ans = s.findMedianSortedArrays(a, b);

            System.out.println("Median = " + ans);
        }
    }

}
