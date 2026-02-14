package Array.Basics;

public class ArrayIsSorted {
    public static void main(String[] args) {
        int a[] ={1,2,3,5,4};
        System.out.println(arrayIsSorted(a));


    }
    public static boolean arrayIsSorted(int[] a) {
        int i  =0;
        int j  = 1;
        while(j<a.length) {
            if(a[i]<a[j]) {
                i++;
                j++;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
