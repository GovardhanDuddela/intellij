package com.example;

public class CharBoolean {
    public static void main(String[] args) {
        char myChar='D';
        char myUnicode='\u0059';
        System.out.println(myChar);
        System.out.println(myUnicode);
        char copyChar='\u00A9';
        System.out.println(copyChar);
        String s="this is kokila";
        System.out.println(s);
        s=s+" ravindra babu";
        System.out.println(s);
        s=s+" govardhan";
        System.out.println(s);
        s=s+" tharun";
        System.out.println(s);
        s=s+" \u00A9 2022";
        System.out.println(s);

    }
}
