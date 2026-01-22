package Permutations;

import java.util.ArrayList;
import java.util.List;

public class permutation {
    public static void main(String[] args) {
        int nums[] =  {1,2,3};
        List<List<Integer>> bl = new ArrayList<>();
        per(nums,new ArrayList<>(),bl);
        System.out.println(bl);
    }
    static void per(int nums[], ArrayList<Integer> al, List<List<Integer>> bl)
    {
        if(nums.length ==  al.size())
        {
            bl.add(new ArrayList<>(al));

            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if(al.contains(nums[i])) continue;
            al.add(nums[i]);
            per(nums,al,bl);
            al.remove(al.size() -1);
        }
    }
}
