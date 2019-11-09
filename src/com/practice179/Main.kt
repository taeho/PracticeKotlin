package com.practice179.ex_nullable_string_plus
// 179 String?plus 연산자 확장 함수
// 값이 null 인 String 타입 표현식에도 + 연산자를 사용할 수 있다.

fun main(args: Array<String>)
{
	val nullStr: String? = null	// nullStr 변수에 null 저장
	println(nullStr + "테스트")	// 출력: null테스트	// nullStr은 String 타입이므로,
	//+ 연산자를 사용하면 String 클래스의 plus 연산자 멤버함수가 아닌 String?.plus 연산자 확장 함수 호출 

}
