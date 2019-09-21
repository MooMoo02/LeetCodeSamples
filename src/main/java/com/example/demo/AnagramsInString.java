package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dmoo on 8/9/2019.
 */
//@Component
public class AnagramsInString implements CommandLineRunner{
    @Override
    public void run(String... strings) throws Exception {

//        String s = "cbaebabacd";
//        String p = "abc";

        String s = "anagram";
        String p = "nagarae";

//        String s = "baa";
//        String p = "aa";

        isAnagram(s,p);

    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] counter = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int index1 = s.charAt(i) - 'a';
            int index2 =t.charAt(i) - 'a';
            counter[index1]++;
            counter[index2]--;
        }
        for (int count : counter) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }

    public void isAnagram1(String s, String p){
        List<Integer> results = new ArrayList<Integer>();

        for(int i = 0; i < s.length() - 1; i++){

            char[] temp = p.toCharArray();
            int x = i;
            int z = i + p.length() - 1;

            if(z > s.length() - 1) break;

            while(x <= z){

                char c = s.charAt(x);

                int index = p.indexOf(c);

                if( index == -1 ) break;

                if(temp[index] == ' ') break;

                temp[index] = ' ';

                if(x == z)
                    results.add(i);

                x++;
            }
        }
        System.out.println();
    }
}
