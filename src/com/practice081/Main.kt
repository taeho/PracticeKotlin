package com.practice081.ex_downcasting
// as 연산자와 다운캐스팅
// 다운캐스팅은 업캐스팅과는 반대로 슈퍼클래스 타입을 서브클래스 타입으로 받는 것

// 업캐스팅 예제의 Person, Student 클래스 재활용
import com.practice065.ex_upcasting.Person
import com.practice065.ex_upcasting.Student

fun main(args: Array<String>)
{
	val person: Person = Student("John", 32, 20171218)	// Person 타입의 person 참조 변수에 갓 생성한 Student의 인스턴스 지정
	val person2: Person = Person("Jack", 29)	// 

	// as 연산자는 왼쪽 피연산자(참조변수)의 타입을 오른쪽 피연산자(타입)으로 캐스팅
	var person3: Student = person as Student	// person 참조 변수가 가리키고 있는 객체는 Student타입이므로 캐스팅
	person3 = person2 as Student	// person2 참조 변수를 Student 타입으로 캐스팅하고 있다. person2 참조 변수는 Person 의 인스턴스를 가리키고 있다.
	// 그래서 ClassCastException 예외 발생
	
	// 캐스팅에 실패햇을때 예외가 발생하는 것을 막고 싶으면 as? 연사자를 대신 사용해야한다.
	// as? 연산자는 캐스팅에 실패하면 null 을 돌려준다.
}
