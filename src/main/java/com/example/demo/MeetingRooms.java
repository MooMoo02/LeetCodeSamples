package com.example.demo;

import java.util.Arrays;

/**
 * Created by dmoo on 9/18/2019.
 */
public class MeetingRooms {

    public static void main(String[] args){

        Interval[] intervals = new Interval[2];

//        intervals[0] = new Interval(0,30);
//        intervals[1] = new Interval(5,10);
//        intervals[2] = new Interval(15,20);

        intervals[0] = new Interval(7,10);
        intervals[1] = new Interval(1,20);



//        intervals[0] = new Interval(0,7);
//        intervals[1] = new Interval(8,9);
//        intervals[2] = new Interval(15,20);

        System.out.println(scheduleEfficient(intervals));
    }

    public static boolean scheduleBruteForce(Interval[] intervals){

        for(int i = 0; i < intervals.length; i++){
            Interval interval1 = intervals[i];

            for(int x = i + 1; x < intervals.length; x++){
                Interval interval2 = intervals[x];

                if(interval1.start >= interval2.start && interval1.start < interval2.end ||
                        interval2.start >= interval1.start && interval2.start < interval1.end){
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean scheduleEfficient(Interval[] intervals){

        Arrays.sort(intervals,(i1,i2) -> i1.start - i2.start);

        for(int i = 0; i < intervals.length - 1; i++){

            if(intervals[i].end > intervals[i + 1].start)
                return false;
        }

        return true;
    }
}

class Interval{
    public int start;
    public int end;

    public Interval(int s, int e){
        start = s;
        end = e;
    }
}