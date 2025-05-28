package com.example.demo.service;


public class Calcuator {

    public double calculateDiscount(double price, String discountType) throws IllegalArgumentException {
        if (discountType.equals("none")) {
            return price;
        } else if (discountType.equals("student")) {
            return price * 0.9;
        } else if (discountType.equals("senior")) {
            return price * 0.85;
        } else {
            throw new IllegalArgumentException("Invalid discount type");
        }
    }
}
