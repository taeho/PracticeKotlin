package com.practice071.ex_exception

fun main(args: Array<String>)
{
	val str = "abcd"
	val num = str.toInt()

	println(num)
	// Exception in thread "main" java.lang.NumberFormatException: For input string: "abcd"
}
