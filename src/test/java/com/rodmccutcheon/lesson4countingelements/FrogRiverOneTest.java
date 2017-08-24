package com.rodmccutcheon.lesson4countingelements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FrogRiverOneTest {

    @Test
    void singleLeafSuccessfulCrossing() {
        int[] A = { 1 };
        assertEquals(0, new FrogRiverOne().solution(1, A));
    }

    @Test
    void twoLeavesUnsuccessfulCrossing() {
        int[] A = { 1, 1 };
        assertEquals(-1, new FrogRiverOne().solution(2, A));
    }

    @Test
    void multipleLeavesSuccessfulCrossing() {
        int[] A = { 1, 3, 1, 4, 2, 3, 5, 4 };
        assertEquals(6, new FrogRiverOne().solution(5, A));
    }

    @Test
    void singleLeafUnsuccessfulCrossing() {
        int[] A = { 3 };
        assertEquals(-1, new FrogRiverOne().solution(5, A));
    }
}
