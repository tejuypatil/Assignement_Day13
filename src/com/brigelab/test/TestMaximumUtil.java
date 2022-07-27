package com.brigelab.test;

import com.bridgelab.generic.MaximumUtil;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMaximumUtil {
    @Test
    public void testForFirstMaxNumber()
    {
        int  maxNumber=MaximumUtil.maxInt(600,300,400);
        Assert.assertEquals(maxNumber,600);
    }
    @Test
    public void testForSecondMaxNumber()
    {
        int  maxNumber1=MaximumUtil.maxInt(100,400,300);
        Assert.assertEquals(maxNumber1,400);
    }
    @Test
    public void testForThirdMaxNumber()
    {
        int  maxNumber1=MaximumUtil.maxInt(100,400,900);
        Assert.assertEquals(maxNumber1,900);
    }
    //------------------- Test for Float --------------------------

    @Test
    public void givenFloatFirstNumberIsMaxNumberThenReturnFirstNumberAsMax() {

        Double maximum = MaximumUtil.maximumFloat(14.3, 1.2, 2.3);
        Assert.assertEquals((Double) 14.3, maximum);
    }

    @Test
    public void givenFloatSecondNumberIsMaXNumberThenReturnSecondNumberAsMaximum() {
        Double maximum = MaximumUtil.maximumFloat(1.2,14.3, 2.3);
        Assert.assertEquals((Double) 14.3, maximum);
    }

    @Test
    public void givenFloatThirdNumberIsMaXNumberThenReturnThirdNumberAsMaximum() {
        Double maximum = MaximumUtil.maximumFloat( 1.2, 2.31,14.3);
        Assert.assertEquals((Double) 14.3, maximum);
    }
    //------------------- Test for String--------------------------

    @Test
    public void givenStringFirstNumberIsMaxNumberThenReturnFirstNumberAsMax() {

        String maxString = MaximumUtil.maximumString("apple","cat","ball");
        Assert.assertEquals("apple", maxString);
    }

    @Test
    public void givenStringSecondNumberIsMaXNumberThenReturnSecondNumberAsMaximum() {
        String maxString = MaximumUtil.maximumString("cat","apple","ball");
        Assert.assertEquals("apple", maxString);
    }

    @Test
    public void givenStringThirdNumberIsMaXNumberThenReturnThirdNumberAsMaximum() {
        String maxString = MaximumUtil.maximumString("cat","ball","apple");
        Assert.assertEquals( "apple", maxString);
    }
}
