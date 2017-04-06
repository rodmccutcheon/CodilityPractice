package com.rodmccutcheon.lesson3timecomplexity;

import java.util.Arrays;

/**
 * Created by rodmccutcheon on 6/4/17.
 */
public class PermMissingElem {

    public int solution(int[] A) {
        Arrays.sort(A);

        int prevElem = 0;
        for (int currElem : A) {
            int expectedElem = prevElem + 1;
            if (currElem != expectedElem) {
                return expectedElem;
            }
            prevElem = currElem;
        }
M
        // If missing element hasn't been found yet it must be N + 1
        return A.length + 1;
    }
}
