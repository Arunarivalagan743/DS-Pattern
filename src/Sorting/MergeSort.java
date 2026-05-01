package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int a[] = {5,4,3,2,1};
        mergeSort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }
    public static void mergeSort(int a[], int low, int high) {

if(low < high)
{
    int mid  =  (low +  high) / 2;
    mergeSort(a,low,mid);
    mergeSort(a,mid+1,high);
    merge(a,low,mid,high);
}
    }
    static void merge(int a[],int l,int m,int e)
    {
      int mix [] =  new int[e -  l+1];
      int st  =  l;
      int end  =  m+1;
      int k  =0;
      while (st <=m && end <=e)
      {
          if(a[st] <= a[end])
          {
              mix[k] = a[st];
              st++;
          }
          else{
              mix[k] =  a[end];
              end++;
          }
          k++;
      }
      while (st <=m)
      {
          mix[k] = a[st];
          st++;
          k++;
      }
        while (end <=e)
        {
            mix[k] = a[end];
            end++;
            k++;
        }
        for (int i  = 0;i<mix.length;i++)
        {
            a[l+i] = mix[i];
        }
    }
}
