/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.stringbuilder;

/**
 *
 * @author brook
 */
public class StringBuilder {
    public static void main(String[] args) {
        System.out.println(isValid("{}{)}")); // false
        System.out.println(isValid("")); // false
        System.out.println(isValid("{[}]")); // false
        System.out.println(isValid("()")); // true
        System.out.println(isValid("({[]})")); // true
    }

    public static boolean isValid(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                sb.append(c);
            } else {
                if (sb.length() == 0) return false;
                char last = sb.charAt(sb.length() - 1);
                if ((c == ')' && last == '(') || (c == '}' && last == '{') || (c == ']' && last == '[')) {
                    sb.deleteCharAt(sb.length() - 1);
                } else {
                    return false;
                }
            }
        }
        return sb.length() == 0;
    }

    private void append(char c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private int length() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void deleteCharAt(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private char charAt(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
   