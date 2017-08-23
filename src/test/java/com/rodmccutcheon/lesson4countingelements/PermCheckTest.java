package com.rodmccutcheon.lesson4countingelements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * Created by rodmccutcheon on 12/4/17.
 */
public class PermCheckTest {

    @Test
    void name() {
        int[] A = { 1 };
        assertEquals(1, new PermCheck().solution(A, A.length));
    }

}
