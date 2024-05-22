/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.generatorfunction;

/**
 *
 * @author brook
 */
import java.util.stream.*;

public class Generatorfunction {
    public static void main(String[] args) {
        int n = 10; // number of terms
        long sum = oddSquaresSum(n);
        System.out.println("Sum of squares of first " + n + " odd numbers: " + sum);
    }

    public static long oddSquaresSum(int n) {
        return Stream.iterate(1, i -> i + 2)
                     .mapToLong(i -> (long) i * i)
                     .limit(n)
                     .reduce(0, Long::sum);
    }
}

