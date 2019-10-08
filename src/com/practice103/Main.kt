package com.practice103.ex_lambda_expression
// 함수 리터널Function Literal과 람다식Lambda Expression
// fun 키워드가 아닌 더 간단한 함수 만드는 법

fun main(args: Array<String>)
{
	val instantFunc: (Int) -> Unit	// (Int) -> Unit은 매개변수가 Int 타입이고, 반환타입이 Unit인 함수를 저장할수있는 타입, 이런 타입을 함수 타입 Function Type이라고함
	// 함수 리터럴Function Literal, 함수를 나타내는 리터럴
	instantFunc = { number: Int ->	// number: Int 부분은 함수 리터럴의 매개변수를 나타낸다. -> 를 경계로, 매개변수와 함수의 내용이 분리. 매개변수 없는 함수 리터럴을 만들고 싶으면  [ number: Int ->] 부분 없이 함수의 내용만.
		println("Hello $number")	// 함수에는 return을 적지 않는다. 함수리터럴의 반환값은 함수 내용의 맨 마지막 표현식. 
	}

	instantFunc(33)	// instantFunc 참조 변수가 가리키는 함수 호출, 출력: Hello 33
	instantFunc.invoke(33)	// 함수 타입의 변수는 invoke 멤버 함수를 통해서도 호출 가능.
	// 변수가 Nullable 일 때는 invoke 를 통해서 호출하는 편이 instantFunc?.invoke(33) 과 같이 쓸수있으므로 Null 처리 편해진다.  출력: Hello 33
}
// kotlin 에서는 함수리터럴을 두가지 형태로 만들수있다. 이번에 배운 {매개변수->반환값}형태식 중 하나이며, 이를 람다식 Lambda Expression 이라고 부른다.