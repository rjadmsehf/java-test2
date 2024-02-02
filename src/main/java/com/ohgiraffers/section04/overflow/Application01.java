package com.ohgiraffers.section04.overflow;

public class Application01 {
    public static void main(String[] args) {

     /*목표 오버플로우에 대해 이해할 수 있다.*/
     /* 필기
         자료형 별 값의 최대 범위를 벗어나는 경우
         발생한 carry를 버림처리 하고 sign bit를 반전시켜 최솟값으로 순환시킴.
         sign bit 자르를 침범하게 되먀ㅕㄴ 강제로 (+ -)를 반전시킨다.
      */
     /* 목차 1 오버플로우 */
     byte num1 = 127;
        System.out.println("num1 : " + num1);       //127 : byte의 최대 저장 범위  //필기 1만 더할수있나

        ++num1;  //+1 주는것

        System.out.println("num1 overflow" + num1);     //-128 : byte의 최소 저장범위

        /* 목차 2 언더플로우 */
        /* 필기  오버플로우와 반대 개념으로 최소 범위보다 작은 수를 발생시키는 경우 발생하는 현상이다*/
        byte num2 = -128;

        System.out.println("num2 : " + num2);

        num2--;

        System.out.println("num2 underflow : " + num2);


        int firstNum = 1000000;   // 100만
        int secondNum = 700000;   // 70만


        int mulit = firstNum * secondNum;

        System.out.println("firstNum secondNum : " + mulit);

        /* 목차 3 해결방법 */
        /* 필기 오버플로우를 예측하고 더 큰 자료형으로 결과값을 받아서 처리한다*/


        long longMulti = firstNum * secondNum; // 7천억

        System.out.println("longgMulti" + longMulti);  //안돼죠?

        long reault = (long) firstNum * secondNum;

        System.out.println("reault : " + reault);








    }
}
