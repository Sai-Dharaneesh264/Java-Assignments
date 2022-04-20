package com.java.Assignments.Assignment3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PingDemo {
    public static void pingResult(String command) throws IOException {
        String pingResult = "";
        BufferedReader inputStream = null;
        try {
            Process p = Runtime.getRuntime().exec(command);
            String s = "";
            inputStream = new BufferedReader(new InputStreamReader(p.getInputStream()));
            while ((s = inputStream.readLine()) != null) {
                System.out.println(s);
                pingResult += s;
            }
            inputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            inputStream.close();
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the IP Address : ");
        String ipAddress = scanner.nextLine();
        pingResult("ping " + ipAddress);
    }
}
