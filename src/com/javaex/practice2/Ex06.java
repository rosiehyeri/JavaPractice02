package com.javaex.practice2;

import java.util.Scanner;

//나이를 입력 받아 19세이상 65세 미만이면 "1번그룹" 그 이외에는 "2번그룹"으로 출력하는 프로그램을
//작성하세요.
public class Ex06 {

	public static void main(String[] args) {
		int age;
		Scanner scanner = new Scanner(System.in);
		System.out.println("나이를 입력해주세요\n나이:");
		age = scanner.nextInt();
		
		if (age>=19 && age<65) {
			System.out.println("1번그룹 입니다.");
		}else {
			System.out.println("2번그룹 입니다.");
		}
		
		scanner.close();
		
		

	}

}
