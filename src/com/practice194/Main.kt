package com.practice194
//package ex_java_to_kotlin_getter_setter
// 194 코틀린에서 자바 코드 접근하기: Getter/Setter

fun main(args: Array<String>)
{
	val java = JavaClass()	// 자바 클래스의 인스턴스를 생성하고 있다.

	java.something = 301	//  자바에 get , set 으로 시작하는 메서드는 코틀린에서 프로퍼티로 접근이 가능
	println(java.something)	// 출력: 301

	println(java.isGood)	// 출력: true // is 로 시작하고 , 반환타입이 boolean 인 메서드는 코틀린에서 프로퍼티로 접근가능
	println(java.doubleValue)	// 출력: 3.14 	// 자바클래스의 getter만 있어도 코틀린에서 프로퍼티로 접근가능
}
