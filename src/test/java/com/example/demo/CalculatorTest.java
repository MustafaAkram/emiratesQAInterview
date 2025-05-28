package com.example.demo;


import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.example.demo.service.Calcuator;

public class CalculatorTest {

    static final double STUDENT_DISCOUNT = 0.9;
    static final double SENIOR_DISCOUNT = 0.85;
    static final String STUDENT_TYPE = "student";
    static final String SENIOR_TYPE = "senior";

    Calcuator calcuator;

    @BeforeClass
    public void setUp() {
        calcuator = new Calcuator();
    }

    @Test
    public void testDiscountStudentType() {
        double price = 10;
        Assert.assertEquals(price * STUDENT_DISCOUNT, calcuator.calculateDiscount(price, STUDENT_TYPE));
    }

    @Test
    public void testDiscountSeniorType() {
        double price = 10;
        Assert.assertEquals(price * STUDENT_DISCOUNT, calcuator.calculateDiscount(price, SENIOR_TYPE));
    }

    @Test
    public void testDiscountCalculationInvalidDiscountType() {
        double price = 10;
//        Assert.ass(IllegalArgumentException.class, calcuator.calculateDiscount(price, "invalid type"));
    }

}
