package com.practice094.ex_extension_function_companion_object
// 동반자 객체의 확장 함수 , Companion 식별자를 이용하여 동반자 객체에도 확장함수를 달수있다.

// 확장 함수를 다음과 같이 선언하면 동반자 객체에도 확장함수를 달수있다.
// fun 클래스 이름.Companion.함수 이름() {}
// 동반자 객체는 클래스 이름만으로 접근할 수 있지만, 확장 함수를 선언할 때 그렇게 하면, 동반자 객체가 아닌 클래스 자체에 멤버함수가 추가된다.
// 반드시 Companion 식별자를 추가해야한다.
class Person
{
	companion object	// 동반자 객체에 확장 함수를 주입하기 위해 빈 동반자 객체를 정의했다.동반자 객체도 내용이 비어 있으면 중괄호를 생략할 수 있다.
}

fun Person.Companion.create(): Person
{
	return Person()	// 동반자 객체에 crate 함수를 주입하고 있다.
}

fun main(args: Array<String>)
{
	Person.create()	// Person 클래스의 동반자 객체에 주입된 create 함수를 호출하고 있다.
}
