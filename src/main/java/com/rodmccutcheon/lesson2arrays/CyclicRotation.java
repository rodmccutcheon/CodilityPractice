package com.rodmccutcheon.lesson2arrays;

/**
 * Created by rodmccutcheon on 30/3/17.
 */
public class CyclicRotation {

    public int[] solution(int[] A, int K) {
        // If the array is empty, or a shift is not required we can just return the original array.
        if (A.length == 0 || K % A.length == 0) {
            return A;
        }

        int[] solution = new int[A.length];

        for(int i = 0; i < A.length; i++) {
            int j = i + K % A.length;
            // If the new index is greater than or equal to the length of the array it needs to be wrapped back to zero.
            if (j >= A.length) {
                j -= A.length;
            }
            solution[j] = A[i];
        }

        return solution;
    }
}
