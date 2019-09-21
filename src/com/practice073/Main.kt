package com.practice073.ex_throw_exception
//예외 던지기 , 일부러 예외를 발생시킨다 

fun main(args: Array<String>)
{
	try
	{
		something()	// 함수 호출
	}
	catch (e: Exception)
	{
		println(e.message)
	}
}

fun something()
{
	val num1 = 10 // 변수선언, 초기화
	val num2 = 0
	div(num1, num2)	// 함수 전달
}

// a를 b로 나눈 몫을 반환하는 함수
fun div(a: Int, b: Int): Int
{
	if (b == 0)
		throw Exception("0으로 나눌 수 없습니다.")	// Throwable이 아닌 Exception의 인스턴스 생성.
	return a / b
}
