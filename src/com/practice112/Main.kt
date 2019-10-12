package com.practice112.ex_reified_type_parameter
// 구체화된Reified 타입 매개변수

// 타입 매개변수는 is 연산자의 피연사자로 사용할 수 없다.
// 타입 매개변수를 is 연산자의 피연산자로 사용하고 싶은경우 아래와같이...
inline fun <reified T> check()	//	타입 매개변수 앞에 reified를 붙여주면 해당 타입 매개변수를 in연산자에 사용할수 있다.
{								// 타입 매개변수에 reifeid를 붙이려면 함수를 반드시 inline으로 선언해야한다.
	val number = 0
	if (number is T)	
		println("T는 Int 타입 입니다.")
}

fun main(args: Array<String>)
{
	check<Int>()	// check 함수 호출, 출력: T는 Int 타입 입니다.
}
