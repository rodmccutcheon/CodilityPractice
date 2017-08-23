package com.rodmccutcheon.lesson3timecomplexity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by rodmccutcheon on 6/4/17.
 */
public class TapeEquilibrium {

    public int solution(int[] A) {
        int rightSum = Arrays.stream(A).sum();
        int leftSum = 0;
        List<Integer> diffs = new ArrayList<Integer>(A.length - 1);

        for (int i = 0; i < A.length - 1; i++) {
            leftSum += A[i];
            rightSum -= A[i];
            diffs.add(Math.abs(rightSum - leftSum));
        }

        return Collections.min(diffs);
    }


}
