package com.rodmccutcheon.lesson4countingelements;

/**
 * Created by rodmccutcheon on 12/4/17.
 */
public class PermCheck {

    public int solution(int[] A, int N) {
        int[] count = new int[N];
        for (int a : A) {
            if (a < 1 || a > N) {
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
