package com.ohgiraffers.section05.typecasting;

public class test {
    public static void main(String[] args) {
//        int firtNum = 1000000;
//        int secondNum = 700000;
//        System.out.println("=====================================");
//        long result = (long)(firtNum * secondNum);
//        System.out.println(result);

        // long 에서 float 형변환
        long a = 10000000000l;
        float b = (float) a;

        System.out.println("b = " + b);

        int var1 = 'a';
        short var2 = 30;
        short result = (short)var1 + var2;          //???? 왜 빨간줄

        System.out.println("result = " + result);








    }
}
