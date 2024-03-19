package com.javaex.practice2;

import java.util.Scanner;

//두 개의 정수를 입력 받은 후에 작은 수가 큰 수의 약수인지 확인하는 프로그램을 작성하세요.
//(0은 입력하지 않습니다.)
public class Ex13 {

	public static void main(String[] args) {
		
		int num1, num2;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("첫번째 숫자: ");
		num1 = scanner.nextInt();
		System.out.println("두번째 숫자: ");
		num2 = scanner.nextInt();
		
		int smaller, larger;

        // 작은 수와 큰 수를 구분
        if (num1 < num2) {
            smaller = num1;
            larger = num2;
        } else {
            smaller = num2;
            larger = num1;
        }

        // 작은 수가 큰 수의 약수이면 출력
        if (larger % smaller == 0) {
            System.out.println(smaller + "는(은) " + larger + "의 약수입니다.");
        } else {
            System.out.println(smaller + "는(은) " + larger + "의 약수가 아닙니다.");
        }

        scanner.close();
	}

}
