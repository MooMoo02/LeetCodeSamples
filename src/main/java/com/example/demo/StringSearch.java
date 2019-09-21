package com.example.demo;

/**
 * Created by dmoo on 8/10/2019.
 */

public class StringSearch {

    public static void main(String[] args){

        String hayStack ="mississippi";

        String needle ="issipi";

        System.out.println(stringSearch(hayStack, needle));
    }

    public static int stringSearch(String haystack, String needle){

        if(needle == null || needle.isEmpty()) return 0;

        char[] charHaystack = haystack.toCharArray();
        char[] charNeedle = needle.toCharArray();

        if(charNeedle.length > charHaystack.length) return -1;

        for(int i = 0; i < charHaystack.length - (charNeedle.length - 1); i++){
            for(int x = 0; x < charNeedle.length; x++){

                char cH = charHaystack[i + x];
                char cN = charNeedle[x];

                if(cH != cN) break;
                if( x == charNeedle.length -1) return i;
            }
        }

        return -1;
    }
}
