package com.practice010

fun main(args: Array<String>): Unit
{
	var ch: Char = 'A'
	println(ch)		// 출력: A

	ch = '\uAC00'	// 유니코드 사용
	println(ch)		// 출력: 가

	ch = '한'
	println(ch.toInt())	// 출력 54620, 유니코드 매핑되는 int값
}
