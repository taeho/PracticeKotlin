package com.practice104.ex_anonymous_function
// 익명 함수 Anonymous Function
// 함수 리터럴을 작성하는 또 다른 방법인 익명함수 

fun main(args: Array<String>)
{
	val instantFunc: (Int) -> Unit
	instantFunc = fun(number: Int): Unit	// 익명함수Anonymou Function 형태 , 함수 이름이 없는 것 빼고  일반 함수와 형태가 거의 동일
	{
		println("Hello $number")	// 람다식보다 복잡하지만 return으로 반환값을 직접 지정 가능.
	}

	instantFunc(33)
	instantFunc.invoke(33)
}
