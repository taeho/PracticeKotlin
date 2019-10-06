package com.practice101.ex_data_class
// 데이터 클래스 data Class, 데이터 특하된 클래스를 선언
// 이점, Any 클래스에 들어있는 equals, hashCode, toString 멤버 함수가 자동으로 오버라이딩.
// equals 멤버 함수는 각 프로퍼티의 값이 서로 모두 같으면 true, 하나라도 다르면 false 를 반환하게 오버라이딩
// toString 멤버함수는 Employee(name=..,age=...,salary=...) 형태로 문자열 반환하도록 오버라이딩
// 객체를 복사하는 copy함수가 자동으로 선언.

data class Employee(val name: String,
                    val age: Int,
                    val salary: Int)	// 데이터 클래스 선언하려면 클래스앞에 키워드 data 붙인다.

fun main(args: Array<String>)
{
	val first = Employee("John", 30, 3000)	// Employee 의 인스턴스를 생성
	val second = Employee("Page", 24, 5300)
	val third = first.copy()	// data 키워드 덕분에 자동으로 선언된 copy 멤버함수 호출.
	// copy 멤버 함수는 각 프로퍼티의 값을 그대로 복사한 새 인스턴스를 반환.
	// third 참조변수에 first 가 가리키는 인스턴스와 동일한 값을 갖는 인스턴스 저장.
	// 또한 first.copy(name="Jang")형식으로 원하는 프로퍼티만 다른값으로 지정한채 복사 가능.

	println(first.toString()) // data키워드덕분에 자동으로 오버라이딩된 toString 멤버 함수 호출, 출력: Employee(name=John, age=30, salary=3000)
	println(third.toString()) // 출력: Employee(name=John, age=30, salary=3000)
	println(first == second) // 출력: false	
	println(first == third) // 출력: true
}
// 데이터 클래스는 여려 편의 기능 제공하지만 그만큼 제약도 많다.
// 적어도 하나의 프로퍼티를 가져야 한다. 생성자 매개변수에는 반드시 var 이나 val을 같이 써야한다. 즉 프로퍼티에 대응하지 않는 생성자 매개변수를 가질수없다.
// abstract, open, sealed, inner 키워드를 붙일수 없다.
// 인터페이스만 구현가능.// component1, component2 와 같은 이름으로 멤버 함수 선언할수없다. 컴파일러가 내부적으로 사용하는이름이기때문.