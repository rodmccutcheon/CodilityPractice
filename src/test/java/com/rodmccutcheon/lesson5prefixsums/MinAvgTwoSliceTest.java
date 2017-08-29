package com.rodmccutcheon.lesson5prefixsums;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinAvgTwoSliceTest {

    @Test
    void oneSlice() {
        int[] A = { 1, 1 };
        assertEquals(1, new MinAvgTwoSlice().solution(A));
    }
}
