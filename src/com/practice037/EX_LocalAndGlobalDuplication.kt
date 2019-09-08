package com.practice037

var a = 5	// 전역변수 

fun main(args: Array<String>)
{
	val a = 30	// 지역변수, 전역변수와 이름이 중복됨을 허용
	println(a)	// 출력은 스코프Scople 범위 내의 값인 30이 출력된다.
	func()
}

fun func()
{
	println(a)	// 여기에는 전역변수 스코프인 5가 출력
}
