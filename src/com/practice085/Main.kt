package com.practice085.ex_access_modifier_overriding
// 접근 지정자 오버라이딩
// 오버라이딩을 통해 protected인 프로퍼티나 멤버 함수의 접근 지정자를 public 으로 변경할 수잇다.

open class AAA(protected open val number: Int)	// protected 프로퍼티 number를 갖는 AAA 클래스 선언. 오버라이딩가능하게 앞에 open 키워드사용
{
	protected open fun hello()	// protected 멤버함수 hello 선언. 오버라이딩 가능하게 open 키워드 사용
	{
		println("hello")
	}
}

class BBB(number: Int) : AAA(number)
{
	public override val number: Int	// number 프로퍼티를 오버라이딩 하면서 접근 지정자를 public으로 바꾸고 잇다.
		get() = super.number

	public override fun hello() = super.hello()
}

fun main(args: Array<String>)
{
	val b = BBB(26)	// 동일한 BBB의 인스턴스를 AAA타입과 BBB타입으로 가리키고있다.
	val a: AAA = b

//	println(a.number) // 에러, a는 AAA 타입이므로 protected 인 number 프로퍼티에 접근하면 오류 발생
//	a.hello() // 에러, a는 AAA타입이므로 protected 인 hello  멤버 함수에 접근하면 오류 발생
	println(b.number)	// b는 BBB 타입이므로 public 으로 오버라이딩 된 number, 26 출력
	b.hello()	// b 는 BBB 타입이므로 public으로 오버라이딩 된 hello 멤버 함수에 접근 가능. hello 출력
}
