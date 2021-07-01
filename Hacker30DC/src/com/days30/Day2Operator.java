package com.days30;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day2Operator {
    // Complete the solve function below.
static void solve(double meal_cost, int tip_percent, int tax_percent) {
double tip_percent_cal=(meal_cost/100.0)*tip_percent;
//double tip_percent_cal=(tip_percent/100)*meal_cost;
//System.out.println("tip_percent_cal-"+tip_percent_cal);

double tax_percent_cal=(tax_percent/100.0)*meal_cost;
//System.out.println("tax_percent-"+tax_percent);
//System.out.println("tax_percent_cal/100-"+tax_percent/100.0);
//System.out.println("tax_percent_cal-"+tax_percent_cal);
//double tax_percent_cal=(tax_percent/100)*meal_cost;
double meal_c_p=tip_percent_cal+tax_percent_cal+meal_cost;
//System.out.println(meal_c_p);

System.out.println(Math.round(meal_c_p));

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
}

