package com.java.Assignments.Assignment11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Counter {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            File input = new File(args[0]);
            File output = new File("/home/saidg/IdeaProjects/JavaAssignments/src/com/java/Assignments/Assignment11/output.txt");
            Scanner scanner = new Scanner(input);
            PrintWriter printer = new PrintWriter(output);
            Map<Character, Integer> map = new HashMap<>();
            while (scanner.hasNextLine()) {
                String str = scanner.nextLine();
                for (char i : str.toCharArray()) {
                    map.put(i, map.getOrDefault(i, 0) + 1);
                }
            }
            for (char c: map.keySet()) {
                printer.println(c + " -> " + map.get(c));
            }
            scanner.close();
            printer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
