package com.example.demo;

/**
 * Created by dmoo on 9/14/2019.
 */
public class RobHouse {

    public static void main(String[] args){

        //int[] nums = new int[]{1,2,3,1};

//        int[] nums = new int[]{2,7,9,3,1};

        int[] nums = new int[]{2,1,1,2};
        System.out.println(rob(nums));
    }

    public static int rob(int[] nums){

        if (nums == null || nums.length == 0){
            return 0;
        }

        if(nums.length == 1){
            return nums[0];
        }

        if(nums.length == 2){
            return Math.max(nums[0],nums[1]);
        }

        int[] temp = new int[nums.length];

        temp[0] = nums[0];
        temp[1] = Math.max(nums[0],nums[1]);

        for(int i = 2; i < temp.length; i++){

            temp[i] = Math.max(nums[i] + temp[i - 2], temp[i-1]);
        }

        return temp[nums.length - 1];
    }
}
