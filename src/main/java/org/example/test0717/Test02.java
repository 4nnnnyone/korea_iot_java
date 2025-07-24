package org.example.test0717;

//# 문제 2: 배열의 최솟값 찾기

//! 1. 문제 설명

// N개의 정수가 주어지면, 그 중 최솟값을 출력하는 프로그램을 작성하시오.


//! 2. 입력

// 첫 번째 줄에 정수 N이 주어진다.

// 두 번째 줄에 N개의 정수가 공백으로 구분되어 주어진다.


//! 3. 출력

// N개의 정수 중 최솟값을 출력한다.

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
        }

        System.out.println(min);

        scanner.close();
    }
}
