package com.example.demo;


/**
 * Created by dmoo on 9/10/2019.
 */
public class UniqueCharacters {

    public static void main(String[] args){

        String testCase1 = "a";
        String testCase2 = "";
        String testCase3 = null;
        String testCase4 = "AabBcDdeEf";
        String testCase5 = "AabBcDdeEfA";
        String testCase6 = "123zZzAabBcDdeEfA";
        String testCase7 = "1230987654";

        System.out.println(isUnique(testCase1));
        System.out.println(isUnique(testCase2));
        System.out.println(isUnique(testCase3));
        System.out.println(isUnique(testCase4));
        System.out.println(isUnique(testCase5));
        System.out.println(isUnique(testCase6));
        System.out.println(isUnique(testCase7));

    }

    public static boolean isUnique(String string){

        if(string == null || string.isEmpty() ) return false;

        boolean[] values = new boolean[127];

        for(int i = 0; i < string.length(); i++){

            int c = string.charAt(i);

            if(values[c]) return false;
            else{
                values[c] = true;
            }
        }
        return true;
    }
}
