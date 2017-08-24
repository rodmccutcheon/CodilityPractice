package com.rodmccutcheon.lesson4countingelements;

public class MaxCounters {

    public int[] solution(int N, int[] A) {
        int[] countersAnswer = new int[N];

        int max = 0;
        int min = 0;

        // loop through the operations
        for (int a : A) {
            // increase the specified counter by one
            if (a >= 1 && a <= N) {
                int current = countersAnswer[a - 1];

                // if this counter is below the min set it to the min before applying the increase operation
                if (current < min) {
                    current = min;
                }

                countersAnswer[a - 1] = ++current;

                // keep track of the max counter
                if (current > max) {
                    max = current;
                }
            }
            // set all counters to max
            // for better performance, rather than apply this across all counters now, we maintain the 'min' to add to
            // subsequent operations
            else if (a == N + 1) {
                min = max;
            }
        }
        // final check to make sure no counters are below the min
        for (int i = 0; i < countersAnswer.length; i++) {
            if (countersAnswer[i] < min) {
                countersAnswer[i] = min;
            }
        }
        return countersAnswer;
    }
}
