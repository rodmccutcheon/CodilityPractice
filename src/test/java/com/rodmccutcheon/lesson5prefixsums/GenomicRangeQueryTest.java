package com.rodmccutcheon.lesson5prefixsums;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class GenomicRangeQueryTest {

    @Test
    void simple() {
        int[] P = { 1 };
        int[] Q = { 1 };
        int[] answer = { 1 };
        assertArrayEquals(answer, new GenomicRangeQuery().solution("A", P, Q));
    }
}
