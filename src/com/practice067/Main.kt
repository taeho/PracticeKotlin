package com.practice067.ex_overriding_property
// 프로퍼티를 오버라이딩 하기

open class AAA	// 프로퍼티 오버라이딩을 위한 open 키워드 사용 
{
	open var number = 10
		get() // number 프로퍼티의 getter 커스터마이징
		{
			println("AAA number Getter 호출됨")
			return field
		}
		set(value)
		{
			println("AAA number Setter 호출됨")
			field = value
		}
}

class BBB : AAA()
{
	override var number: Int	// AAA 클래스의 number 프로퍼티를 오버라이딩, 할때 overrrid 키워드 필요
		get()
		{
			println("BBB number Getter 호출됨")
			return super.number		// super.number같이 하면 슈퍼클래스인 AAA클래스의 number 프로퍼티의 getter 호출
		}
		set(value)
		{
			println("BBB number Setter 호출됨")
			super.number = value	// super.number = 표현식 같이 하면 슈퍼클래스인 AAA클래스의 number 프로퍼티의 Setter 호출
		}
}

fun main(args: Array<String>)
{
	val test = BBB()	// BBB 인스턴스 생성
	test.number = 5		// BBB클래스에서 오버라이딩 한 number 프로퍼티의 Setter 호출
	test.number			// BBB클래스에서 오버라이딩 한 number 프로퍼티의 Getter 호출
}
