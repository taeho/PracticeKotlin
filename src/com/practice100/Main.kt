package com.practice100.ex_inner_class
// 내부클래스 inner class
// 중첩 클래스는 단순히 식별자만 바깥 클래스에 속해있지만,
// 내부클래스는 인스턴스가 바깥 클래스의 인스턴스에 완전히 소속된다.

class Outer(private val value: Int)	// value 프로퍼티와 print 멤버 함수를 갖는 Outer 클래스 선언
{
	fun print()	//
	{
		println(this.value)
	}

	inner class Inner(private val innerValue: Int)	// innerValue 프로퍼티와 print 멤버함수를 갖는 Inner내부 클래스 선언. 내부 클래스 선언시 inner 키워드 사용
	{
		fun print()
		{
			this@Outer.print() // 내부 클래스는 this@Outer 키워드를 이용하여 자신이 속한 바깥 클래스의 인스턴스에 접근가능. 반드시 "바깥클래스의 인스턴스.생성자()"로 생성
			// 출력: 610
			println(this.innerValue + this@Outer.value)	// 출력:650
		}
	}
}

fun main(args: Array<String>)
{
	val instance: Outer = Outer(610)	// Outer의 인스턴스를 생성
	val innerInstance: Outer.Inner = instance.Inner(40)	// Outer.Inner 의 인스턴스를 생성. "참조변수.생성자()" 내부클래스는 바깥클래스의 인스턴스로부터만 생성가능.
	innerInstance.print()	// innerInstance가 가리키는 객체의 print 멤버 함수 호출.  Outer.Inner의 print가 호출
}
