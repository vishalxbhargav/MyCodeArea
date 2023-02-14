package Recursion;

import java.util.ArrayList;

public class MergSortByUsingRecursion {
    public static void insert(ArrayList<Integer> nums,int temp){
        if(nums.size()==0||nums.get(nums.size()-1)<=temp){ 
            nums.add(temp);
            return;
        }
        int val=nums.get(nums.size()-1);
        nums.remove(nums.size()-1);
        insert(nums, temp);
        nums.add(val);
    }
    public static void sort(ArrayList<Integer> nums){
        if(nums.size()==1) return;
        int temp = nums.get(nums.size()-1);
        nums.remove(nums.size()-1);
        sort(nums);
        insert(nums, temp);

    }
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(0);
        nums.add(1);
        nums.add(5);
        nums.add(9);
        nums.add(2);
        nums.add(4);
        nums.add(3);
        sort(nums);
        // for(int i=0;i<nums.size();i++){
        //     System.out.println(nums.get(i)+" ");
        // }
        System.out.println(nums);
    }
}
