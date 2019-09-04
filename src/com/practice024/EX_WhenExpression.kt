package com.practice024

fun main(args: Array<String>): Unit
{
	val score = 95
	
	// 아래 when은 if-else도 가능
	// val grade: Char = when
	// score >= 90 -> 'A'
	val grade: Char = when (score / 10)
	{
		6 -> 'D'
		7 -> 'C'
		8 -> 'B'
		9, 10 -> 'A'
		else -> 'F'
	}

	println(grade)
}
