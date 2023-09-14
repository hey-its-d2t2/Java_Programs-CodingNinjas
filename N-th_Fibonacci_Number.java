/*
You are given an integer ‘N’, your task is to find and return the N’th Fibonacci number using matrix exponentiation.
Since the answer can be very large, return the answer modulo 10^9 +7.
Fibonacci number is calculated using the following formula:
For ‘N’ = 5, the output will be 5.

*/

import java.util.*;

public class Solution {
    static final int MOD = 1000000007;

    public static int fibonacciNumber(int n) {

        int[][] coef = {{1, 1}, {1, 0}};

        int[][] res = matrixPower(coef, n - 1);

 

        return res[0][0];

    }

 

    public static int[][] matrixPower(int[][] coef, int n) {

        if (n == 0)

            return new int[][]{{1, 0}, {0, 1}};

 

        int[][] res = matrixPower(coef, n / 2);

 

        if (n % 2 == 1) {

            res = multiply(multiply(res, res), coef);

        } else {

            res = multiply(res, res);

        }

 

        return res;

    }

 

    public static int[][] multiply(int[][] a, int[][] b) {

        int[][] c = new int[2][2];

 

        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 2; j++) {

                for (int k = 0; k < 2; k++) {

                    c[i][k] = (int)((c[i][k] + (long)a[i][j] * b[j][k]) % MOD);

                }

            }

        }

        return c;

    }

}
