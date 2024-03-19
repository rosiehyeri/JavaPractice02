package com.javaex.practice2;

import java.util.Scanner;

//다음과 같이 정의되는 함수의 함수 값을 계산해보자
//
//f(x) = {(x*x*x) − 9x + 2 , x ≤ 0 (x가 0보다 작거나 같으면 이식을 사용)
//        7x + 2 , x > 0 (x가 0보다 크면 이식을 사용)


public class Ex16 {

	public static void main(String[] args) {

		int x;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자를 입력해 주세요: ");
		System.out.print("숫자: ");
		x = scanner.nextInt();
		
		
		double result;
		if (x<=0) {
			result = x*x*x - 9*x + 2;
		} else {
			result = 7 * x + 2;
		}
		System.out.println("계산 결과는 " + result + "입니다.");
		scanner.close();

	}

}
