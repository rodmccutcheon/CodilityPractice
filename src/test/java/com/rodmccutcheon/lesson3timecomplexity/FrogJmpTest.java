package com.rodmccutcheon.lesson3timecomplexity;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by rodmccutcheon on 6/4/17.
 */
public class FrogJmpTest {

    private static FrogJmp frogJmp;

    @BeforeAll
    static void initAll() {
        frogJmp = new FrogJmp();
    }

    @Test
    public void testNoJumpsRequired() {
        assertEquals(0, frogJmp.solution(10, 10, 30));
    }

    @Test
    public void testOneJumpRequired() {
        assertEquals(1, frogJmp.solution(10, 20, 10));
    }

    @Test
    public void testJumpExceedsTarget() {
        assertEquals(1, frogJmp.solution(10, 20, 20));
    }

    @Test
    public void testExample() {
        assertEquals(3, frogJmp.solution(10, 85, 30));
    }

}
