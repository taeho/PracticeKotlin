package com.practice070.ex_any_class
// Any 클래스. 모든 클래스가 상속한다.
// Any 클래스 <---상속--- Number, String, Person, Building, Product
// Any 클래스에서는 equals, hashCode, toString 세가지 멤버 함수가 있다.
// open operator fun equals(other: Any?):Boolean : == 연산자를 오버로딩하는 함수
// open fun hashCode(): Int : 객체 고유의 해시코드를 반환
// open fun toString(): String : 객체 내용을 String 타입으로 변환하는 함수

fun main(args: Array<String>)
{
	val building = Building("코틀린", area = 100)	// Building 인스턴스 생성
	printObject(building)	// Any 타입을 매개변수로 받는 printObject 함수에 building 객체 인수로 전달
}

fun printObject(any: Any)
{
	println(any.toString())	// 코드상으로는 Any 타입의 toString 멤버 함수 호출, 실제로는 다형성 덕에 building 객체의 toString 호출.
}
