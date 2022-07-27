package com.bridgelab.generic;

public class MaximumUtil {
    public static int maxInt(Integer x, Integer y, Integer z)
    {
        Integer maxValue = x;
        if (y.compareTo(maxValue) > 0)
        {
            maxValue = y;
        }
        if (z.compareTo(maxValue) > 0)
        {
            maxValue = z;
        }
        return maxValue;
    }
    //------------------- Float---------------------------------
    public static double maximumFloat(Double x, Double y, Double z)
    {
        Double maxValueFloat = x;
        if (y.compareTo(maxValueFloat) > 0)
        {
            maxValueFloat = y;
        }
        if (z.compareTo(maxValueFloat) > 0)
        {
            maxValueFloat = z;
        }
        return maxValueFloat;
    }
    public static String maximumString(String first, String second, String third) {
        int maxValueString = first.length();
        String letter = first;
        if (second.length() > maxValueString) {
            maxValueString = second.length();
            letter = second;
        }
        if (third.length() > maxValueString) {
            maxValueString = third.length();
            letter = third;
        }
        return letter;
    }
    private static void printMaxValue(double maxValueFloat)
    {
        System.out.println(" Maximum number is : " + maxValueFloat);
    }

    private static void printMaxValue(String maxValueString)
    {
        System.out.println(" Maximum String is : " + maxValueString);
    }
    // --------------------- MAin Method -----------------------------------
    public static void main(String[] args)
    {
        printMaxValue(maxInt(100, 200, 400));
        printMaxValue(maximumFloat(2.1, 1.1, 3.5));
        printMaxValue(maximumString("apple","ball","cat"));
    }
}

