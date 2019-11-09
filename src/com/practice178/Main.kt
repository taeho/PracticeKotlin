package com.practice178.ex_nullable_to_string
// 178 Any?toString 확장 함수
// Any?.toString은, 값이 null 인 표현식에도 toString을 호출할수있게 해주는 유용한 함수

fun main(args: Array<String>)
{
	val empty: Int? = null	// empty 변수에는 null 이 저장 
	val str: String = empty.toString()	// empty 변수의 타입이 Nullable 이기 때문에, Int 클래스의 멤버 함수 toString이 아닌 Any?.toString 확장 함수 호출.
	println(str)	// 출력: null 
}
