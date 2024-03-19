package com.javaex.practice2;

import java.util.Scanner;

//알파벳을 입력 받아 자음 모음을 구분하세요.
//⚫ switch~case문을 사용합니다.
//⚫ 영문 소문자 이외의 입력 값은 고려하지 않습니다.
public class Ex18 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("알파벳 1글자(소문자)를 입력하세요");
		System.out.print("알파벳: ");
		
		int alp = scanner.nextInt();
		
		switch(alp) {
		case 'a' :
		case 'e' :
		case 'i' :
		case 'o' :
		case 'u' :
			System.out.println("모음입니다.");
			break;
		default :
			System.out.println("자음입니다.");
			break;
		} 
		
		
		scanner.close();
	}

}
