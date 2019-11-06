package com.practice166.ex_big_integer_class
// BigInteger : Long 표현 범위를 넘는 매우 큰 정수 다루기, 자바 표준 라이브러리에 속해있다. jvm 에 의존성이 생김
//  public inline fun Int.toBigInteger(): BigInteger = BigInteger.valueOf(this.toLong())

fun main(args: Array<String>)
{
	val a = 78423343545.toBigInteger()
	val b = 25372465331.toBigInteger()

	println(a * b)	// 출력 : 1989793565236615138395	// 코틀린 표준라이브러리에서 BigInteger에 대한 연산자 확장함수를 제공
	println(a + b * 936273.toBigInteger())	// 출력: 23755632656194908
}
