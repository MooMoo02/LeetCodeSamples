package com.example.demo;

import java.util.Comparator;
import java.util.Map;

/**
 * Created by dmoo on 9/18/2019.
 */
public class PriorityQueueComparator implements Comparator<Integer> {

    private Map<Integer,Integer> numMap;

    public PriorityQueueComparator(Map<Integer,Integer> numMap){
        this.numMap = numMap;
    }

    @Override
    public int compare(Integer o1, Integer o2) {
//        int result = o1 - o2;
        int result = numMap.get(o1) - numMap.get(o2);
        return result;
    }
}
