package com.practice039
// 함수 속에 함수를 선언하는 방법

fun main(args: Array<String>)
{
	fun printFomular(a: Int, b: Int)	// main 함수 안에서만 쓰이는 함수
	{
		println(a * b + a - b)
	}

	printFomular(73, 1)	// 출력: 145
	printFomular(4, 6)	// 출력: 22
}
