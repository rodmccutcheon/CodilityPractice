package com.rodmccutcheon.binarygap;

/**
 * Created by rodmccutcheon on 28/3/17.
 */
public class BinaryGap {

    public int solution(int N) {
        int longestBinaryGap = 0;

        System.out.println("N: " + N);
        String binaryString = Integer.toBinaryString(N);
        System.out.println("binary string: " + binaryString);

        int currentBinaryGap = 0;

        for (int i = 0; i < binaryString.length(); i++) {
            char currentChar = binaryString.charAt(i);
            System.out.println("current char: " + currentChar);
            System.out.println("compare to zero: " + Character.compare(currentChar, '0'));
            if (Character.compare(currentChar, '0') == 0) {
                currentBinaryGap++;
            } else {
                if (currentBinaryGap > longestBinaryGap) {
                    longestBinaryGap = currentBinaryGap;
                }
                currentBinaryGap = 0;
            }
        }
        return longestBinaryGap;
    }
}
