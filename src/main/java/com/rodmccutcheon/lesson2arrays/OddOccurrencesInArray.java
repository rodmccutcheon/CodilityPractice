package com.rodmccutcheon.lesson2arrays;

import java.util.Arrays;

/**
 * Created by rodmccutcheon on 30/3/17.
 */
public class OddOccurrencesInArray {

    public int solution(int[] A) {
        Arrays.sort(A);

        int occurrences = 0;
        int previousInt = -1;

        for (int currentInt : A) {
            // If its the first int, or the same as the previous int, increment the number of occurrences
            if (previousInt == -1 || currentInt == previousInt) {
                occurrences++;
            } else {
                // Check if there was an odd number of occurrences
                if (occurrences % 2 == 1) {
                    return previousInt;
                }

                occurrences = 1;
            }

            previousInt = currentInt;
        }

        return previousInt;
    }

}
