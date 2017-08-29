package com.rodmccutcheon.lesson5prefixsums;

public class MinAvgTwoSlice {

    public int solution(int[] A) {
        int minIndex = -1;
        int minAverage = 100001;
        for (int i = 1; i < A.length; i++) {
            // minAverage must be slice of length 2 or 3
            if (A[i - 1] + A[i] < minAverage) {
                minIndex = i - 1;
                minAverage = A[i - 1] + A[i];
            }
        }
        return minIndex;
    }
}
