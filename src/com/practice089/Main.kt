package com.practice089.ex_companion_object
// 동반자 객체 Companion Object는 클래스 안에 포함되는 이름없는 객체
// 어떤 클래스의 모든 인스턴스가 공유하는 객체를 만들고 싶을 때 사용

class Person private constructor()	// fun create 함수를 통해서만 Person 객체 생성을 하기위해 접근 지정자를 private으로
{
	companion object	// 동반자 객체 정의, companion object라고만 적음
	{
		fun create(): Person	// Person의 인스턴스를 생성하는 멤버 함수
		{
			countCreated += 1
			return Person()	// 인스턴스를 반환하면서 지금까지 생성한 인스턴스 갯수 카운팅
		}

		var countCreated = 0	// 생성된 Person의 인스턴스를 집계하기 위한 프로퍼티. 외부에서 함부로값 조작 불가능을 위해
			private set			// Setter 접근 지정자를 private으로 지정.
	}
}

fun main(args: Array<String>)
{
	val a = Person.create()	// 동반자 객체는 자신이 속한 클래스의 이름으로 접근 가능.
	val b = Person.create()	// 즉 Person이라는 식별자는  Person클래스의 동반자 객체로 인식. 동반자 객체는 클래스당 한개만 존재
	println(Person.countCreated)	// 출력: 2, 동반자 객체의 create 멤버 함수로 Person의 인스턴스 생성, 지금까지 생성된 인스턴스 수 출력
	// 코틀린에서는 static 키워드가 존재 하지 않기때문에, 같은 효과는 동반자 객체 사용 필요
}
