package domain;

import java.math.BigInteger;

public class Puzzle {

    private BigInteger M = new BigInteger("2021");

    private BigInteger compute(int n) {

        String s = "";

        for (long i = 0; i < n; i++) {

            s = s + n;

        }

        return new BigInteger(s).mod(M);
    }
