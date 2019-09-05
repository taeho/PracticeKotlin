package com.practice032

/* 코틀린의 Unit 타입은 자바의 void에 대응되는 개념.
 하지만 둘이 완전히 같지는 않음. void는 반환값이 없는 특수타입. Unit은 class 키워드로 정의된 일반타입.
 */

// 반환값을 가지지 않는 함수
fun main(args: Array<String>): Unit
{
	celsiusToFah(27)
}

// 이전 practice31예제와 안겹치게 함수명 변경
fun celsiusToFah(celsius: Int): Unit
{
	println(celsius * 1.8 + 32)	// 반환값없이 바로 출력: 80.6
}
