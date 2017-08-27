package com.rodmccutcheon.lesson5prefixsums;

public class PassingCars {

    public static final int MAX_PAIRS = 1_000_000_000;

    int solution(int A[]) {
        int[] prefixSums = new int[A.length];
        int carsTravellingEast = 0;
        for (int i = 1; i < A.length; i++) {
            if (A[i - 1] == 0) {
                carsTravellingEast++;
            }
            prefixSums[i] = prefixSums[i - 1] + (A[i] * carsTravellingEast);
            if (prefixSums[i] > MAX_PAIRS) {
                return -1;
            }
        }
        return prefixSums[A.length - 1];
    }
}
