package com.practice106.ex_function_reference
// 함수 참조 Function Reference
// 함수 타입의 변수는 이미 선언 되어 있는 함수나 객체의 멤버 함수를 가리킬수도있다.

fun plus(a: Int, b: Int)	//매개변수 타입이 (Int, Int)이고, 반환타입이 Unit인 함수를 선언
{
	println("plus 호출됨 ${a + b}")
}

object Object
{
	fun minus(a: Int, b: Int)	//매개변수 타입이 (Int, Int)이고, 반환타입이 Unit인 객체의 멤버 함수를 선언
	{
		println("Object의 minus 호출됨 ${a - b}")
	}
}

class Class
{
	fun average(a: Int, b: Int)	//매개변수 타입이 (Int, Int)이고, 반환타입이 Unit이 클래스의 멤버 함수를 선언
	{
		println("Class average 호출됨 ${(a + b) / 2}")
	}
}

fun main(args: Array<String>)
{
	var instantFunc: (Int, Int) -> Unit	//  (Int, Int) -> Unit함수 타입의 참조변수 instantFunc 를 선언
	instantFunc = ::plus // 함수 plus의 참조값을 instantFunc 참조 변수에 저장, 함수 앞에 ::를 붙이면, 표현식의 값은 그 함수의 참조값이 되며, 타입은 그 함수의 시그니처에 맞는 함수타입이 된다.
	// 여기서 plus 함수 앞에  ::를 붙였으므로 , ::plus는 (Int, Int) -> Unit의 표현식
	instantFunc(60, 27) // instantFunc 참조 변수가 가리키는 함수를 호출, plus 호출됨 87이 출력

	instantFunc = Object::minus	// 객체의 멤버 함수를 instantFunc 참조변수에 대입. 객체의 멤버 함수를 함수 타입의 표현식으로 바꾸려면 참조변수::멤버함수 의 꼴로 적는다.
	instantFunc(36, 12)	// instantFunc 참조 변수가 가리키는 함수를 호출, minus 호출된 24 출력

	instantFunc = Class()::average	// 클래스의 인스턴스 멤버 함수를 instantFunc 참조 변수에 대입하고 있다. 객체의 멤버 함수만 함수 타입으로 만들수잇기때문에 인스턴스 생성후 :: 사용
	instantFunc(25, 15)	// instantFunc 참조 변수가 가리키는 함수를 호출, Class average 호출됨 20이 출력
}
