package com.practice017

// 비교 연산자Comparison Operator
fun main(args: Array<String>): Unit
{
	var isRight: Boolean = (10 + 70) > (3 * 25)
	println(isRight)	// 출력: true

	isRight = false
	println(isRight)	// 출력: false

	isRight = 30 == (10 + 20)
	println(isRight)	// 출력: true

	isRight = 0.00001f == 0.005f * 0.002f
	println(isRight)	// 출력: false

	isRight = 3.0 * 5 + 2.7 <= 16
	println(isRight)	// 출력: false
}
