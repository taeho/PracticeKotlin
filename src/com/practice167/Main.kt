package com.practice167.ex_big_decimal_class
// BigDecimal 클래스 매우 작은 실수 보관하기
// Double 표현 범위를 넘는 실수를 다룰때 쓰는 클래스. 마찬가지로 jvm에 의존적 

fun main(args: Array<String>)
{
	val a = 3.0000000000003.toBigDecimal()
	val b = 4.0000000000004.toBigDecimal()

	println(a * b)	// 출력: 12.00000000000240000000000012

}
