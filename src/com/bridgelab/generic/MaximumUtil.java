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

    private static void printMaxValue(Integer maxValue)
    {
        System.out.println(" Maximum number is : " + maxValue);
    }
    private static void printMaxValue(double maxValueFloat)
    {
        System.out.println(" Maximum number is : " + maxValueFloat);
    }
    // --------------------- MAin Method -----------------------------------
    public static void main(String[] args)
    {
        printMaxValue(maxInt(100, 200, 400));
        printMaxValue(maximumFloat(2.1, 1.1, 3.5));
    }
}

