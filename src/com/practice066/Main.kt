package com.practice066.ex_overriding
// 오버라이딩: 슈퍼클래스의 멤버함수와 시그니처가 동일한 함수를 서브클래스에서 선언하면,
// 슈퍼클래스 멤버함수의 동작을 덮어쓰기 할 수 있다. 이게 overriding

// func라는 멤버함수를 가지고 있는 클래스 AAA 선언.
open class AAA	// 오버라이딩 허용을 하려면 open 키워드사용 
{
	open fun func() = println("AAA")
}

class BBB : AAA()	// AAA클래스를 상속하는 BBB클래스 선언
{
	// 오버라이딩할때는 반드시 override 키워드 붙여야한다.
	override fun func()	// 오버라이딩을 위해 AAA 클래스의 func 멤버함수와 시그니처가 동일한 멤버함수 선언
	{
		super.func()	// this가 자기 자신의 이름을 나타내는 대표면, super는 슈퍼클래스의 이름을 나타내는 대명사
		println("BBB")
	}
}

fun main(args: Array<String>)
{
	AAA().func()	// AAA 인스턴스를 생성하자 마자 멤버함수 func() 호출, AAA가 출력
	BBB().func()	// BBB 인스턴스를 생성하자 마자 멤버함수 func() 호출, 오버라이딩 햇으니 BBB의 func 함수 호출
	// BBB func 안에는 super.func()가 잇으므로. AAA의 func 호출. 출력은 AAA 먼저 그리고 BBB
}
