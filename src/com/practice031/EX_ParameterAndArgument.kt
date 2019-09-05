package com.practice031

fun main(args: Array<String>): Unit
{
	println(cToF(30))	// 함수호출하면서 30전달 여기는 인수 Argument , 출력 86.0
	println(getAverage(89, 96))	// 출력: 92.5
}

fun cToF(celsius: Int): Double	// 매개변수 Parameter celsius, 그리고 Double 타입반환.
{
	return celsius * 1.8 + 32
}

fun getAverage(a: Int, b: Int): Double
{
	return (a + b) / 2.0
}
