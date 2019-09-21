package com.example.demo;

/**
 * Created by dmoo on 9/4/2019.
 */
public class RemoveDuplicates  {

    public static void main(String[] args){

        int[] nums = new int[] { 0,0,0,0,0, 1 ,1, 2, 2, 3, 3,3,3, 4};
        RemoveDuplicatse(nums);
    }

    public static int RemoveDuplicatse(int[] nums){

        if(nums.length == 0) return 0;

        int i = 0;

        for(int j = 1; j < nums.length; j++){

            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
