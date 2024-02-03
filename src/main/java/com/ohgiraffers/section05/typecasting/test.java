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

//        int var1 = 'a';
//        short var2 = 30;
//        short result = (short) var1 + var2;          //???? 왜 빨간줄
//        System.out.println((short) var1 + var2 );
//        System.out.println("result = " + result);
//        System.out.println((short)'a'+ var2);
//        int x = 'a';
//        System.out.println((short)+ x + var2);
        System.out.println('a' +1);

        long var1 = 'a';
        int var2 = 30;
        int result = (int) var1 + var2;


        int var10 = 'a';
        short var20 = 30;
        short result10 = (short) (var10 +var20);
        System.out.println(result10+1);



        //정수 기본형 4가지
        /* 필기  1 byte   1 byte
        *       2 short  2 byte
        *       3 int    4 byte
        *       4 long   8 byte
        * */



    }
}
