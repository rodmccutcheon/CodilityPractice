package com.rodmccutcheon.lesson4countingelements;

/**
 * Created by rodmccutcheon on 12/4/17.
 */
public class PermCheck {

    public int solution(int[] A, int N) {
        if (A[0] < 1 || A[0] > N) {
            return 0;
        } else {
            return 1;
        }
    }
}
