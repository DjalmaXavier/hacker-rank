package palindrome;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */

        List<Character> ls = new ArrayList<>();
        for (int i = 0; i < A.length(); i++) {
            ls.add(A.charAt(i));
        }
        boolean check = check(ls);

        if (check) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

    private static boolean check(List<Character> ls) {
        for (int i = 0; i < ls.size(); i++) {

            if (!ls.get(i).equals(ls.get((ls.size() - 1) - i))) {
                return false;
            }
        }
        return true;
    }
}
