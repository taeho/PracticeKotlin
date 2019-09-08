package com.practice036

// 지역변수 local variable 과  전역변수 Global Variable

var count = 0	// 함수밖에서 선언한 변수, 전역변수

fun main(args: Array<String>)
{
	val a = 15	// 지역변수 , 이 함수 블록내에서만 사용가능
	println(a)	// 출력:15

	count += 1		
	printCount()
	println(count)	// 출력: 2
}

fun printCount()
{
	println(count)	// 출력: 1
	count += 1		// 글로벌 변수에 값 누적
}
