package com.javaex.practice2;
//사용자로 키와 몸무게를 입력 받아 BMI을 계산한 후에 저체중, 정상체중, 과체중을 구분하여 출력하
//프로그램을 작성하세요. (정상체중의 범위는 18.5 <= BMI <= 24.9)
//
//BMI = 체중(kg) / 키(m)2

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		int height;
		int weight;
		double BMI;
		Scanner scanner = new Scanner(System.in);
		
		
		
		System.out.println("키와 몸무게를 입력해주십시오");
		System.out.println("키: ");
		height = scanner.nextInt();
		System.out.println("몸무게: ");
		weight = scanner.nextInt();
		
		BMI = (double) weight / ((double) height * height / 10000);

		if (BMI>=18.5 && BMI<=24.9) {
			System.out.println("정상체중입니다.");
		} 
		else if (BMI>24.9) {
			System.out.println("과체중입니다.");
		} 
		else if (BMI<18.5) {
			System.out.println("저체중입니다.");
		}
		System.out.println("BMI:" + BMI);
		
		scanner.close();
	}
	
}
