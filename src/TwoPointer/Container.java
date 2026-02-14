package TwoPointer;

class Conatiner {
    public static int max(int[] height) {

        int left = 0;
        int right = height.length - 1;
        int max = 0;

        while (left < right) {

            int h = Math.min(height[left], height[right]);
            int w = right - left;

            int area = h * w;
            max = Math.max(max, area);


            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
//1,8,6,2,5,4,8,3,7 => 49
        return max;
    }

    static void main() {
        int a[] = new int []{1,8,6,2,5,4,8,3,7};
        int k  =max(a);
        System.out.println(k);
    }
}
