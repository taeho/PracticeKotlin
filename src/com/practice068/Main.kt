package com.practice068.ex_polymorphism
// 다형성 polymorphism 활용

open class AAA
{
	open fun hello() = println("AAA 입니다.")
}

class BBB : AAA()
{
	override fun hello() = println("BBB 입니다.")
}

fun main(args: Array<String>)
{
	val one = AAA()	// one 참조 변수에 AAA 인스턴스 저장
	val two = BBB() // two 참조 변수에 BBB 인스턴스 저장
	val three: AAA = two	// three 참조변수에는 two에 저장된 BBB인스턴스 저장

	one.hello()	// 출력: AAA 입니다.
	two.hello() // 출력: BBB 입니다.
	three.hello() // 출력: BBB 입니다.
}
