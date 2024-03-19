package com.javaex.practice2;

import java.util.Scanner;

//사번(양의정수)을 입력하면 팀을 확인 할 수 있는 프로그램을 작성하세요.
//⚫ 팀은 A팀, B팀, C팀 3개의 팀으로 구성합니다.
//⚫ 사번을 3으로 나누어서 나머지가 0이면 A팀, 1이면 B팀, 2이면 C팀 으로 구분합니다.
//⚫ 사번 0번을 입력하면 "잘못된 사번입니다." 라고 출력하세요.
public class Ex21 {

	public static void main(String[] args) {
int num;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("사번(정수)를 입력해주세요. \n사번: ");
		num = scanner.nextInt();
		
		if (num%3==0 && num>0) {
			System.out.print("A팀입니다.");
		} else if (num%3==1 && num>0) {
			System.out.print("B팀입니다.");
		} else if (num%3==2 && num>0) {
			System.out.print("C팀입니다.");
		} else if (num == 0) {
			System.out.print("잘못된 사번입니다");
		}
		else {
			System.out.print("잘못입력하셨습니다.");
		}
	scanner.close();	
	}

}
