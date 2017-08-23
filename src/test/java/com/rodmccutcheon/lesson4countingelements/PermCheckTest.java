package com.rodmccutcheon.lesson4countingelements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * Created by rodmccutcheon on 12/4/17.
 */
public class PermCheckTest {

    @Test
    void singleElementArrayValidPermutation() {
        int[] A = { 1 };
        assertEquals(1, new PermCheck().solution(A));
    }

    @Test
    void singleElementArrayOutsideRangeNotValidPermutation() {
        int[] A = { 7 };
        assertEquals(0, new PermCheck().solution(A));
    }

    @Test
    void multipleElementsOutsideRangeNotValidPermutation() {
        int [] A = { 1, 3 };
        assertEquals(0, new PermCheck().solution(A));
    }

    @Test
    void multipleElementsDuplicatesNotValidPermutation() {
        int [] A = { 1, 1 };
        assertEquals(0, new PermCheck().solution(A));
    }

    @Test
    void multipleElementsValidPermutation() {
        int [] A = { 4, 3, 1, 2 };
        assertEquals(1, new PermCheck().solution(A));
    }
}
