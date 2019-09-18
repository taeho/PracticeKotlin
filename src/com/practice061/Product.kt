package com.practice061.ex_invoke_operator
// 호출 연산자 invoke operator ()

// ()는 함수를 호출 할 때 사용하는 연산자 이다. 코틀린에서는 이 연산자도 오버로딩 가능
class Product(val id: Int, val name: String)
{
	// () 연산자를 오버로딩하는 멤버 함수 invoke 선언, 여기서는 인수1개지만 개수제한없음.또는 생략가능
	operator fun invoke(value: Int)
	{
		println(value)
		println("id: $id\nname: $name")
	}
}
