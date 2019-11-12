package com.practice196
//package ex_java_to_kotlin_class_reference
// 196 코틀린에서 자바 코드 접근하기: 클래스 참조

fun main(args: Array<String>)
{
	val number: Int = 26
	val str: String = "2018년"

	JavaClass.printClassInfo(number::class.java)	// 출력: int		// 인스턴스 뒤에 ::class.java를 적으면, 자바와 호환되는 Class<T> 타입의 객체를 가져온다.
	JavaClass.printClassInfo(str::class.java)		// 출력:	java.lang.String	// 
	JavaClass.printClassInfo(Double::class.java)	// 출력: double	// 클래스 이름 뒤에도 ::class.java를 적을수 있다. 
}
