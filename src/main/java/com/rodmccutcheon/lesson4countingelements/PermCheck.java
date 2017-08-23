package com.rodmccutcheon.lesson4countingelements;

/**
 * Created by rodmccutcheon on 12/4/17.
 */
public class PermCheck {

    public int solution(int[] A, int N) {
        for (int a : A) {
            if (a < 1 || a > N) {
                return 0;
            }
        }
        return 1;
    }
}
