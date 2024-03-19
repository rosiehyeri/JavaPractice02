package com.javaex.practice2;

import java.util.Scanner;

//숫자(정수) 3개를 입력받아 가장 작은 수를 출력하세요
public class Ex12 {

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
		
		int min = num1; // 일단 첫 번째 수를 가장 작은 수로 가정

        // 두 번째 수가 가장 작은 수보다 작으면 min 값을 업데이트
        if (num2 < min) {
            min = num2;
        }

        // 세 번째 수가 가장 작은 수보다 작으면 min 값을 업데이트
        if (num3 < min) {
            min = num3;
        }

        System.out.println("가장 작은 수는 " + min + "입니다.");

        scanner.close();

	}

}
