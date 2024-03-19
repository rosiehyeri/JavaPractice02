package com.javaex.practice2;

import java.util.Scanner;

//두개의 숫자를 입력 받아 큰 수와 작은 수를 분류하여 출력하세요
public class Ex10 {

	public static void main(String[] args) {
		int num1;
		int num2;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자 2개를 입력해주세요");
		System.out.println("숫자1: ");
		num1 = scanner.nextInt();
		System.out.println("숫자2: ");
		num2 = scanner.nextInt();
		
		if (num1 > num2) {
            System.out.println("큰수 :" + num1 + "   작은수: " + num2 + "입니다.");
        } else if (num2 > num1) {
            System.out.println("큰수 :" + num2 + "   작은수: " + num1 + "입니다.");
        } else {
            System.out.println("두 수는 같습니다.");
        }
	}

}
