package com.bsu;


import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    double delta = 0;

    @Test
    public void greenTest(){

    }

    @Test
    public void testNotNull(){
        double factRes = App.calculate(1,1,'+');
        Assert.assertNotNull(factRes);
    }

    @Test
    public void testSame(){
        double factRes = App.calculate(3,5,'+');
        Assert.assertTrue(factRes >= 8);
    }

    @Test
    public void sumTest(){
        double factRes = App.calculate(3,5,'+');
        double expRes = 3+5;
        Assert.assertEquals(factRes, expRes, delta);
    }

    @Test
    public void subtrTest(){
        double factRes = App.calculate(3,5,'-');
        double expRes = 3-5;
        Assert.assertEquals(factRes, expRes, delta);
    }

    @Test
    public void multTest(){
        double factRes = App.calculate(3,5,'*');
        double expRes = 3*5;
        Assert.assertEquals(factRes, expRes, delta);
    }

    @Test
    public void multZeroTest(){
        double factRes = App.calculate(3,0,'*');
        double expRes = 0;
        Assert.assertEquals(factRes, expRes, delta);
    }

    @Test
    public void divTest(){
        double factRes = App.calculate(25,5,'/');
        double expRes = 5;
        Assert.assertEquals(factRes, expRes, delta);
    }

    @Test
    public void divZeroTest(){
        double factRes = App.calculate(0,5,'/');
        double expRes = 0;
        Assert.assertEquals(factRes, expRes, delta);
    }

    @Test
    public void divByZeroTest(){
        double factRes = App.calculate(3,0,'/');
        double expRes = -5384;
        Assert.assertEquals(factRes, expRes, delta);
    }




}
