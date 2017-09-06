package com.rodmccutcheon.lesson6sorting;

public class Distinct {

    public int solution(int[] A) {
        int counter = 0;
        int prev = 1_000_001;
        for (int a : A) {
            if (a != prev) {
                counter++;
            }
            prev = a;
        }
        return counter;
    }
}
