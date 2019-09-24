package com.practice079.ex_smart_casts
// 스마트 캐스팅 : 코드 문맥에 따라 자동으로 일어나는 캐스팅
// 특정조건을 만족하는 경우, 컴파일러는 변수의 타입을 다른 타입으로 자동 캐스팅한다ㄴ

fun main(args: Array<String>)
{
	val number: Int? = null	// number 타입에는 null을 지정
	val number2 = 1225		// number2 타입에는 1225을 지정 

	checkNull(number)	// checkNull 함수에 number 전달
	checkNull(number2)
}

fun checkNull(any: Any?)
{
	if (any == null)	//any 가 null 인지 검사한다. 
	{
		println("null이 들어왔습니다.")
		return
	}

	println(any.toString())	// null 이 아닌경우 해당 변수는 자동으로 Not-null 타입이 된다.
	// 그래서 any?.toString() 이 아닌 any.toString() 이 된다.
}
