package org.example.test0717;

//# 문제 1: 두 수의 나눗셈

//! 1. 문제 설명

// - 두 정수 A와 B가 주어질 때, 두 수를 나눈값을 출력하는 프로그램을 작성하시오.

// - 나누는 수가 0일 경우 “0으로 나눌 수 없습니다.”를 출력하시오.

//- 조건식은 삼항 연산자를 사용하시오.



//! 2. 입력

// 첫 번째 줄에 정수 A와 B가 공백으로 구분되어 주어진다.


//! 3. 출력

// 두 정수를 나눈값을 출력한다.


import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        String result = (b == 0 ? "0으로 나눌 수 없습니다." : String.valueOf((double) a / b));

        System.out.println(result);

        scanner.close();
    }
}
