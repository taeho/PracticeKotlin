package com.practice181.ex_verify_value
// 181 인수(Argument) 검증하기
// check 나 require 함수를 이용하면 값이 특정 조건을 만족하지 않을 때 예외를 던진다.

fun func(num: Int?)
{
	checkNotNull(num)	// 인수로 전달한 값이 null 이면 IllegalStateException 예외를 던진다.
	check(num!! >= 0)	// 인수로 전달한 값이  false 이면 IllegalStateException 예외를 던진다.
}

fun func2(num: Double?)
{
	requireNotNull(num)	// 인수로 전달한 값이 null 이면 IllegalArgumentException 예외를 던지고, 아니면 Non-null 타입으로 캐스팅  
	require(num!!.isNaN())	// 인수로 전달한 값이 false 이면 IllegalArgumentException 예외를 던진다
}

fun main(args: Array<String>)
{
	func(10)
	func2(0.0 / 0.0)
}
