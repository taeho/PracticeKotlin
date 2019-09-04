package com.practice019

fun main(args: Array<String>): Unit
{
	var a = 15
	val b = 11

	if (a > b)
	{
		println("if 안으로 들어옴")	//출력: if 안으로 들어옴
		a -= b
	}

	println(a)	// 출력 : 4
}
