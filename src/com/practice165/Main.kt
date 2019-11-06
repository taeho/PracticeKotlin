package com.practice165.ex_lazy_function
// lazy 함수: 게으른 초기화를 하는 프로퍼티 대리자
// lazy 함수를 이용하면 프로퍼티의 값이 필요한 시점에 계산을 시작하게 할 수 있다.
// public actual fun <T> lazy(initializer: () -> T): Lazy<T> = SynchronizedLazyImpl(initializer)
// () -> T 타입의 함수를 받는다. num2 에 저장할 값을 반환하는 함수를 initializer에 넘겨주면된다.
// 반환타입 Lazy<T> 는 프로퍼티를 대리하는 클래스 

class AAA
{
	var num: Int = 0
	val num2 by lazy { num * 5 }	// num2 프로퍼티의 대리자로 lazy{ num * 5 }를 지정
}

fun main(args: Array<String>)
{
	val one = AAA()
	println(one.num2)	// 출력: 0	// one.num2에 접근하는 순간, num*5가 실행. 이 시점에서는 num이 0이니까 0초기화 출력
	one.num = 10		// num 프로퍼티를 수정
	println(one.num2)	// 출력: 0	// num2는 초기화되었으므로 {num*5}이 더이상실행되지 않고 저장된 0이 출력

	val two = AAA()
	two.num = 4	
	println(two.num2)	// 출력: 20	// two.num2 에 접근하는 순간 {num*5}이 실행.. 이시점에는 num이 4로 되있다. num2의 값은 20
}
