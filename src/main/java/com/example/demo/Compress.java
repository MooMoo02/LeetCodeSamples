package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dmoo on 8/8/2019.
 */
public class Compress{


    public static void main(String... strings) throws Exception {

//        char[] chars = new char[]{'a','a','b','b','c','c','c'};
        //char[] chars = new char[]{'a','a','b','b','b','b','b','b','b','b','b','b','b','b','b','b','b'};

        String s = "abcccddeeeeea";

        Compress c = new Compress();
        c.compress(s);
    }

    private void compress(String s){

        char[] chars = s.toCharArray();

        String out = "";
        int sum = 1;

        for(int i = 0; i < chars.length - 1; i++){
            if(chars[i] == chars[i+1]){
                sum += 1;
            }else{
                out = out + chars[i] +  sum;
                sum = 1;
            }
        }

        out = out + chars[chars.length - 1] + sum;


        System.out.println(out);
    }

    private void compressInplace(char[] chars){
        int anchor = 0, write = 0;
        for (int read = 0; read < chars.length; read++) {
            if (read + 1 == chars.length || chars[read + 1] != chars[read]) {
                chars[write++] = chars[anchor];
                if (read > anchor) {
                    for (char c: ("" + (read - anchor + 1)).toCharArray()) {
                        chars[write++] = c;
                    }
                }
                anchor = read + 1;
            }
        }
        System.out.println(write);
    }
}
