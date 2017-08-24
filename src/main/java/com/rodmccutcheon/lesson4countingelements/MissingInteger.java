package com.rodmccutcheon.lesson4countingelements;

/**
 * Created by rodmccutcheon on 11/4/17.
 */
public class MissingInteger {

    public int solution(int[] A) {
        int[] B = new int[100001];
        for (int a : A) {
            if (a > 0 && a <= 100000) {
                B[a - 1] = 1;
            }
        }
        for (int i = 0; i < B.length; i++) {
            if (B[i] == 0) {
                return i + 1;
            }
        }
        return -1;
    }
}
