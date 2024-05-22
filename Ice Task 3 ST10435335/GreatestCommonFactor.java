/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.greatestcommonfactor;

/**
 *
 * @author brook
 */
import java.util.Scanner;

public class GreatestCommonFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println(" Please enter the first number:");
        int a = scanner.nextInt();
        
        System.out.println("Please enter the second number:");
        int b = scanner.nextInt();
        
        System.out.println("The greatest common divisor is: " + gcd(a, b));
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}

