package com.rodmccutcheon.lesson4countingelements;

/**
 * Created by rodmccutcheon on 12/4/17.
 */
public class PermCheck {

    public int solution(int[] A) {
        int[] count = new int[A.length];
        for (int a : A) {
            if (a < 1 || a > A.length) {
                return 0;
            } else {
                if (count[a-1] == 1) {
                    return 0;
                } else {
                    count[a-1] = 1;
                }
            }
        }
        return 1;
    }
}
