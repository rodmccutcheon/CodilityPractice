package com.rodmccutcheon.lesson4countingelements;

public class MaxCounters {

    public int[] solution(int N, int[] A) {
        int[] countersAnswer = new int[N];
        for (int a : A) {
            countersAnswer[a - 1] = countersAnswer[a - 1] + 1;
        }
        return countersAnswer;
    }
}
