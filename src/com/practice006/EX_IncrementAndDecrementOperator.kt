package com.practice006

// 증감연산자
fun main(args: Array<String>): Unit
{
	var a = 10
	var b = 5

	println(a++ + b)	// a 후위 증가 연산 > b 더한 값 출력 , 15
	println(a)	// a는 이미 증가된 상태라 11
	println(--b)	// 전위 감소하고 난 뒤의 b는, 4

	10.inv()
}
