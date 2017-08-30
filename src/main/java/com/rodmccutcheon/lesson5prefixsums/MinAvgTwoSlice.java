package com.rodmccutcheon.lesson5prefixsums;

public class MinAvgTwoSlice {

    public int solution(int[] A) {
        int minIndex = -1;
        double minAverage = 100001;
        for (int i = 0; i < A.length - 1; i++) {
            // slice must be of length 2 or 3
            if ((A[i] + A[i + 1]) / 2.0 < minAverage) {
                minIndex = i;
                minAverage = (A[i] + A[i + 1]) / 2.0;
            }
            if ((i < A.length - 2) && ((A[i] + A[i + 1] + A[i + 2]) / 3.0 < minAverage)) {
                minIndex = i;
                minAverage = (A[i] + A[i + 1] + A[i + 2]) / 3.0;
            }
        }
        return minIndex;
    }
}
