package com.rodmccutcheon.lesson4countingelements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MaxCountersTest {

    @Test
    void oneCounterOneAddition() {
        int[] A = { 1 };
        assertArrayEquals(A, new MaxCounters().solution(1, A));
    }
}
