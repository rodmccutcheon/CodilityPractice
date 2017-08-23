package com.rodmccutcheon.lesson4countingelements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * Created by rodmccutcheon on 12/4/17.
 */
public class PermCheckTest {

    @Test
    void singleElementArrayPermutation() {
        int[] A = { 1 };
        assertEquals(1, new PermCheck().solution(A, A.length));
    }

    @Test
    void singleElementArrayNotPermutation() {
        int[] A = { 7 };
        assertEquals(0, new PermCheck().solution(A, A.length));
    }
}
