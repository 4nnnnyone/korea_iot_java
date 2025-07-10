package org.example.chapter09;

import java.util.Random;
import java.util.Scanner;

public class JavaUtil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();

        Random random = new Random(); // 랜덤 객체 생성
        int num = random.nextInt();
        System.out.println(num);

        int num2 = random.nextInt(100);
        System.out.println(num2);

        int num3 = random.nextInt(101, 200);
        System.out.println(num3);
    }
}
