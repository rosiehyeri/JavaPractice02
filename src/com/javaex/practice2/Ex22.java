package com.javaex.practice2;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
int num1, num2, num3;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자 3개를 입력해주세요");
		System.out.println("숫자1: ");
		num1 = scanner.nextInt();
		System.out.println("숫자2: ");
		num2 = scanner.nextInt();
		System.out.println("숫자3: ");
		num3 = scanner.nextInt();
		
		int max = num1; // 일단 첫 번째 수를 가장 큰 수로 가정

        // 두 번째 수가 가장 큰 수보다 크면 max 값을 업데이트
        if (num2 > max) {
            max = num2;
        }

        // 세 번째 수가 가장 큰 수보다 크면 max 값을 업데이트
        if (num3 > max) {
            max = num3;
        }

        System.out.println("가장 큰 수는 " + max + "입니다.");

        scanner.close();

	}

}
