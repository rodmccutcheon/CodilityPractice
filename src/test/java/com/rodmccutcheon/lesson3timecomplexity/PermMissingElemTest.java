package com.rodmccutcheon.lesson3timecomplexity;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by rodmccutcheon on 6/4/17.
 */
public class PermMissingElemTest {

    static PermMissingElem permMissingElem;

    @BeforeAll
    static void initAll() {
        permMissingElem = new PermMissingElem();
    }

    @Test
    public void testExample() {
        int[] A = { 2, 3, 1, 5 };
        assertEquals(4, permMissingElem.solution(A));
    }
}
