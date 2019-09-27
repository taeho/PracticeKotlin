package com.practice087.ex_extension_property
// 확장 프로퍼티 Extension Property
// 클래스 밖에서 프로퍼티를 선언 하는 방법

// 문자열이 숫자로만 이루어져있는지 판단하는 확장 프로퍼티
val String.isNumber: Boolean	// 확장 프로퍼티도 확장 함수 처럼 프로퍼티 이름 앞에 리시버타입 적는다.
	get()
	{
		var i = 0
		while (i < this.length)
		{
			// 숫자가 아닌 문자가 하나라도 들어있으면 false 반환
			if (!('0' <= this[i] && this[i] <= '9'))
				return false
			i += 1
		}
		// 모든 조건을 통과하면 true 반환
		return true
	}

fun main(args: Array<String>)
{
	println("1234567890".isNumber)
	println("500 원".isNumber)
}
