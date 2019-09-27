package com.practice086.ex_extension_function
// 확장 함수 Extension Function, 클래스 밖에서 멤버 함수를 선언하는 방법?
// String은 코틀린 내장함수니까 맘대로 멤버함수 추가 불가.
// String 클래스 상속하려면 open 키워드가 붙어있지 않아 불가능.
// 확장 함수 문법은 상속없이 클래스 외부에서 멤버함수 추가가능

// 문자열이 숫자로만 이루어져있는지 판단하는 확장 함수
fun String.isNumber(): Boolean // 확장함수를 선언하는 것은 간단. 함수이름 앞에 " 함수를 주입할 클래스"를 붙여주면 된다. 여기서는 함수를 주입할 클래스를 리시버 타입이라 부른다.
{
	var i = 0
	while (i < this.length)	// this를 사용하면 리시버 타입의 프로퍼티나 멤버 함수에 접근 가능. 단, private 이거나 protected 멤버는 불가능.
	{
		// 숫자가 아닌 문자가 하나라도 들어있으면 false 반환
		if (!('0' <= this[i] && this[i] <= '9'))	// 숫자는 유티코드에 '0', '1', '2' ..'9'순으로 정의. <= 연산자로 문자열의 i번째 문자가 범위잇는지 검사
			return false
		i += 1
	}
	// 모든 조건을 통과하면 true 반환
	return true
}

fun main(args: Array<String>)
{
	println("1234567890".isNumber())	//출력: true, isNumber 확장 함수는 마치 String의 멤버 함수인것 처럼 호출.
	println("500 원".isNumber())	// 출력: false
}
