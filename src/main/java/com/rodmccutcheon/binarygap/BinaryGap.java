package com.rodmccutcheon.binarygap;

/**
 * Created by rodmccutcheon on 28/3/17.
 */
public class BinaryGap {

    public int solution(int N) {
        int longestBinaryGap = 0;

        // Convert int to binary string representation
        String binaryString = Integer.toBinaryString(N);

        int currentBinaryGap = 0;

        for (int i = 0; i < binaryString.length(); i++) {
            // If a 0 is encountered increment the current binary gap by 1
            if (Character.compare(binaryString.charAt(i), '0') == 0) {
                currentBinaryGap++;
            } else {
                // Else if a 1 is encountered the binary gap has ended
                // Check if the current binary gap is the longest binary gap
                if (currentBinaryGap > longestBinaryGap) {
                    longestBinaryGap = currentBinaryGap;
                }
                // Restart the current binary gap
                currentBinaryGap = 0;
            }
        }
        return longestBinaryGap;
    }
}
