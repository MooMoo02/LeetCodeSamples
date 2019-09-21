package com.example.demo;

import java.util.HashSet;

/**
 * Created by dmoo on 9/16/2019.
 */
public class IntersectionOfArrays {

    public static void main(String[] args){

//        int[] nums1 = new int[]{4,9,5};
//        int[] nums2 = new int[]{9,4,9,8,4};
        int[] nums1 = new int[]{1,2,2,1};
        int[] nums2 = new int[]{2,2};

        intersection(nums1, nums2);
    }

    public static int[] intersection(int[] nums1, int[] nums2) {

        int[] answer = null;
        int count = 0;

        if(nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0)
            return answer;

        HashSet<Integer> hashNums = new HashSet<Integer>();

        if(nums1.length > nums2.length){
            hashNums = getHashSet(nums2);
            answer = getAnswer(hashNums, nums1);
        }
        else {
            hashNums = getHashSet(nums1);
            answer =getAnswer(hashNums, nums2);
        }

        return answer;
    }

    public static int[] getAnswer(HashSet<Integer> hashNums, int[] nums){

        int[] answer = new int[hashNums.size()];
        int index = 0;
        for(Integer num : nums){
            if(hashNums.contains(num) && index < hashNums.size()){
                answer[index] = num;
                index++;
            }
        }
        return answer;
    }

    public static HashSet<Integer> getHashSet(int[] nums){
        HashSet<Integer> hashNums = new HashSet<Integer>();
        for(Integer num : nums){
            hashNums.add(num);
        }
        return hashNums;
    }
}
