package Anagrams;

import java.util.Scanner;

public class Solution {

    static int count(Character letter, String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter)
                count++;
        }
        return count;
    }

    static boolean isAnagram(String a, String b) {

        if (a.length() != b.length())
            return false;

        String aLowerCase = a.toLowerCase();
        String bLowerCase = b.toLowerCase();
        int aCount = 0;
        int bCount = 0;

        for (int i = 0; i < a.length(); i++) {
            aCount = count(aLowerCase.charAt(i), aLowerCase);
            bCount = count(aLowerCase.charAt(i), bLowerCase);

            if (bCount != aCount) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = "anagram";
        String b = "margana";
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}