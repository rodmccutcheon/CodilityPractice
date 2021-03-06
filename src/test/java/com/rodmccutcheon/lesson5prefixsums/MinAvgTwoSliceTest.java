package com.rodmccutcheon.lesson5prefixsums;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinAvgTwoSliceTest {

    @Test
    void oneSlice() {
        int[] A = { 1, 1 };
        assertEquals(0, new MinAvgTwoSlice().solution(A));
    }

    @Test
    void solutionLengthTwo() {
        int[] A = { 3, 2, 2 };
        assertEquals(1, new MinAvgTwoSlice().solution(A));
    }

    @Test
    void solutionLengthThree() {
        int[] A = { 4, 5, 8, 4, 5, 4 };
        assertEquals(3, new MinAvgTwoSlice().solution(A));
    }
}
