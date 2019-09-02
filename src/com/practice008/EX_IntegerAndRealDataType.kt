package com.practice008

// 소실수를 표현하는 방식: 부동소수점(Floating Point) 방식

fun main(args: Array<String>): Unit
{
	val a: Byte = 125	// Byte타입 변수 선언, Int 타입이지만, Byte범위내라서 ok
	val b: Short = (100 + 200) * 100	//Short 타입변수 선언, 소괄호먼저, 범위내 ok
	var c: Int = 12_4354_6538	// Int 타입변수 선언, 언더스코어(_)는 숫자를 좀더 알아보기 쉽게표현, 
	//println(c)	// 고대로출력해보면 , 1243546538 나온다
	c = 0xFF_88_88	// 변수 c에 담긴 값을 16진수로 인식 
	c = 0b01010010_01100011_01110101_01000101	// 2진수로 인식
	var d: Long = -543_7847_3984_7238_4723	// Long 타입변수 선언, Int값을 넘으면 자동으로 Long타입

	c = a + b	// Int 타입 = Byte타입+Short타입, 결과는 byte와 short 모두 int 범위내이므로 결과는 Int타입
	d = c + 10L	// 정수값(정수리터럴)에 L을 붙이면 무조건 Long타입이 된다. 결과값도 long 범위내이므로 long타입

	var e: Float = 67.6f	// f를 붙이는건 float 타입 
	val f: Double = 658.4	// Doulbe 선언과 동시에 저장
	e = (e + f).toFloat()	// e+f를 더하면 Double타입 720.056 이 나오기때문에 float 타입으로 e를 변환
	println(e)		// 출력 : 726.0
}
