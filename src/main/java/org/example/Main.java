package org.example;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(checkForPalindrome("I did, did I?"));
    }


    public static boolean checkForPalindrome(String word)
    {
        //Yazdırdığın harfleri tersten de yazdırıp ilk yazdırdığın ile aynı mı ona bakacaksın.
        String normalWord = "";
        String reverseWord = "";

        word = word.toLowerCase(Locale.ENGLISH).replaceAll("[^a-zA-Z]","");
        String[] letters = word.split("");
        for (int i = 0; i < letters.length; i++) {
            normalWord += letters[i];
        }

        for (int i = letters.length -1 ; i >= 0; i--) {
            reverseWord += letters[i];
        }

        return normalWord.equals(reverseWord);
    }

    public static String convertDecimalToBinary(int number)
    {
        number = number < 0 ? Math.abs(number) : number;

        List<String> binaryNum = new ArrayList<>();

        while (number != 0)
        {
            binaryNum.add(number % 2+"");
            number = number / 2;
        }

        String reverseBinary = "";

        for (int i = binaryNum.size()-1; i >= 0; i--) {
            reverseBinary += binaryNum.get(i);
        }

        return reverseBinary;


    }
}