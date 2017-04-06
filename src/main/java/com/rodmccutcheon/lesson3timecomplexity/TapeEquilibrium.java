package com.rodmccutcheon.lesson3timecomplexity;

import java.util.Arrays;

/**
 * Created by rodmccutcheon on 6/4/17.
 */
public class TapeEquilibrium {

    public int solution(int[] A) {
        int minDifference = -1;

        int rightSum = Arrays.stream(A).sum();
        int leftSum = 0;
        int currElem, currDifference;


        for (int i = 0; i < A.length - 1; i++) {
            currElem = A[i];
            leftSum += currElem;
            rightSum -= currElem;
            currDifference = Math.abs(rightSum - leftSum);
            if (minDifference == -1 || currDifference < minDifference) {
                minDifference = currDifference;
            }
        }

        return minDifference;
    }
}
