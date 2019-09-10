package com.practice047.ex_class

// 클래스 : 모양이 같은 클래스를 위한 틀.

class Person
{
	var name: String = ""
	var age: Int = 0
}

fun main(args: Array<String>)
{
	val person: Person	// 클래스를 선언하면 클래스와 동일한 특수함수 선언, 초기화를 하지 않으면 접근 오류
	person = Person()	//클래스를 선언하면 클래스이름과 동일한 특수함수 선언.
	person.name = "홍길동"
	person.age = 36

	val person2 = Person()
	person.name = "김미영"	// 클래스로부터 생성된 객체는 인스턴스라고도함. 즉 틀로 부터 구체적으로 만들어지기때문
	person.age = 29

	val person3 = Person()
	person.name = "John"
	person.age = 52
}
