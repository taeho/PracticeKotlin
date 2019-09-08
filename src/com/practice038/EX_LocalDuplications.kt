package com.practice038

// 변수가 속한 함수가 드를 때도 스코프가 다르기 때문에, 변수의 이름이 중복 가능하다 .
fun main(args: Array<String>)
{
	val a = 52
	println(a)	// 출력: 52

	printA()	// 출력: 17
	printA2()	// 출력: 120
}

fun printA()
{
	val a = 17
	println(a)
}

fun printA2()
{
	val a = 120
	println(a)
}
