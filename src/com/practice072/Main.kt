package com.practice072.ex_exception_handling
// 예외 처리

fun main(args: Array<String>)
{
	try
	{
		val str = "abcd"
		val num = str.toInt()

		println(num)
	}
	catch (e: NumberFormatException)	// try 블록 아래, 예외 발생시 실행할 코드 catch 
	{	// e 예외 객체를 가리키는 참조변수, NumberFormatException 은 예외 타입이다
		println("문자열을 숫자로 변경하지 못함")	// 출력: 문자열을 숫자로 변경하지 못함
	}
	finally
	{
		println("프로그램 종료")		// 출력: 프로그램 종료
	}
}
