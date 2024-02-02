package com.ohgiraffers.section03.constant;

public class test2 {
    public static void main(String[] args) {
        /* 필기 K2소총 가격은 964000원이다
            int K2 =964000;
            K2 소총을 7자루를 사고 5자루는 20프로 2자루는 10프로를 할인 받았을때 총액입니다 (문자열)붙이기
            (예시) 00000000 입니다
            문제 2 : K2 5자루 가격 000000"이고" > 2자루 가격 000000"입니다".
            문제 3 : K2 5자루 가격 000000빼기 K2 2자루 가격000000은    000000000원입니다.



         */
        int K2 = 964000;
        double X = 0.8;
        System.out.println(K2 * 5 * 0.8 + K2 * 2 * 0.9 + "입니다");
        System.out.println("K2 5자루의 가격은" + K2 * 5 * 0.8 +  "이고 K2 2자루의 가격은" + (K2 * 2 * 0.9 + "입니다"));
        System.out.println("K2 5자루 가격" + K2 * 5 * 0.8 + "빼기 K2 2자루 가격" + K2 * 2 * 0.9 + "은  " + (K2 * 5 * 0.8 - K2 * 2 * 0.9) + "원입니다");

//        double a = (K2 * 5 * 0.8);
//        char q = 97;
//        System.out.println(q);

        System.out.println(1);






    }
}
