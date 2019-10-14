package com.practice114.ex_inherit_from_generic
// 제네릭이 적용된 클래스/ 인터페이스 상속*구현하기

fun main(args: Array<String>)
{
	val rect = Rectangle(10, 5)	// Rectangle 인스턴스 한개 생성
	val rect2 = Rectangle(3, 8) // Rectangle 인스턴스 한개 또 생성

	println(rect + rect2)	// 출력: width: 13, height: 13
}
