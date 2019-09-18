package com.practice060.ex_indexed_access_operator
// 번호 붙은 접근 연산자 [] 

class Person(var name: String, var birthday: String)
{
	// [] 연산자를 오버로딩하는 멤버 함수 get 선언, position에 해당하는 위치의 프로퍼티 값을 반환 하도록
	operator fun get(position: Int): String
	{
		return when (position) {
			0 -> name
			1 -> birthday
			else -> "알 수 없음"
		}
	}

	// [] 연산자를 오버로딩 하는 멤버 함수 set 선언, position에 해당하는 위치의 프로퍼티 값을 value로 변경
	operator fun set(position: Int, value: String)
	{
		when (position)
		{
			0 -> name = value
			1 -> birthday = value
		}
	}
}
