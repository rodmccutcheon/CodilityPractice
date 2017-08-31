package com.rodmccutcheon.lesson5prefixsums;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class GenomicRangeQueryTest {

    @Test
    void simple() {
        String dnaSequence = "A";
        int[] P = { 0 };
        int[] Q = { 0 };
        int[] answer = { 1 };
        assertArrayEquals(answer, new GenomicRangeQuery().solution(dnaSequence, P, Q));
    }

    @Test
    void name() {
        String dnaSequence = "TG";
        int[] P = { 0 };
        int[] Q = { 1 };
        int[] answer = { 3 };
        assertArrayEquals(answer, new GenomicRangeQuery().solution(dnaSequence, P, Q));
    }

    @Test
    void sample() {
        String dnaSequence = "CAGCCTA";
        int[] P = { 2, 5, 0 };
        int[] Q = { 4, 5, 6 };
        int[] answer = { 2, 4, 1 };
        assertArrayEquals(answer, new GenomicRangeQuery().solution(dnaSequence, P, Q));
    }

    @Test
    void name2() {
        String dnaSequence = "AC";
        int[] P = { 0, 0, 1 };
        int[] Q = { 0, 1, 1 };
        int[] answer = { 1, 1, 2 };
        assertArrayEquals(answer, new GenomicRangeQuery().solution(dnaSequence, P, Q));
    }
}
