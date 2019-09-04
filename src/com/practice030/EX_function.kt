package com.practice030

fun main(args: Array<String>): Unit
{
	println(myFunction())	// 출력: a: 3, b: 6 => 출력: 9
	println(myFunction() + 10) // 출력: a: 3, b: 6 => 출력: 19
	// 함수의 반환값에 10을 더한다, 즉 반환값 9에다가 10을 추가
}

fun myFunction(): Int	// fun 식별자(): 반환 타입
{
	val a = 3
	val b = 6
	println("a: " + a + ", b: " + b)
	return a + b
}
