package com.rodmccutcheon.lesson5prefixsums;

public class GenomicRangeQuery {

    public enum Nucleotide {
        A(1), C(2), G(3), T(4);

        private int impactFactor;

        private Nucleotide(int impactFactor) {
            this.impactFactor = impactFactor;
        }

        public int getImpactFactor() {
            return this.impactFactor;
        }
    }

    public int[] solution(String S, int[] P, int[] Q) {
        int[] answers = new int[P.length];
        int[][] prefixSums = new int[3][S.length() + 1];

        for (int i = 0; i < S.length(); i++) {
            short a = 0, c = 0, g = 0;
            Nucleotide n = Nucleotide.valueOf(String.valueOf(S.charAt(i)));
            switch (n) {
                case A:
                    a = 1;
                    break;
                case C:
                    c = 1;
                    break;
                case G:
                    g = 1;
                    break;
            }
            prefixSums[0][i + 1] = prefixSums[0][i] + a;
            prefixSums[1][i + 1] = prefixSums[1][i] + c;
            prefixSums[2][i + 1] = prefixSums[2][i] + g;
        }

        for (int j = 0; j < P.length; j++) {
            if (prefixSums[0][Q[j] + 1] - prefixSums[0][P[j]] >= 1) {
                answers[j] = Nucleotide.A.getImpactFactor();
            } else if (prefixSums[1][Q[j] + 1] - prefixSums[1][P[j]] >= 1) {
                answers[j] = Nucleotide.C.getImpactFactor();
            } else if (prefixSums[2][Q[j] + 1] - prefixSums[2][P[j]] >= 1) {
                answers[j] = Nucleotide.G.getImpactFactor();
            } else {
                answers[j] = Nucleotide.T.getImpactFactor();
            }
        }

        return answers;
    }
}

