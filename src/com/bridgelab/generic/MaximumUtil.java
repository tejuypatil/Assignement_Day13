package com.bridgelab.generic;
import java.util.*;
public class MaximumUtil <S>{
    private S[] inputArray;

    public MaximumUtil(S[] inputArray)
    {
        this.inputArray = inputArray;
    }

    public static <T> T findMax(T[] myNumber)
    {
        List myNumberList = Arrays.asList(myNumber);
        T max = (T) Collections.max( myNumberList );
        toPrint(max);
        return max;
    }

    private static <S> void toPrint(S a)
    {
        System.out.println(a);
    }
    public static void main(String[] args)
    {
        System.out.println(" ************ Java Generics ********** ");
    }
}

