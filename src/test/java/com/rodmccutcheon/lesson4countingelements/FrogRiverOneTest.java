package com.rodmccutcheon.lesson4countingelements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FrogRiverOneTest {

    @Test
    void oneLeafSuccessfulCrossing() {
        int[] A = { 1 };
        assertEquals(0, new FrogRiverOne().solution(1, A));
    }
}
