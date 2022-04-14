package com.java.Assignments.Assignment2;

import java.util.Scanner;

// Time Complexity: 0(n) where n is the size of input String
// Space Complexity: O(1) No extra space used which increases with input size
public class Assignment2 {
    public static boolean check(String input) {
        boolean[] alpha = new boolean[26];
        int len = input.length();
        if (len < 26) {
            return false;
        }
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (input.charAt(i) >= 'a' && input.charAt(i) <= 'z') {
                int index = input.charAt(i) - 'a';
                if (alpha[index] == false) {
                    count++;
                }
                alpha[index] = true;
            } else if (input.charAt(i) >= 'A' && input.charAt(i) <= 'Z') {
                int index = input.charAt(i) - 'A';
                if (alpha[index] == false) {
                    count++;
                }
                alpha[index] = true;
            }
        }

        if (count != 26) {
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(check(input));
    }
}
