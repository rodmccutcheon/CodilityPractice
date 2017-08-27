package com.rodmccutcheon.lesson5prefixsums;

public class PassingCars {

    public static final int MAX_PAIRS = 1_000_000_000;

    int solution(int A[]) {
        int totalPassingCars = 0;
        int carsTravellingEast = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                carsTravellingEast++;
            } else {
                totalPassingCars += carsTravellingEast;
            }
            if (totalPassingCars > MAX_PAIRS) {
                return -1;
            }
        }
        return totalPassingCars;
    }
}
