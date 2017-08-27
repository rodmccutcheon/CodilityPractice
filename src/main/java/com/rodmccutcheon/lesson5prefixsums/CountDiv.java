package com.rodmccutcheon.lesson5prefixsums;

public class CountDiv {

    public int solution(int A, int B, int K) {
        int divs = 0;
        if (A % K == 0) {
            divs++;
        }
        return divs;
    }
}
