package com.rodmccutcheon.lesson5prefixsums;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PassingCarsTest {

    @Test
    void noPassingCars() {
        int[] A = { 0 };
        assertEquals(0, new PassingCars().solution(A, A.length));
    }

    @Test
    void onePassingCar() {
        int[] A = { 0, 1 };
        assertEquals(1, new PassingCars().solution(A, A.length));
    }
}
