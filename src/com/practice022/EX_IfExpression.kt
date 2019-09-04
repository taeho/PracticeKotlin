package com.practice022

fun main(args: Array<String>): Unit
{
	val value: Int = if (10 > 5)
	{
		println("10은 5보다 크다.")	// 출력
		10	// val value: Int = 10  표현식의 값이 된다.
	}
	else
	{
		println("10은 5보다 크지 않다.")
		5
	}

	println(value)	// 출력 : val value: Int = 10
}
