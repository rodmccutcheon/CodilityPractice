package com.rodmccutcheon.lesson4countingelements;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by rodmccutcheon on 11/4/17.
 */
public class MissingIntegerTest {

    @Test
    void singleElementArrayMissingIntegerAtEnd() {
        int[] A = { 1 };
        assertEquals(2, new MissingInteger().solution(A));
    }

    @Test
    void singleElementArrayMissingIntegerAtBeginning() {
        int[] A = { 2 };
        assertEquals(1, new MissingInteger().solution(A));
    }

    @Test
    void orderedArrayMissingIntegerInMiddle() {
        int[] A = { 1, 2, 4 };
        assertEquals(3, new MissingInteger().solution(A));
    }

    @Test
    void orderedArrayWithDuplicatesMissingIntegerInMiddle() {
        int[] A = { 1, 1, 2, 4, 5 };
        assertEquals(3, new MissingInteger().solution(A));
    }

    @Test
    void orderedArrayMissingIntegerAtEnd() {
        int[] A = { 1, 2, 3, 4, 5, 6 };
        assertEquals(7, new MissingInteger().solution(A));
    }

    @Test
    void orderedArrayNegativeMissingInteger() {
        int[] A = { -3, -2 };
        assertEquals(1, new MissingInteger().solution(A));
    }

    // Example test case from the description
    @Test
    void unorderedArrayWithDuplicatesMissingIntegerInMiddle() {
        int[] A = { 1, 3, 6, 4, 1, 2 };
        assertEquals(5, new MissingInteger().solution(A));
    }

    @Test
    void maxMissingInteger() {
        int[] A = IntStream.rangeClosed(1, 100000).toArray();
        assertEquals(100001, new MissingInteger().solution(A));
    }

    @Test
    void zero() {
        int[] A = IntStream.rangeClosed(0, 100).toArray();
        assertEquals(101, new MissingInteger().solution(A));
    }
}
