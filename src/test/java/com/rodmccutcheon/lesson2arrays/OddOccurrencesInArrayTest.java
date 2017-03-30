package com.rodmccutcheon.lesson2arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by rodmccutcheon on 30/3/17.
 */
public class OddOccurrencesInArrayTest {

    static OddOccurrencesInArray oddOccurrencesInArray;

    @BeforeAll
    static void initAll() {
        oddOccurrencesInArray = new OddOccurrencesInArray();
    }

    @Test
    public void testArrayOfOne() {
        int[] A = { 7 };
        assertEquals(7, oddOccurrencesInArray.solution(A));
    }

    @Test
    public void testSimple() {
        int[] A = { 7, 11, 7 };
        assertEquals(11, oddOccurrencesInArray.solution(A));
    }

    @Test
    public void testExample() {
        int[] A = { 9, 3, 9, 3, 9, 7, 9 };
        assertEquals(7, oddOccurrencesInArray.solution(A));
    }

}
