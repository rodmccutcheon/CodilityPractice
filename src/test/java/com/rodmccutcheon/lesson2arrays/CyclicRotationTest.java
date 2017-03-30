package com.rodmccutcheon.lesson2arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Created by rodmccutcheon on 30/3/17.
 */
public class CyclicRotationTest {

    static CyclicRotation cyclicRotation;

    @BeforeAll
    static void initAll() {
        cyclicRotation = new CyclicRotation();
    }

    @Test
    public void testEmptyArray() {
        int[] A = { };
        int K = 0;
        assertArrayEquals(A, cyclicRotation.solution(A, K));
    }

    @Test
    public void testArrayOfOne() {
        int[] A = { 7 };
        int K = 3;
        assertArrayEquals(A, cyclicRotation.solution(A, K));
    }

    @Test
    public void testNoShift() {
        int[] A = { 1, 2, 3 };
        int K = 0;
        assertArrayEquals(A, cyclicRotation.solution(A, K));
    }

    @Test
    public void testExample() {
        int[] A = { 3, 8, 9, 7, 6 };
        int K = 3;
        int[] expectedResult = { 9, 7, 6, 3, 8 };
        assertArrayEquals(expectedResult, cyclicRotation.solution(A, K));
    }

    @Test
    public void testShiftBackToStart() {
        int[] A = { 3, 8, 9, 7, 6 };
        int K = 5;
        assertArrayEquals(A, cyclicRotation.solution(A, K));
    }

    @Test
    public void testWrapMultipleTimes() {
        int[] A = { 3, 8, 9, 7, 6 };
        int K = 11;
        int[] expectedResult = { 6, 3, 8, 9, 7 };
        assertArrayEquals(expectedResult, cyclicRotation.solution(A, K));
    }
}
