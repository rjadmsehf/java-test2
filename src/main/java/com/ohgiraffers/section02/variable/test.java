package com.ohgiraffers.section02.variable;

public class test {
    public static void main(String[] args) {



//
//        String str ="안녕";
//        double dnum = 30.0;
//        System.out.println(str + (dnum + dnum));
//
//
////        System.out.println(true +  null);
//
//        System.out.println( 'J' + "ava");
//
//        System.out.println( true + "");
//
        String str = "잔여 포인트";
        int point = 1000;

        System.out.println("포인트 10프로가 차감 되었습니다." + (point - (point * 0.1)));
        int x = 5;
        final int AGE = 100;
        double sum;
        sum = 10.1;
        int isum = 10+ AGE;
        double dnum = sum + isum;

        System.out.println( (dnum*(x*0.1))+ AGE);







    }
}