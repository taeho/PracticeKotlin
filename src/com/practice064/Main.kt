package com.practice064.ex_inheritance
// 상속 개념 : 기존에 존재하는 클래스를 확장하여 새로운 클래스를 정의하는 것

// name과 age 프로퍼티를 갖는 Person 클래스 정의, 슈퍼클래스 또는 슈퍼타입 라고도 한다.
open class Person(val name: String, val age: Int)
// 기본적으로 class는 상속이 막혀있어서, open 키워드를 붙여야만 가능.
// 코틀린은 자바와 달리 클래스 선언이 기본적으로 final 이기 때문.

// id 프로퍼티를 갖는 Student 클래스를 정의, 서브클래스 또는 서브타입이라고 한다.
// 오른쪽에는 땡땡 : Person(name, age) 잇는데, 이 부분이 상속하는 코드
// 상속할 때는 반드시 슈퍼클래스의 생성자를 호출해야 하기 때문에
//  Student 생성자 매개변수에 name과 age 추가하여 이를 Person 생성자에게 전달
class Student(name: String, age: Int, val id: Int) : Person(name, age)
// 혹시 Student도 상속하고 싶으면 open을 붙이면 된다. 상속제한은 없음.

fun main(args: Array<String>)
{
	val person = Person("홍길동", 35)	// Person 인스턴스 생성 
	val student = Student("김길동", 23, 20171217)	// Student 인스턴스 생성
}
