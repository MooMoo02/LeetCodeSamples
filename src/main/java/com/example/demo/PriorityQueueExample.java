package com.example.demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * Created by dmoo on 9/17/2019.
 */
public class PriorityQueueExample {

    public static void main(String[] args){

//        int[] nums = new int[]{1,1,1,2,3,9,9,9,9,9,8};
        int[] nums = new int[]{1,2,3,3,3,4,5,6,7,8,8,9,9,9,1000,1,1,1,1};
//        int[] nums = new int[]{1,1,1,2,2,3};
        Map<Integer,Integer> numMap = new HashMap<Integer, Integer>();

        for(int i : nums){
            numMap.put(i , numMap.getOrDefault(i,0) + 1);
        }

//        PriorityQueue<Integer> pq =   new PriorityQueue<Integer>();
        PriorityQueue<Integer> pq =   new PriorityQueue<Integer>((n1, n2) -> numMap.get(n1) - numMap.get(n2));
//        PriorityQueue<Integer> pq =   new PriorityQueue<Integer>(new PriorityQueueComparator(numMap));
        for(int i : numMap.keySet()){
            pq.add(i);
        }

        // Creating empty priority queue
        PriorityQueue<Integer> pQueue =
                new PriorityQueue<>();

        // Adding items to the pQueue using add()
//            pQueue.add(5);
//            pQueue.add(8);
//            pQueue.add(3);
//            pQueue.add(7);
//            pQueue.add(1);
////            pQueue.add(10);
//        pQueue.add(6);
//        pQueue.add(2);

//        pQueue.add("123");
//        pQueue.add("xC");
//        pQueue.add("zxcdC");
//        pQueue.add("C");
//        pQueue.add("C++");
//        pQueue.add("Java");
//        pQueue.add("Python");

        // Printing the most priority element
//        System.out.println("Head value using peek function:"
//                + pQueue.peek());

//        // Printing all elements
//        System.out.println("The queue elements:");
//        Iterator itr = pQueue.iterator();
//        while (itr.hasNext())
//            System.out.println(itr.next());
//
        // Removing the top priority element (or head) and
        // printing the modified pQueue using poll()
//        System.out.println("POLL:" + pQueue.poll());
        System.out.println("After removing an element" +
                "with poll function:");
        Iterator<Integer> itr2 = pq.iterator();
        while (itr2.hasNext())
            System.out.println("POLL:" + pq.poll());
//            System.out.println(itr2.next());
//
        // Removing Java using remove()
//        pQueue.remove("Java");
//        System.out.println("after removing Java with" +
//                " remove function:");
//        Iterator<Integer> itr3 = pQueue.iterator();
//        while (itr3.hasNext())
//            System.out.println(itr3.next());
//
//        // Check if an element is present using contains()
//        boolean b = pQueue.contains("C");
//        System.out.println ( "Priority queue contains C " +
//                "or not?: " + b);
//
//        // Getting objects from the queue using toArray()
//        // in an array and print the array
//        Object[] arr = pQueue.toArray();
//        System.out.println ( "Value in array: ");
//        for (int i = 0; i<arr.length; i++)
//            System.out.println ( "Value: " + arr[i].toString()) ;
    }
}
