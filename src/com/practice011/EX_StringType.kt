package com.practice011

fun main(args: Array<String>): Unit
{
	var str: String = "Hello"
	println(str)	// 출력: Hello

	str = str + "\nKotlin!"
	println(str)	// 출력: Hello\nKotlin!

	println(str[8])	// 출력: t

	val num = 10 * 5 + 3	// 53으로 만든다.
	println(str + num)	// String에 string아닌값을더하면, String으로 출력: Hello\nKotlin!53
}
