package com.practice074.ex_nothing_type
// Nothing 타입. 실행 흐름이 도달할 수 없는 구역을 나타내기 위한 특수타입

fun throwing(): Nothing = throw Exception()	// throw Exception 표현식은 Nothing 타입이다

fun main(args: Array<String>)
{
	println("start")	// 출력: start
	val i: Int = throwing()	// Int 타입의 변수에 Nothing 타입의 표현식을 대입. Nothing 타입은 어떤타입과도 호환 가능
	println(i)	// 출력: Exception in thread "main" java.lang.Exception
}
