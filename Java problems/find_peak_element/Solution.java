package find_peak_element;

import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

        List<Integer> ls = Arrays.asList(1, 2, 9, 7, 2, 10, 8);

        checkValue(ls);

    }

    private static void checkValue(List<Integer> ls) {

        int actualPeak = 0;

        for (int i = 0; i < ls.size(); i++) {
            int currenteNumber = ls.get(i);

            int leftNumber = 0;
            int rightNumber = 0;

            // Verify if left number exist
            if (leftNumber != i) {
                leftNumber = ls.get(i - 1);
            }

            // Verify if right number exist
            try {
                rightNumber = ls.get(i + 1);
            } catch (Exception e) {
                rightNumber = ls.get(i);
            }

            if (currenteNumber > rightNumber && currenteNumber > leftNumber) {
                if (currenteNumber > actualPeak) {
                    actualPeak = currenteNumber;
                }
            }
        }
        System.out.println(actualPeak);
    }
}
