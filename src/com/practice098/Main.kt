package com.practice098.ex_the_diamond_problem
// 다이아몬드 문제?
// 인터페이스를 여러개 상속할때...

interface Parent { fun follow(): Unit }

interface Mother : Parent
{
	override fun follow() = println("follow his mother")
}

interface Father : Parent
{
	override fun follow() = println("follow his father")
}

class Child : Mother, Father
{
	override fun follow()
	{
		println("A child decide to ")
		super<Mother>.follow()	// <>로 호출할 super 멤버 함수를 지정
	}
}

fun main(args: Array<String>)
{
	Child().follow()	// child의 인스턴스를 생성하고 곧 바로 follow 멤버 함수를 호출 하고 있습니다.
	// 출력 : A child decide to 
	// 출력: follow his mother
}
