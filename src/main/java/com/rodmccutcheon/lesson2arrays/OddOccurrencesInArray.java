package com.rodmccutcheon.lesson2arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rodmccutcheon on 30/3/17.
 */
public class OddOccurrencesInArray {

    public int solution(int[] A) {
        List<Integer> unmatchedIntegers = new ArrayList<>();

        for (int currentInt : A) {
            if (unmatchedIntegers.contains(currentInt)) {
                unmatchedIntegers.remove(Integer.valueOf(currentInt));
            } else {
                unmatchedIntegers.add(currentInt);
            }
        }

        return unmatchedIntegers.get(0);
    }

}
