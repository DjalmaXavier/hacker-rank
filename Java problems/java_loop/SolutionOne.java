package java_loop;

import java.util.*;

//First solution (Using pow)
class Solution {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int total = a + ((int) Math.pow(2, 0) * b);
            System.out.print(total + " ");

            for (int j = 1; j < n; j++) {
                total += (int) Math.pow(2, j) * b;
                System.out.print(total + " ");
            }

            System.out.println();

        }
        in.close();
    }
}