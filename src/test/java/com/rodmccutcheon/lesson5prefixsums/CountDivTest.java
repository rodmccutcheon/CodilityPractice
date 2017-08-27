package com.rodmccutcheon.lesson5prefixsums;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountDivTest {

    @Test
    void noneDivisible() {
        assertEquals(0, new CountDiv().solution(3, 3, 2));
    }

    @Test
    void oneDivisible() {
        assertEquals(1, new CountDiv().solution(3, 3, 3));
    }
}
