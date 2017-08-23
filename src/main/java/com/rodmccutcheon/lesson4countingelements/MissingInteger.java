package com.rodmccutcheon.lesson4countingelements;

/**
 * Created by rodmccutcheon on 11/4/17.
 */
public class MissingInteger {

    public int solution(int[] A) {
        int[] B = new int[100001];
        for (int a : A) {
            if (a >= 0 && a <= 100000) {
                B[a] = 1;
            }
        }
        for (int i = 1; i < B.length; i++) {
            if (B[i] == 0) {
                return i;
            }
        }
        return -1;
    }

    /*public int solution(int[] A) {
        Arrays.sort(A);
        int missingInt = A[A.length - 1] + 1;
        int expectedInt = A[0] > 1 ? 1 : A[0]; // Assuming array is in ascending order, so this is the min int.
        int previousInt = A[0];
        for (int currentInt : A) {
            if (currentInt != previousInt) {
                expectedInt++;
            }

            if (currentInt != expectedInt) {
                missingInt = expectedInt;
                break;
            }

            previousInt = currentInt;
        }

        return missingInt < 1 ? 1 : missingInt;
    }*/
}
