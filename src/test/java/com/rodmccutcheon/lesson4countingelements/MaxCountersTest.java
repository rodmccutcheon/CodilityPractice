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

    @Test
    void twoCountersMultipleAdditions() {
        int[] A = { 1, 2, 1 };
        int[] expectedSolution = { 2, 1 };
        assertArrayEquals(expectedSolution, new MaxCounters().solution(2, A));
    }

    @Test
    void twoCountersMaxCounter() {
        int[] A = { 1, 3, 1, 1, 2 };
        int[] expectedSolution = { 3, 2 };
        assertArrayEquals(expectedSolution, new MaxCounters().solution(2, A));
    }

    @Test
    void sample() {
        int[] A = { 3, 4, 4, 6, 1, 4, 4 };
        int[] expectedSolution = { 3, 2, 2, 4, 2 };
        assertArrayEquals(expectedSolution, new MaxCounters().solution(5, A));
    }
}
