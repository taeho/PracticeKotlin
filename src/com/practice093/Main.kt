package com.practice093.ex_nullable_receiver
// nullable 리시버, 확장 함수를 응용하면, 참조변수에 null이 지정되어잇어도 함수호출가능

fun String?.isNumber()	// 리시버 타입에 ? 붙어잇다. 이것이 nullable 리시버
{
	if (this == null)
		println("문자열이 null입니다.")
}

fun main(args: Array<String>)
{
	val empty: String? = null	// empty는 String? 타입이고, null 이 지정되어 있다.
	empty.isNumber()	// isNumber 확장 함수의 리시버 타입이 Nullable 이기에, 표현식의 값이 null 이라도 isNullable 확장함수 호출가능
}
