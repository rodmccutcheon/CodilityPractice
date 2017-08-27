package com.rodmccutcheon.lesson5prefixsums;

public class PassingCars {

    int solution(int A[], int N) {
        int[] prefixSums = new int[N];
        int carsTravellingEast = 0;
        for (int i = 1; i < N; i++) {
            if (A[i - 1] == 0) {
                carsTravellingEast++;
            }
            prefixSums[i] = prefixSums[i - 1] + (A[i] * carsTravellingEast);
        }
        return prefixSums[N - 1];
    }
}
