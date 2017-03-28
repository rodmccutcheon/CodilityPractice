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
        int binaryNumber = 11;
        assertEquals(0, binaryGap.solution(binaryNumber));
    }
}
