package com.javaex.practice2;

import java.util.Scanner;

//두 개의 정수를 입력 받아 큰 수를 작은 수로 나눈 몫과 나머지를 출력하는 프로그램을 작성하세요
public class Ex11 {

	public static void main(String[] args) {

		int num1, num2;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("첫번째 숫자: ");
		num1 = scanner.nextInt();
		System.out.println("두번째 숫자: ");
		num2 = scanner.nextInt();
		
		int max, min;
		
		if (num1 > num2) {
			max = num1;
			min = num2;
		} else {
			max = num2;
			min = num1;
		}
			
			int quotient = max / min;
			int remainder = max % min;
			
			System.out.println("몫: " + quotient);
			System.out.println("나머지: " + remainder);
		
		
		scanner.close();
		
		
	}

}
