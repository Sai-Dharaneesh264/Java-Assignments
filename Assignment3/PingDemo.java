package com.java.Assignments.Assignment3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PingDemo {
    public static void pingResult(String command) {
        String pingResult = "";
        try {
            Process p = Runtime.getRuntime().exec(command);
            String s = "";
            BufferedReader inputStream = new BufferedReader(new InputStreamReader(p.getInputStream()));
            while ((s = inputStream.readLine()) != null) {
                System.out.println(s);
                pingResult += s;
            }
            inputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the IP Address : ");
        String ipAddress = scanner.nextLine();
        pingResult("ping " + ipAddress);
    }
}
