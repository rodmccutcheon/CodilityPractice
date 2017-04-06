package com.rodmccutcheon.lesson3timecomplexity;

/**
 * Created by rodmccutcheon on 6/4/17.
 */
public class FrogJmp {

    public int solution(int X, int Y, int D) {
        return (int) Math.ceil((Y - X) / (double) D);
    }
}
