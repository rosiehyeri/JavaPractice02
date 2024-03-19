package com.javaex.practice2;

import java.util.Scanner;

//아래의 조건과 같이 출력되도록 프로그램을 작성하세요
//⚫ 태어난 년도를 입력 받습니다.
//⚫ 나이는 생일과 관계없이 계산됩니다. 올해2023년, 2020년생 ➔ 3살 (2023-2020 = 3)
//⚫ 15세미만의 경우와 65세이상인 경우에는 "(나이)살 무료예방접종 대상자 입니다" 메시지를 출력합
//니다.
//⚫ 이외의 경우에는 " (나이)살 무료예방접종 대상자가 아닙니다" 메시지를 출력합니다.

public class Ex09 {

	public static void main(String[] args) {
		int birthYear;
        int age;
        Scanner scanner = new Scanner(System.in);

        System.out.println("태어난 년도를 입력하세요:");
        birthYear = scanner.nextInt();

        // 올해 연도를 정수형으로 저장
        int currentYear = 2023;
        // 나이 계산
        age = currentYear - birthYear;

        if (age < 15 || age >= 65) {
            System.out.println(age + "살 무료예방접종 대상자 입니다.");
        } else {
            System.out.println(age + "살 무료예방접종 대상자가 아닙니다.");
        }

        scanner.close();

	}

}
