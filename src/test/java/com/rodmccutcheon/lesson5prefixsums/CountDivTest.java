package com.rodmccutcheon.lesson5prefixsums;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountDivTest {

    @Test
    void rangeOfOneNoneDivisible() {
        assertEquals(0, new CountDiv().solution(3, 3, 2));
    }

    @Test
    void rangeOfOneAndOneDivisible() {
        assertEquals(1, new CountDiv().solution(3, 3, 3));
    }

    @Test
    void sample() {
        assertEquals(3, new CountDiv().solution(6, 11, 2));
    }

    @Test
    void simple() {
        assertEquals(20, new CountDiv().solution(11, 345, 17));
    }
}
