package com.rodmccutcheon.lesson4countingelements;

public class FrogRiverOne {

    public int solution(int X, int[] A) {
        int gapsRemaining = X;
        int[] count = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            if (count[A[i]-1] == 0) {
                count[A[i]-1] = 1;
                gapsRemaining--;
            }

            if (gapsRemaining == 0) {
                return i;
            }
        }
        return -1;
    }
}
