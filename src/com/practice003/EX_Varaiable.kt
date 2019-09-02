package com.practice003

fun main(args: Array<String>): Unit
{
	// var: 변수 키워드, total: 변수이름(식별자), Int: 변수의 타입
	// var total: Int =0 //처럼 한줄로 선언하고 초기화도 가능하다.
	// 아래 구문은 var 키워드로 total이라는 식별자가 변수를 뜻하고,그 타입이 Int라고 컴파일러에게 알림	
	var total: Int
	total = 0
	
	// var 는 일반 변수 이고, val은 final 변수로 생각하면 된다.	
	val a: Int = 10 + 53 - 7
	println(a)
	
	val b: Int = 43 + 75 + a
	println(b)
	
	total = a+b
	println(total)
}