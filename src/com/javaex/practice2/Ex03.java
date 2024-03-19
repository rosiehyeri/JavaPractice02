package com.javaex.practice2;
//다음 코드는 오류가 있습니다. 오류의 내용을 찾고 올바르게 수정하여 코딩해 보세요.
public class Ex03 {

//	public static void main(String[] args) {
//		int age = 15;
//				
//	    //age가 0살 초과고 18살 미만이면
//		if ( 0 < age < 18) {						// 틀린 부분
//			System.out.println("청소년 입니다.");
//		}
//	}
	public static void main(String[] args) {
		int age = 15;
				
	    //age가 0살 초과고 18살 미만이면
		if ( 0 < age && age < 18) {					// 고친 부분
			System.out.println("청소년 입니다.");		
		}
	}
}
