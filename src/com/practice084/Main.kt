package com.practice084.ex_access_modifier_protected
//protected 접근 지정자. 클래스 내부에서 사용

open class AAA(protected val number: Int) // AAA 클래스 상속이 가능하게 선언, number 프로퍼티에 protected 지정

class BBB(number: Int) : AAA(number)	// AAA클래스를 상속하는 BBB 클래스 선언
{
	fun printNumber()
	{
		// AAA 클래스의 number 프로퍼티에 접근 가능
		println(number) // 
	}
}

fun main(args: Array<String>)
{
	val test = BBB(36)
//	println(test.number) 에러, protected 프로퍼티인 number 는 접근 불가
	test.printNumber()	// public은 호출가능, 출력: 36
}
