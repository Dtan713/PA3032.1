package com.perscholas.java_basics;

public class CoreJavaBasicPart8 {
    final static double SALES_TAX = 0.08;
    public static void main(String[] args) {

        int coffee = 3;
        int espresso = 4;
        int cappuccino = 5;
        double subtotal;
        double totalSale;

        subtotal = (coffee + espresso + cappuccino) * SALES_TAX;
        totalSale = subtotal;

        System.out.println(totalSale);





    }
}
