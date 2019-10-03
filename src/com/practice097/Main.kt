package com.practice097.ex_interface
// 인터페이스: 클래스에 어떤 멤버 함수와 프로퍼티가 반드시 존재한다는 것을 보장하기위한 장치

interface Printable	// 인터페이스 선언, class 키워드 대신 interface 키워드 사용하면 인터페이스 선언
{
	fun print(): Unit	// Printable 인터페이스 안에 print 멤버 함수가 들어있다. 인터페이스의 멤버함수는 내용이 비어잇으므로 자동으로 abstract가 붙는다.
}

class AAA : Printable	// AAA클래스가 Printable 인터페이스를 구현하고 있다. 인터페이스에는 생성자가 존재하지 않기 때문에 상속할때 이름옆에 ()를 쓰지 않는다. 
{						// 또한 인터페이스는 한번에 하나만 상속할수 잇는 클래스와 다르게 여러개 구현가능.
	override fun print()	// Printable 인터페이스 안에는 추상 멤버 함수가 들어 있으므로, 이들을 반드시 모두 오버라이딩 해야 한다.
	{						// Printable 인터페이스의 추상 멤버함수 print를 오버라이딩하고 있다.
		println("Hello")
	}
}

fun print(anything: Printable)	// Printable 타입의 인수를 받는 print 함수를 선언
{
	anything.print()	// 매개 변수 타입이 Printable 이므로 그 매개변수가 가리키는 객체에 print 함수가 들어가 잇다는 것을 항상 보장
}

fun main(args: Array<String>)
{
	print(AAA())	// 출력: Hello, print함수에 AAA객체를 전달하고 잇다, AAA  클래스는 Printable 인터페이스를 구현하므로 AAA 객체를Printable 타입으로 가리킬수잇다.
}
