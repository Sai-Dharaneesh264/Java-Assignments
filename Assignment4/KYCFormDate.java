package com.java.Assignments.Assignment4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;

public class KYCFormDate {
   private Date signup, current;
   private Date startDate, endDate;
    public void rangeKYC(String signupDate, String currentDate) throws ParseException {
        SimpleDateFormat dateFormatter = new SimpleDateFormat("dd-MM-yyyy");
        signup = dateFormatter.parse(signupDate);
        current = dateFormatter.parse(currentDate);
        if (signup.after(current)) {
            System.out.println("No range");
        } else {
            startDate = signup;
            startDate.setYear(current.getYear());

            Calendar calendar = Calendar.getInstance();
            calendar.setTime(startDate);
            calendar.add(calendar.DATE, -30);
            startDate = calendar.getTime();
            calendar.add(calendar.DATE, 60);
            endDate = calendar.getTime();
            if (endDate.after(current)) {
                endDate = current;
            }
            System.out.println(dateFormatter.format(startDate) + " " + dateFormatter.format(endDate));
        }
    }

    public static void main(String[] args) throws ParseException {
        KYCFormDate kyc = new KYCFormDate();
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        String signupDate, currentDate;
        String input;
        for (int i = 0; i < testCases; i++) {
            signupDate = scanner.next();
            currentDate = scanner.next();
//            System.out.println("main");
//            System.out.println(signupDate + " " + currentDate);
            kyc.rangeKYC(signupDate, currentDate);
        }
    }
}
