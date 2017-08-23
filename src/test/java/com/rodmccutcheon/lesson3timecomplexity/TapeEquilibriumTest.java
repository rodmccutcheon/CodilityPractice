package com.rodmccutcheon.lesson3timecomplexity;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * Created by rodmccutcheon on 6/4/17.
 */
public class TapeEquilibriumTest {

    private static TapeEquilibrium tapeEquilibrium;

    @BeforeAll
    static void initAll() {
        tapeEquilibrium = new TapeEquilibrium();
    }

    @Test
    public void testOneSplitNoDifference() {
        int[] A = { 7, 7 };
        assertEquals(0, tapeEquilibrium.solution(A));
    }

    @Test
    public void testOneSplit() {
        int[] array = { 7, 11 };
        assertEquals(4, tapeEquilibrium.solution(array));
    }

    @Test
    public void testExample() {
        int[] A = { 3, 1, 2, 4, 3 };
        assertEquals(1, tapeEquilibrium.solution(A));
    }

    @Test
    public void testNegative() {
        int[] A = { -1000, 1000 };
        assertEquals(2000, tapeEquilibrium.solution(A));
    }


}
