package com.javaex.practice2;

import java.util.Scanner;

//나이를 입력 받아 아래와 같이 입장료가 출력되도록 프로그램을 작성하세요
public class Ex07 {

	public static void main(String[] args) {

		int age;
		System.out.println("나이를 입력해주세요.\n나이: ");
		Scanner scanner = new Scanner(System.in);
		age = scanner.nextInt();
		if (age>=0 && age<=7) {
			System.out.println("취학전아동/무료 입니다.");
		}
		else if (age>=8 && age<=13) {
			System.out.println("초등학생/2000원 입니다.");
		}
		else if (age>=14 && age<=16) {
			System.out.println("중학생/3000원 입니다.");
		}
		else if (age>=17 && age<=19) {
			System.out.println("고등학생/4000원 입니다.");
		}
		else if (age>=20) {
			System.out.println("성인/5000원 입니다.");
		}
		
		scanner.close();

	}

}
