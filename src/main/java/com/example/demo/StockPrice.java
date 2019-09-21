package com.example.demo;

/**
 * Created by dmoo on 9/12/2019.
 */
public class StockPrice {

    public static void main(String[] args){

//        int[] nums = new int[]{2,1,4};
        int[] nums = new int[]{7,1,5,3,6,4};

        System.out.println(maxProfit2(nums));
    }

    public static int maxProfit(int[] prices) {

        int max = 0;

        for(int i = 0; i < prices.length; i++){
            for(int x = i + 1; x < prices.length; x++){

                int profit = prices[x] - prices[i];
                max = Math.max(profit, max);
            }
        }

        return max;
    }

    public static int maxProfit2(int[] prices) {

        int min = Integer.MAX_VALUE;
        int max = 0;

        for(int i = 0; i < prices.length; i++){

            if(prices[i] < min){
                min = prices[i];
            }else{
                max = Math.max(max, prices[i] - min);
            }
        }

        return max;
    }
}
