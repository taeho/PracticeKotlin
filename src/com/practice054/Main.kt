package com.practice054.ex_constructor
// 객체를 생성과 동시에 원하는 값으로 초기화
class Person constructor(name: String, age: Int)	// 생성자 정의. constructor 키워드는 생략가능
{
	val name: String	// val 프로퍼티 선언, 초기화 하지 않음
	val age:Int

	init	// 생성자 매개변수 init는 초기화initialize Block의 약자
	{		// init 블록안에서 프로퍼티를 초기화하면 프로퍼티를 선언과 동시에 초기화하지 않아도 된다.
		this.name = name
		this.age = age
	}
}

fun main(args: Array<String>)
{
	val person = Person("홍길동", 46)	//생성자를 정의하지 않으면 매개변수가 없는 기본 생성자 자동 생성. 여기서는 String과 int로 생성자를 호출하면서 생성
	println("이름: ${person.name}")	// 출력: 이름: 홍길동
	println("나이: ${person.age}")	// 출력: 나이: 46
}
