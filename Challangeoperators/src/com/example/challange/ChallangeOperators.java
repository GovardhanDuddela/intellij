package com.example.challange;

public class ChallangeOperators {
    public static void main(String[] args) {
        double d = 20.00;
        double d1 = 80.00;
        double d2 = d + d1 * 100;
        System.out.println(d2);
        double d3 = d2 % 40.00;
        System.out.println("reminder value:" + d3);
        boolean result = d3 == 0 ? true : false;
        if (result) {
            System.out.println("got some reminder");
        }
    }
}







