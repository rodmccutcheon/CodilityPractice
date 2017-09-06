package com.rodmccutcheon.lesson6sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DistinctTest {

    @Test
    void testOneDistinctValue() {
        int[] A = { 7 };
        assertEquals(1, new Distinct().solution(A));
    }

    @Test
    void testSortedArray() {
        int[] A = { 1, 1, 2, 3, 3, 3 };
        assertEquals(3, new Distinct().solution(A));
    }
}
