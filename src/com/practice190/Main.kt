package com.practice190.ex_java_to_kotlin_types
// 190 코틀린에서 자바 코드 접근하기: 타입

fun main(args: Array<String>)
{
	val rand: Double = Math.random()	// 코틀린에서 java 함수 호출하면 double 타입이 코틀린의 Double 타입으로 변환하여 리턴.
	println(rand)	// 출력: 0.2413840109784895 // 랜덤값이다.

	val buffer: StringBuffer = StringBuffer()	// 자바에서 선언된 StringBuffer 클래스를 코틀린에서 사용
	buffer.append("hello, ")
	buffer.append("world!")
	val result: String = buffer.toString()	// 자바에서 toString으로 반환하지만 코틀린에서 kotlin.String타입으로 변환되므로 문제없다
	println(result)	// 출력: hello, world!

}
