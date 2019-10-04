package com.practice099.ex_nested_class
// 중첩 클래스 netsted Class, 클래스 안에 클래스를 선언

class Outer // 바깥 클래스, Outer 클래스 선언
{
	class Nested // 중첩 클래스, Outer 클래스 안에 Nested 클래스 선언
	{
		fun hello() = println("중첩된 클래스")
	}
}

fun main(args: Array<String>)
{
	val instance: Outer.Nested = Outer.Nested()	// 중첩 클래스는 타입 이름이 "바깥 클래스.중첩 클래스"로 만들어진다. 생성자도 마찬가지
	instance.hello()	// "중첩된 클래스" 출력 , 출력: 중첩된 클래스
}
