package java_substring_comparasions;

public class Solution {

    public static void main(String[] args) {
        System.out.println(getSmallestAndLargest("welcometojava", 3));
    }

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);
        for (int i = 0; i <= s.length() - k; i++) {

            String subString = s.substring(i, k + i);

            // Check if the substring is greater than the actual smallest
            if (smallest.compareTo(subString) > 0) {
                smallest = subString;
            } else if (largest.compareTo(subString) < 0) {
                largest = subString;
            }
        }

        return smallest + "\n" + largest;
    }
}
