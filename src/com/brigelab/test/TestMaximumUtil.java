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
}
