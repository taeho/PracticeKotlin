package com.practice045.ex_object
// 객체 란.. 구별가능한 속성.
// 서로 관련 잇는 변수를 하나로 묶는 방법

fun main(args: Array<String>)
{
	val person = object	// person 변수에 object 저장.
	{	// 중괄호 사이에 변수선언 시작
		val name: String = "홍길동"	// 변수를 프로퍼티 property라고한다.
		val age: Int = 36			// 속성이라고도 한다. 반드시 선언과 동시에 반드시 초기화 해야한다.
	}

	println(person.name)
	println(person.age)
}
