package com.practice078.ex_elvis_operator
// 엘비스연산자 Elvis Operator ?:, 특정값이 null 일때 다른값으로 대체하는 연산자
// 엘비스 연산자는 왼쪽의 피연산자가 null 이 아니면 그 값을 그대로 쓰고, null 이면 우측의 피연산자로 대체하는 매우 유용

fun main(args: Array<String>)
{
	val number: Int? = null	// Int? 타입의 참조변수 number에 null을 지정
	println(number ?: 0)	// number 타입에 null이 지정되어 있으므로 오른쪽 피연산자 0 출력

	val number2: Int? = 15	// Int? 타입의 참조변수 number2에 15저장, 15는 heap 저장되는것이다.
	println(number2 ?: 0)	// number2는 null 지정 아니므로, 15 출력
}
