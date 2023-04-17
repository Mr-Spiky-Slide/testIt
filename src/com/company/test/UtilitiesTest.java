package com.company.test;

import com.company.Utilities;

import static org.junit.Assert.*;

public class UtilitiesTest {
    private Utilities utilitiy;
    @org.junit.Before
    public void before() {
        utilitiy = new Utilities();
    }
    @org.junit.Test
    public void dogYears() {
        assertEquals("Dog Year Formula Wrong", utilitiy.dogYears(7),49);
    }

    @org.junit.Test
    public void fishFibber() {
        assertEquals("Fish Fiber Formula Wrong", utilitiy.fishFibber(9),14);
    }

    @org.junit.Test
    public void averageAge() {
        assertEquals("average Age Formula Wrong", utilitiy.averageAge(5,10,15),10,0);
    }
}