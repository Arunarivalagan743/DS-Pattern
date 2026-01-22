package Subset;


import java.util.ArrayList;
import java.util.List;

public class subset {
    public static void main(String[] args) {
        int nums[] =  {1,2,3};
        List<List<Integer>> bl = new ArrayList<>();
        per(0,nums,new ArrayList<>(),bl);
        System.out.println(bl);
    }
    static void per(int i ,int nums[], ArrayList<Integer> al, List<List<Integer>> bl)
    {
        if(i == nums.length)
        {
            bl.add(new ArrayList<>(al));

            return;
        }
  al.add(nums[i]);
        per(i+1,nums,al,bl);
        al.remove(al.size() -1);
        per(i +1,nums,al,bl);


    }
}
