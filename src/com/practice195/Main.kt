package com.practice195
//package ex_java_to_kotlin_operator_overloading
// 195 코틀린에서 자바 코드 접근하기: 연산자 오버로딩

fun main(args: Array<String>)
{
	val java = JavaClass()

	println(13 in java)	// 출력: true		// JavaClass 클래스의 contains 메서드가 호출된다.
	println(java[13])	// 출력: 80		// JavaClass 클래스의 get메서드 호출
	println(java[28])	// 출력: 80		// JavaClass 클래스의 get메서드 호출
	println(java[18])	// 출력: 80		// JavaClass 클래스의 get메서드 호출
}
