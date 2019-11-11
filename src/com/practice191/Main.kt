package com.practice191
//package ex_java_to_kotlin_null_safety
// 191 코틀린에서 자바 코드 접근하기: Null 안전성
// 자바의 참조 타입을 코틀린으로 불러오면 타입 이름뒤에 느낌표가 붙는다. String! 처럼.
// 타입 이름뒤에 ! 느낌표는 이 타입이 Nullable 인지, Not-Null 인지 알수 없다는 뜻.
// 자바의 참조 타입은 무조건 null을 허용하기 때문에 이런일이 발생.

class KotlinClass : JavaInterface
{
	override fun trim(str: String?): String =	// String! 타입은 String? 이나 String으로 적을수있다. 일반적으로 String? 으로 적어주는 것이 안전
			str?.trim() ?: ""					// 
}

fun main(args: Array<String>)
{
	val javaInterface: JavaInterface = KotlinClass()
	println(javaInterface.trim("  hi  "))
}
