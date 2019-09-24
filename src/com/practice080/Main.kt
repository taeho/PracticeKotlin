package com.practice080.ex_is_operator


// 상속 예제의 Person, Student 클래스 재활용
import com.practice064.ex_inheritance.Person
import com.practice064.ex_inheritance.Student 

class Professor(name: String, age: Int) : Person(name, age)	// Person클래스를 상속하는 Professor클래스 선언

fun main(args: Array<String>)
{
	val person: Person = Student("Mark Zuckerberg", 33, 20171225)	// person 참조 변수에 Student의 인스턴스를 지정
	println(person is Person)	// is 연산자는 왼쪽 피연산자(참조변수)가 실제로 가리키고 있는 객체를 오른쪽 피연산자타입으로 가리킬수잇는지 여부조사,
					// person이 실제로 가리키고 있는 객체는 Student 타입 이고 Person 타입으로 가리킬수 있으므로 true 출력
	println(person is Student)// Student의 인스턴스는 당연히 Student 타입으로 가리킬수 없으므로 True
	println(person is Professor) // Student의 인스턴스는 Professor 타입으로 가리킬수없으므로 False

	val person2: Person = Professor("Kim", 48)	// person2 참조 변수에 Professor의 인스턴스를 지정하고 있다.
	println(person2 is Person)	// person2 참조 변수가 실제로 가리키고 있는 객체는 Professor타입. Professor 인스턴스는 Person 타입으로 가리킬수 있으므로 True
	println(person2 is Student) // Professor의 인스턴스는 Student 타입으로 가리킬수 없으므로 false가 출력
	println(person2 !is Professor) // !is는 is의 반대이다. Professor의 인스턴스는 Professor 타입으로 가리킬수 있으므로 false출력
}
// 코틀린의 is 연산자는 자바의 instanceof 에 해당한다.