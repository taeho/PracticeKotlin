package com.practice169.ex_round_functions
// 실수값 올림. 내림, 반올림하기

import kotlin.math.*	// kotlin 내장 math 함수 호출

fun main(args: Array<String>)
{
	println(ceil(3.2))		// 출력: 4.0	// ceil은 천장ceiling의 약자, 실수값을 올림하는 함수 
	println(ceil(3.7))		// 출력: 4.0	// 실수값을 올림하는 함수 
	println(floor(3.2))		// 출력: 3.0	// floor는 바닥이라는 뜻으로 실수값을 내림하는 함수 
	println(floor(3.7))		// 출력: 3.0	
	println(round(3.2))		// 출력: 3.0	// round는 주어진 실수값을 반올림하는 함수 
	println(round(3.7))		// 출력: 4.0
	println(15.83.roundToInt())		// 출력: 16		// roundToInt 실수값을 Int 타입으로 반올림하는 확장함수 
	println(37842.45.roundToLong())	// 출력: 37842	// roundToLong 실수값을 Long  타입으로 반올림하는 확장함수
}
