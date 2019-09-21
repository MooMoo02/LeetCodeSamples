package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dmoo on 8/3/2019.
 */
//@Component
public class MaxSubarray implements CommandLineRunner {

    @Override
    public void run(String... strings) throws Exception {

        int[] nums = new int[]{1, -2, 4, -10};
        int currentMax = nums[0], globalMax = nums[0];

        for(int i = 1; i < nums.length; i++){

            currentMax = Math.max(currentMax + nums[i], nums[i]);
            globalMax = Math.max(currentMax, globalMax);
        }

        System.out.println("max subarray: " + globalMax);
        System.out.println(Math.max(1,1));
    }
}
