package com.practice065.ex_upcasting
// 업캐스팅 upcasting
// 캐스팅casting: 또는 형변환이란, 특정 타입을 다른 타입으로 변환하는 것.

open class Person(val name: String, val age: Int)

class Student(name: String, age: Int, val id: Int) : Person(name, age)

fun main(args: Array<String>)
{
	// Student 인스턴스 생성하고, Person 타입의 참조변수로 가리키고 있다.
	// Student 클래스는 Person 클래스의 모든 프로퍼티와 멤버함수를 포함하기 때문에 가능.
	// 이렇게 서브클래스의 인스턴스를 슈퍼 클래스 타입으로 가리키는 것을 업캐스팅Upcasting 이라고 한다.
	// 스택영역: main함수[args > person]
	// 힙 영역: name: John, age:32, id: 20171218
	val person: Person = Student("John", 32, 20171218)
	// 슈퍼클래스 타입은 항상 슈퍼클래스 자체나 서브클래스의 인스턴스만 가리킬수 잇다.
}
