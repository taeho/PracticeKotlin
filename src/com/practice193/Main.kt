package com.practice193.ex_java_to_kotlin_sam_conversion
// 193 코틀린에서 자바 코드 접근하기: SAM 변환
// SAM : Single Abstract Method : 메서드를 한개만 갖고 있는 인터페이스
// 대표적인예: Runnable, Comparable 등 있다.
// SAM 변환이란 함수 리터럴을 특정 인터페이스로 변환하는 것

fun main(args: Array<String>)
{
	val runnable: Runnable = Runnable { println("SAM") }	// Runnable 인터페이스는 매개변수와 반환 타입이 없는 추상 메서드를 갖는다.
	// 따라서 ()->Unit 형태의 함수로 Runnable 타입을 대신 표현해도 무방
	// 함수 리터럴 앞에 단일 추상 메서드를 갖는 인터페이스 이름을 적으면, 그 인터페이스 타입으로 표현식이 변한다.
	runnable.run()
}
