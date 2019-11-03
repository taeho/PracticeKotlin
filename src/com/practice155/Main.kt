package com.practice155.ex_string_class
// String 클래스 살펴보기
//     public operator fun plus(other: Any?): String

fun main(args: Array<String>)
{
	val one = "Hello "
	val two = "Kotlin"
	val three = "JavaFx"

	println(one + two)	// 출력: Hello Kotlin		// plus 연산자 멤버함수로 String 끼리 + 연산자 사용
	println(one > two)	// 출력: false			// Comparable 인터페이스 구현 으로 비교연산자 사용가능
	//문자열 길이가 긴쪽이 항상크고, 문자열의 길이가 같으면 첫 글자부터 유니코드 순서 기준으로 비교한다.
	println(two > three)	// 출력: true		// 비교 
}
