package com.rodmccutcheon.binarygap;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by rodmccutcheon on 28/3/17.
 */
public class BinaryGapTest {

    static BinaryGap binaryGap;

    @BeforeAll
    static void initAll() {
        binaryGap = new BinaryGap();
    }

    @Test
    public void testNoBinaryGap() {
        int N = 1; // 1
        assertEquals(0, binaryGap.solution(N));
    }

    @Test
    public void testOneGapOfOne() {
        int N = 5; // 101
        assertEquals(1, binaryGap.solution(N));
    }

    @Test
    public void testTwoGaps() {
        int N = 41; // 101001
        assertEquals(2, binaryGap.solution(N));
    }

    @Test
    public void testExample() {
        int N = 1041; // 10000010001
        assertEquals(5, binaryGap.solution(N));
    }

    @Test
    public void testNonEndedGap() {
        int N = 20; // 10100
        assertEquals(1, binaryGap.solution(N));
    }
}
