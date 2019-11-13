package com.practice200
// ex_kotlin_to_java_companion_object
// 200 자바에서 코틀린 코드 접근하기: 동반자 객체

class KotlinClass
{
	companion object
	{
		var num = 0

		fun hello() = println("Hello")
	}
}
