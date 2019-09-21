package com.example.demo;

/**
 * Created by dmoo on 9/14/2019.
 */
public class RotateArray {

    public static void main(String[] args){

        //int[] nums = new int[]{-1};
        int[] nums = new int[]{1,2,3,4,5,6,7};

        int k = 3;

        rotateLeft(nums,k);
    }

    public static void rotateRight(int[] nums, int k){
        if(k > nums.length){
            k = k%nums.length;
        }

        int[] temp = new int[k];

        //get the values
        int x = 0;
        for(int i = nums.length - k; i < nums.length; i++){
            temp[x] = nums[i];
            x++;
        }

        for(int i = nums.length - 1 - k; i >= 0; i--){

            nums[i + k] = nums[i];
        }

        for(int i = 0; i < k; i++){
            nums[i] = temp[i];
        }
    }

    public static void rotateLeft(int[] nums, int k){
        if(k > nums.length){
            k = k%nums.length;
        }

        int[] temp = new int[k];

        //get the values
        for(int i = 0; i < k; i++){
            temp[i] = nums[i];
        }

        for(int i = 0; i <= k; i++){

            nums[i] = nums[i+k];
        }

        for(int i = 0; i < k; i++){
            nums[i + k + 1] = temp[i];
        }
    }
}
