package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by dmoo on 8/3/2019.
 */
//@Component
public class DuplicateInArray implements CommandLineRunner{
    @Override
    public void run(String... strings) throws Exception {
        method2();
    }

    private void method1(){
        int[] nums = new int[]{2, 1, 3, 2, 4, 1};

        for(int i = 0; i < nums.length; i++){

            if(nums[Math.abs(nums[i])] > 0){
                nums[Math.abs(nums[i])] = -nums[Math.abs(nums[i])];
            }else{
                System.out.println(Math.abs(nums[i]) + " is a duplicate.");
            }
        }
    }

    private void method2(){

        int[] nums = new int[]{2, 1, 3, 2, 4, 1};

        Set<Integer> numSet = new HashSet<Integer>();

        for(int i = 0; i < nums.length;i++){

            int num = nums[i];
            if(numSet.contains(num)){
                System.out.println(num + " is a duplicate.");
            }else{
                numSet.add(num);
            }
        }
    }
}
