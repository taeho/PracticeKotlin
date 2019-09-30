package com.practice088.ex_object_declaration
// 객체 선언, 프로그램 전체 객체 공유

// val person: Person = Person  도 가능, 선언된 객체에는 open키워드 붙일 수 없다.
// object 키워드는 자바의 싱글톤 패턴 코드 와 같다. 
object Person	// 클래스 선언하듯, 객체 선언. Person이라는 식별자로 객체에 바로 접근
{
	var name: String = ""
	var age: Int = 0
	fun print()
	{
		println(name)	// 출력: Singleton
		println(age)	// 출력: 45
	}
}

fun main(args: Array<String>)
{
	// 식별자 Person으로 객체에 바로 접근 가능
	Person.name = "Singleton"
	Person.age = 45
	Person.print()
}
