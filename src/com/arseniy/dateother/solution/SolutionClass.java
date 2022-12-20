package com.arseniy.dateother.solution;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SolutionClass {

    public static void getCircleSquare(double radius) {
        double piNumber = Math.PI;
        double circleSquare = piNumber * Math.pow(radius, 2);
        System.out.println(String.format("%(.50f", circleSquare));
    }

    public static void checkNumber(String initStr) {
        List<String> stringList = Arrays.asList(initStr.split( " "));
        double firstNumber = convertNumber(stringList.get(0));
        double secondNumber = convertNumber(stringList.get(1));
        double thirdNumber = convertNumber(stringList.get(2));
        if (firstNumber + secondNumber == thirdNumber) {
            System.out.println("Третье число является суммой первых двух.");
        } else {
            System.out.println("Третье число НЕ является суммой первых двух.");
        }

    }

    public static double convertNumber(String strToConvert) {

        System.out.println(strToConvert);
        strToConvert = strToConvert.replace(".", ",");
        NumberFormat format = NumberFormat.getInstance(Locale.getDefault());
        double d = 0;
        try {
            Number number = format.parse(strToConvert);
            d = number.doubleValue();
            System.out.println(d);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return d;
    }

    public static void getMaxNumber(double first, double second, double third) {
        System.out.println(Math.max(first, Math.max(second, third)));
    }

    public static void getMinNumber(double first, double second, double third) {
        System.out.println(Math.min(first, Math.min(second, third)));
    }
}
