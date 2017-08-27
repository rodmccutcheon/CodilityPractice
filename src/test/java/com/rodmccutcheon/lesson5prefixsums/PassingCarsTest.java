package com.rodmccutcheon.lesson5prefixsums;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PassingCarsTest {

    @Test
    void oneCarTravellingEast() {
        int[] A = { 0 };
        assertEquals(0, new PassingCars().solution(A));
    }

    @Test
    void oneCarTravellingWest() {
        int[] A = { 1 };
        assertEquals(0, new PassingCars().solution(A));
    }

    @Test
    void onePassingCar() {
        int[] A = { 0, 1 };
        assertEquals(1, new PassingCars().solution(A));
    }

    @Test
    void noPassingCars() {
        int[] A = { 1, 0 };
        assertEquals(0, new PassingCars().solution(A));
    }

    @Test
    void multipleCarsTravellingEastAndWest() {
        int[] A = { 0, 1, 0, 1, 1 };
        assertEquals(5, new PassingCars().solution(A));
    }

    @Test
    void maxPairs() {
        IntStream i1 = IntStream.generate(() -> 0).limit(32_000);
        IntStream i2 = IntStream.generate(() -> 1).limit(32_000);
        int[] A = IntStream.concat(i1, i2).toArray();
        assertEquals(-1, new PassingCars().solution(A));

    }
}
