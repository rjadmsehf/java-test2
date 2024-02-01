package com.ohgiraffers.section03.constant;

public class Application02 {

    public static void main(String[] args) {

        /* 목표 상수의 명명 규칙에 대해 이해할 수 있다**/
    /* 필기
        상수의 명명 규칙은 변수의 명명 규칙과 컴파일 에러를 발생시키는 규칙은 동일하다.
        단, 개발자들끼리의 암묵적인 규칙에서 일부 차이를 보인다.
        1. 모든 문자는 영문자 대문자 혹은 숫자만을 사용한다.
        2. 단어와 단어의 연결은 언더스코어(_)를 사용한다.
     */

        /* 목차 1. 모든 문자는 영문자 대문자 혹은 숫자만을 사용한다.*/
        final int AGE1 = 20;
        final int AGE2 = 30;
        final int AGE3 = 40;         // 필기 : 소문자로 사용은 가능하지만 변수와 !! 구분하기 힘들기 때문에 만들어진 규칙이래~

        /* 목차 2. 단어와 단어 연결은 언더스코어(_)를 사용한다 .*/
        final int MAX_AGE = 50;
        final int MIN_AGE = 20;
        final int minAge = 30;     // 필기 camel cass 사용이 가능하지만 역시 변수와 구분이 되지 않는다. ** 구분용도



    }





}