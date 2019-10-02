package com.practice095.ex_extension_function_inherit_relation
// 확장 함수의 리시버 타입이 상속 관계에 있을 때, 실제 어떤 타입 함수 호출?

// AAA 클래스와 BBB클래스는 상속관계이다.
open class AAA
class BBB : AAA()

fun AAA.hello()
{
	println("AAA")	//	AAA클래스에 확장함수 hello를 주입하고 있다.
}

fun BBB.hello()
{
	println("BBB")	// BBB 클래스에 확장 함수 hello 를 주입하고 있다.
}

fun main(args: Array<String>)
{
	val test: AAA = BBB()	// 타입은 AAA이나, 실제로 BBB 객체를 가리키는 test 참조 변수 선언
	test.hello() // 여기서 AAA.hello가 호출될까 BBB.hello가 호출될까? 정답은 AAA.hello
}	// 확장함수는 멤버함수와 다르게 참조변수가 실제로 가리키는 객체의 타입을 따르지 않고. 참조변수 의 타입을 그대로 따른다.
