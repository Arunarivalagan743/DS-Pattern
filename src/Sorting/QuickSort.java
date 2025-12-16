package Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int a[] ={99,7,6,5,4,3,2,1,3,23,1};
        quick(a,0,a.length);
        System.out.println(Arrays.toString(a));
    }
    public static void quick(int a[],int l,int h)
    {
        if(l<h)
        {
            int pivot =par(a,l,h - 1); //taking partion to pick pivot
            quick(a,0,pivot -1); //using pivoit to divide the oartition recurivly as two left and right by two methods
            quick(a,pivot+1,h);
        }
    }
    public static int par(int a[],int l,int h)
    {
        int pivot = a[h]; //intially taking a last elemnt as pivot to compare the elment to low to high -1;
        int i  = l -1; //why? means to swap as first elamnt so start wiyj low -   1 means it be suppose to swap with next elamt which less than pivot

        for(int j  =  l;j<=h -1;j++) //startiing with low to high -1 .why high 1 means avoud the pivot elambt swap
        {
            if(a[j]<pivot) //making the arry use of pivot to make left side as less than pivot and finllay automaticlly it arrage in the right as greater tahn pivot
            {
                i++; //if less tahn swap;
                swap(a,i,j);
            }
        }
        swap(a,i+1,h); //for returing the pivot elamnt index so swap with h is pivot elemnst swap with where be low be ends ,out the next index as pivot elemnt to tell the partion to return to the partion by low + 1 as i +  1
        return i+1; //return the pivot index
    }
    public static  void swap(int a[],int i,int j)
    {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
