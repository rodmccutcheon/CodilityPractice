package com.rodmccutcheon.lesson4countingelements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MaxCountersTest {

    @Test
    void oneCounterOneAddition() {
        int[] A = { 1 };
        assertArrayEquals(A, new MaxCounters().solution(1, A));
    }

    @Test
    void twoCountersOneAddition() {
        int[] A = { 1 };
        int[] expectedSolution = { 1, 0 };
        assertArrayEquals(expectedSolution, new MaxCounters().solution(2, A));
    }
}
