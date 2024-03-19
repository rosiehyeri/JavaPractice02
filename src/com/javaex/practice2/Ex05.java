package com.javaex.practice2;

import java.util.Scanner;

//아래와 같이 작성된 코드가 있다.
//보기와 같은 형식으로 나이가 입력되었을 때 결과값을 예상하여 작성해 보세요
public class Ex05 {

	public static void main(String[] args) {
		int age; //나이
		Scanner scanner = new Scanner(System.in);
		
		//나이를 입력받는다.
		System.out.println("나이를 입력해주세요");
		System.out.println("나이: ");
		age = scanner.nextInt();
		
		//그룹을 분류한다
		if(age > 20) {	//20살 초과이면
			System.out.print("\"1번그룹\"");
		}else {	//20살 이하라면
			System.out.println("\'2번그룹\'");
		}
		System.out.println("입니다.");
		
		scanner.close();
	}

}

//(1) 15일 때 결과
//'2번 그룹'
//입니다.
//(2) 19일 때 결과
//'2번 그룹'
//입니다.
//(3) 20일 때 결과
//'2번 그룹'
//입니다.
//(4) 21일 때 결과
//'1번 그룹'
//입니다.
//(5) 100일 때 결과
//'1번 그룹'
//입니다.
