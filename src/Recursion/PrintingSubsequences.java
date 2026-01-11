package Recursion;

public class PrintingSubsequences {
    static  void subsq(int arr[],int id,int count,int sum,int k,String res)
    {
        if(id == arr.length)
        {
            if(sum ==  k) {
                System.out.println(res);
            }
            return;

        }
        subsq(arr,id+1,count+1,sum+arr[id],k,res+arr[id]);
        subsq(arr,id+1,count,sum,k,res);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,5};
        subsq(arr,0,0,0,6,"");
    }
}
